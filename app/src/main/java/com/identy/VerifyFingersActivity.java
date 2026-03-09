package com.identy;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
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
public class VerifyFingersActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static byte[] getCaptureTime;
    private static int getFingerPrintQualityScore;
    private static int getNfiq1Score;
    private static int getOveralTimetaken;
    private static short[] getProcessingTime;
    private static int getScore;
    private static int valueOf;
    protected HashMap values = new HashMap();
    int PngjBadCrcException = 0;

    public class PngjBadCrcException implements org.cameracontroller.PngjBadSignature.values {
        private /* synthetic */ FingerMatchSecLevel PngjBadSignature;
        private /* synthetic */ long PngjException;
        private /* synthetic */ HashMap valueOf;
        private /* synthetic */ HashMap values;

        /* renamed from: com.identy.VerifyFingersActivity$PngjBadCrcException$PngjBadCrcException, reason: collision with other inner class name */
        public class DialogInterfaceOnDismissListenerC0017PngjBadCrcException implements DialogInterface.OnDismissListener {
            public DialogInterfaceOnDismissListenerC0017PngjBadCrcException() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                VerifyFingersActivity verifyFingersActivity = VerifyFingersActivity.this;
                verifyFingersActivity.values((Pair<Hand, Finger>[]) verifyFingersActivity.onErrorResponse.PngjExceptionInternal());
            }
        }

        public PngjBadCrcException(HashMap hashMap, FingerMatchSecLevel fingerMatchSecLevel, long j, HashMap hashMap2) {
            this.values = hashMap;
            this.PngjBadSignature = fingerMatchSecLevel;
            this.PngjException = j;
            this.valueOf = hashMap2;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x020b A[Catch: Exception -> 0x028a, TryCatch #2 {Exception -> 0x028a, blocks: (B:53:0x01ca, B:55:0x01d2, B:56:0x01d6, B:58:0x01dc, B:59:0x01de, B:61:0x01e6, B:65:0x01f2, B:67:0x0201, B:69:0x020b, B:71:0x0224, B:73:0x022e, B:75:0x0236, B:76:0x026d, B:78:0x0244, B:80:0x024c, B:81:0x025a, B:82:0x0275, B:84:0x027f, B:86:0x0285), top: B:52:0x01ca }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0224 A[Catch: Exception -> 0x028a, TryCatch #2 {Exception -> 0x028a, blocks: (B:53:0x01ca, B:55:0x01d2, B:56:0x01d6, B:58:0x01dc, B:59:0x01de, B:61:0x01e6, B:65:0x01f2, B:67:0x0201, B:69:0x020b, B:71:0x0224, B:73:0x022e, B:75:0x0236, B:76:0x026d, B:78:0x0244, B:80:0x024c, B:81:0x025a, B:82:0x0275, B:84:0x027f, B:86:0x0285), top: B:52:0x01ca }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.identy.b.PngjBadSignature.values
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void values() {
            VerifyResult verifyResult;
            int i;
            e1 e1Var;
            valueOf valueof;
            VerifyResult verifyResult2;
            IdentySdk identySdk;
            FingerDetectionMode fingerDetectionMode;
            int i2;
            HashMap hashMap;
            long j;
            long j2;
            VerifyFingersActivity verifyFingersActivity = VerifyFingersActivity.this;
            int i3 = verifyFingersActivity.PngjBadCrcException + 1;
            verifyFingersActivity.PngjBadCrcException = i3;
            if (i3 != this.values.size() || !FingerActivity.PngjPrematureEnding) {
                return;
            }
            VerifyResult verifyResult3 = null;
            try {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : this.values.entrySet()) {
                    hashMap2.put(Integer.valueOf(Position.getFromHandFinger((Pair) entry.getKey()).ordinal()), ((PngjExceptionInternal) VerifyFingersActivity.this.values.get(entry.getKey())).PngjBadCrcException());
                }
                verifyResult = Fpnative.matchCaptured(e1.values, hashMap2, this.PngjBadSignature.ordinal());
            } catch (Exception unused) {
            }
            if (verifyResult == null) {
                return;
            }
            try {
                verifyResult2 = null;
                for (Map.Entry entry2 : this.values.entrySet()) {
                    verifyResult2 = new VerifyResult(verifyResult.getEnrollmentTs());
                    verifyResult2.setMatched(verifyResult.isMatched());
                    verifyResult2.positionMismatched = verifyResult.positionMismatched;
                    verifyResult2.setMatched_true_up_to_security_level(verifyResult.matched_true_up_to_security_level);
                    verifyResult2.setScore((int) Math.round(verifyResult.getScore()));
                    getProcessingTime getprocessingtime = (getProcessingTime) entry2.getValue();
                    getprocessingtime.PngjBadCrcException(verifyResult.isMatched());
                    ((a) getprocessingtime).values = Math.round(verifyResult.getFingerScore((Pair) entry2.getKey()));
                    VerifyFingersActivity.this.onErrorResponse.Capture2IndexActivity.PngjBadSignature.put((Pair) entry2.getKey(), Integer.valueOf(((a) getprocessingtime).values));
                }
                VerifyFingersActivity.this.onErrorResponse.Capture2IndexActivity.getFingerPrintQualityScore = verifyResult.isMatched() ? 1 : 2;
                try {
                    VerifyFingersActivity.this.onErrorResponse.valueOf();
                } catch (Exception unused2) {
                }
                e1.values(new Object[]{VerifyFingersActivity.this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                identySdk = IdentySdk.getInstance();
                VerifyFingersActivity verifyFingersActivity2 = VerifyFingersActivity.this;
                fingerDetectionMode = verifyFingersActivity2.PngjExceptionInternal;
                e1 e1Var2 = verifyFingersActivity2.onErrorResponse;
                i2 = e1Var2.getEncryptedTemplates;
                hashMap = this.values;
                j = e1Var2.toString;
                j2 = e1Var2.Enroll2IndexActivity;
            } catch (Exception unused3) {
            }
            try {
                long timeInMillis = Calendar.getInstance().getTimeInMillis() - this.PngjException;
                byte[] PngjPrematureEnding = VerifyFingersActivity.this.onErrorResponse.PngjPrematureEnding();
                e1 e1Var3 = VerifyFingersActivity.this.onErrorResponse;
                identySdk.a(fingerDetectionMode, i2, hashMap, verifyResult2, j, j2, timeInMillis, PngjPrematureEnding, e1Var3.setFoundMatchingTemplates + e1Var3.Enroll2IndexActivity);
            } catch (Exception unused4) {
                verifyResult3 = verifyResult;
                verifyResult = verifyResult3;
                i = IdentySdk.getInstance().getAllowedAttempts();
                e1Var = VerifyFingersActivity.this.onErrorResponse;
                e1Var.getEncryptedTemplates++;
                if (!((a) this.values.get(e1Var.PngjExceptionInternal()[0])).PngjOutputException()) {
                }
            }
            try {
                i = IdentySdk.getInstance().getAllowedAttempts();
            } catch (Exception e) {
                e.printStackTrace();
                i = 0;
            }
            e1Var = VerifyFingersActivity.this.onErrorResponse;
            e1Var.getEncryptedTemplates++;
            if (!((a) this.values.get(e1Var.PngjExceptionInternal()[0])).PngjOutputException()) {
                VerifyFingersActivity verifyFingersActivity3 = VerifyFingersActivity.this;
                if (verifyFingersActivity3.onErrorResponse.getEncryptedTemplates < i) {
                    verifyFingersActivity3.e1();
                    return;
                }
                try {
                    if (IdentySdk.getInstance().isDisplayTransactionAlerts()) {
                        com.identy.ui.c.a aVar = new com.identy.ui.c.a(VerifyFingersActivity.this);
                        aVar.PngjBadSignature = R.string.id_spoof_final_message;
                        aVar.PngjException = R.string.id_done;
                        aVar.values(new DialogInterfaceOnDismissListenerC0017PngjBadCrcException()).show();
                    } else {
                        VerifyFingersActivity verifyFingersActivity4 = VerifyFingersActivity.this;
                        verifyFingersActivity4.values((Pair<Hand, Finger>[]) verifyFingersActivity4.onErrorResponse.PngjExceptionInternal());
                    }
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            try {
                Object obj = valueOf.UNSUCCESS;
                valueOf valueof2 = verifyResult.isMatched() ? valueOf.SUCCESS : obj;
                if (valueof2.equals(obj)) {
                    valueof2 = valueOf.RETAKE;
                }
                if (VerifyFingersActivity.this.onErrorResponse.getEncryptedTemplates >= i && valueof2.equals(valueOf.RETAKE)) {
                    valueof = obj;
                    if (!valueof.equals(valueOf.RETAKE)) {
                        try {
                            VerifyFingersActivity.this.Action.PngjException();
                        } catch (Exception unused5) {
                        }
                    }
                    if (!IdentySdk.getInstance().isDisplayPrints()) {
                        VerifyFingersActivity verifyFingersActivity5 = VerifyFingersActivity.this;
                        VerifyFingersActivity verifyFingersActivity6 = VerifyFingersActivity.this;
                        verifyFingersActivity5.getPadSub1 = new com.identy.ui.c.PngjBadCrcException(verifyFingersActivity6, this.values, this.valueOf, valueof, verifyFingersActivity6.getQualityScore);
                        VerifyFingersActivity.this.getPadSub1.show();
                        return;
                    }
                    if (!IdentySdk.getInstance().v()) {
                        if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                            VerifyFingersActivity.this.Attempt();
                            return;
                        } else {
                            VerifyFingersActivity.this.Action();
                            return;
                        }
                    }
                    if (valueof.equals(valueOf.RETAKE)) {
                        VerifyFingersActivity verifyFingersActivity7 = VerifyFingersActivity.this;
                        VerifyFingersActivity verifyFingersActivity8 = VerifyFingersActivity.this;
                        verifyFingersActivity7.getPadSub1 = new com.identy.ui.c.getScore(verifyFingersActivity8, verifyFingersActivity8.getQualityScore);
                    } else if (valueof.equals(valueOf.UNSUCCESS)) {
                        VerifyFingersActivity verifyFingersActivity9 = VerifyFingersActivity.this;
                        VerifyFingersActivity verifyFingersActivity10 = VerifyFingersActivity.this;
                        verifyFingersActivity9.getPadSub1 = new com.identy.ui.c.isQualityFailed(verifyFingersActivity10, verifyFingersActivity10.getQualityScore);
                    } else {
                        VerifyFingersActivity verifyFingersActivity11 = VerifyFingersActivity.this;
                        VerifyFingersActivity verifyFingersActivity12 = VerifyFingersActivity.this;
                        verifyFingersActivity11.getPadSub1 = new com.identy.ui.c.getFingerPrintQualityScore(verifyFingersActivity12, verifyFingersActivity12.getQualityScore, verifyFingersActivity12.PngjExceptionInternal, verifyFingersActivity12.onErrorResponse());
                    }
                    VerifyFingersActivity.this.getPadSub1.show();
                    return;
                }
                valueof = valueof2;
                if (!valueof.equals(valueOf.RETAKE)) {
                }
                if (!IdentySdk.getInstance().isDisplayPrints()) {
                }
            } catch (Exception unused6) {
            }
        }
    }

    private static String $$i(short s, byte b, short s2) {
        int i = 3 - (s * 3);
        int i2 = s2 + 105;
        byte[] bArr = $$c;
        int i3 = b * 3;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = i3 + i2;
        }
        while (true) {
            i4++;
            i++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i];
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getOveralTimetaken = 0;
        getNfiq1Score = 1;
        valueOf = 1378868743;
        getFingerPrintQualityScore = -961251473;
        getScore = -1358271368;
        getCaptureTime = new byte[]{21, 81, 0, 54, -77, 21, 110, 30, 103, 35, 34, -88, 1, -34, 87, 104, 103, 106, 27, 83, 26, -116, -40, -119, -36, -33, -16, -25, -30, -13, -122, -41, -61, -119, -37, 76, -61, -77, -34, -102, -105, -7, -37, 79, -57, -126, -113, -19, -89, -55, 124, -56, 17, 34, -56, 107, 100, -50, 120, 114, -56, 119, 116, 124, -62, 79, 79, 79, 79};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, Object[] objArr) {
        int i2;
        int i7;
        int i3 = s * 6;
        byte[] bArr = $$a;
        int i4 = (i * 18) + 4;
        int i5 = 80 - (s2 * 2);
        byte[] bArr2 = new byte[i3 + 13];
        int i6 = i3 + 12;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i7 = 0;
            int i8 = i6;
            i5 = i8 + (-i5) + 5;
            i4++;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i4];
            byte[] bArr4 = bArr;
            i8 = i5;
            i5 = b;
            bArr3 = bArr4;
            i5 = i8 + (-i5) + 5;
            i4++;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private static void c(short s, int i, int i2, byte b, int i3, Object[] objArr) {
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        char c;
        int i8;
        int i9;
        com.d.e.PngjPrematureEnding pngjPrematureEnding = new com.d.e.PngjPrematureEnding();
        StringBuilder sb = new StringBuilder();
        int i10 = 2;
        try {
            int i11 = 1;
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(getFingerPrintQualityScore)};
            int i12 = 0;
            Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1302984176);
            Class cls = Integer.TYPE;
            if (PngjBadSignature == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Color.green(0) + 60329), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31, 1168 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1320773547, false, $$i(b2, b3, b3), new Class[]{cls, cls});
            }
            int intValue = ((Integer) ((Method) PngjBadSignature).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $11 = ($10 + 21) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = getCaptureTime;
                if (bArr != null) {
                    int length = bArr.length;
                    j = -6165791747575875761L;
                    byte[] bArr2 = new byte[length];
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = $11 + 65;
                        $10 = i14 % 128;
                        if (i14 % i10 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i13])};
                            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1053815139);
                            if (PngjBadSignature2 == null) {
                                i9 = i11;
                                byte b4 = (byte) i12;
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, i12) + 14830), 28 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, i12), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 721, 1038050086, false, $$i(b4, b4, (byte) $$c.length), new Class[]{cls});
                            } else {
                                i9 = i11;
                            }
                            bArr2[i13] = ((Byte) ((Method) PngjBadSignature2).invoke(null, objArr3)).byteValue();
                            i11 = i9;
                            i10 = 2;
                            i12 = 0;
                            i13 = 0;
                        } else {
                            int i15 = i11;
                            Object[] objArr4 = {Integer.valueOf(bArr[i13])};
                            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1053815139);
                            if (PngjBadSignature3 == null) {
                                byte b5 = (byte) 0;
                                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14829), 28 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 721, 1038050086, false, $$i(b5, b5, (byte) $$c.length), new Class[]{cls});
                            }
                            bArr2[i13] = ((Byte) ((Method) PngjBadSignature3).invoke(null, objArr4)).byteValue();
                            i13++;
                            i11 = i15;
                            i10 = 2;
                            i12 = 0;
                        }
                    }
                    bArr = bArr2;
                } else {
                    j = -6165791747575875761L;
                }
                i5 = i11;
                if (bArr != null) {
                    byte[] bArr3 = getCaptureTime;
                    Object[] objArr5 = new Object[2];
                    objArr5[i5] = Integer.valueOf(valueOf);
                    objArr5[0] = Integer.valueOf(i2);
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1302984176);
                    if (PngjBadSignature4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (60328 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0')), 33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 1167, 1320773547, false, $$i(b6, b7, b7), new Class[]{cls, cls});
                    }
                    intValue = (byte) (((byte) (bArr3[((Integer) ((Method) PngjBadSignature4).invoke(null, objArr5)).intValue()] ^ j)) + ((int) (getFingerPrintQualityScore ^ j)));
                } else {
                    intValue = (short) (((short) (getProcessingTime[i2 + ((int) (valueOf ^ j))] ^ j)) + ((int) (getFingerPrintQualityScore ^ j)));
                }
            } else {
                i5 = 1;
                j = -6165791747575875761L;
            }
            if (intValue > 0) {
                $10 = ($11 + 13) % 128;
                pngjPrematureEnding.values = ((i2 + intValue) - 2) + ((int) (valueOf ^ j)) + i4;
                int i16 = getScore;
                Object[] objArr6 = new Object[4];
                objArr6[3] = sb;
                objArr6[2] = Integer.valueOf(i16);
                objArr6[i5] = Integer.valueOf(i);
                objArr6[0] = pngjPrematureEnding;
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1013119226);
                if (PngjBadSignature5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 45717), (ViewConfiguration.getScrollBarSize() >> 8) + 40, 625 - (ViewConfiguration.getPressedStateDuration() >> 16), 1064463037, false, $$i(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, cls, cls, Object.class});
                }
                ((StringBuilder) ((Method) PngjBadSignature5).invoke(null, objArr6)).append(pngjPrematureEnding.valueOf);
                pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                byte[] bArr4 = getCaptureTime;
                if (bArr4 != null) {
                    $10 = ($11 + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr5[i17] = (byte) (bArr4[i17] ^ j);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    i6 = i5;
                    i7 = i6;
                } else {
                    i6 = i5;
                    i7 = 0;
                }
                while (true) {
                    pngjPrematureEnding.PngjException = i6;
                    if (pngjPrematureEnding.PngjException >= intValue) {
                        break;
                    }
                    if (i7 != 0) {
                        int i18 = $11 + 43;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            byte[] bArr6 = getCaptureTime;
                            pngjPrematureEnding.values = pngjPrematureEnding.values;
                            byte b10 = (byte) (bArr6[0] | j);
                            c = pngjPrematureEnding.PngjBadCrcException;
                            i8 = b10 % s;
                        } else {
                            byte[] bArr7 = getCaptureTime;
                            pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                            byte b11 = (byte) (bArr7[0] ^ j);
                            c = pngjPrematureEnding.PngjBadCrcException;
                            i8 = b11 + s;
                        }
                        pngjPrematureEnding.valueOf = (char) (c + (((byte) i8) ^ b));
                    } else {
                        short[] sArr = getProcessingTime;
                        pngjPrematureEnding.values = pngjPrematureEnding.values - 1;
                        pngjPrematureEnding.valueOf = (char) (pngjPrematureEnding.PngjBadCrcException + (((short) (((short) (sArr[0] ^ j)) + s)) ^ b));
                    }
                    sb.append(pngjPrematureEnding.valueOf);
                    pngjPrematureEnding.PngjBadCrcException = pngjPrematureEnding.valueOf;
                    i6 = pngjPrematureEnding.PngjException + 1;
                }
            }
            String sb2 = sb.toString();
            $11 = ($10 + 123) % 128;
            objArr[0] = sb2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    public static void init$0() {
        $$a = new byte[]{66, 72, 81, -110, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6};
        $$b = 248;
    }

    public static void init$1() {
        $$c = new byte[]{64, -40, -69, -46};
        $$f = 64;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, a> hashMap, HashMap<Pair<Hand, Finger>, a> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        FingerMatchSecLevel fingerMatchSecLevel;
        long j;
        super.PngjException(hashMap, hashMap2, bitmap, z, z2);
        if (z && this.getAsHighestSecurityLevelReached) {
            this.onErrorResponse.getNfiq1Score = new ProgressDialog(this);
            try {
                this.onErrorResponse.getNfiq1Score.setTitle(BuildConfig.FLAVOR);
                this.onErrorResponse.getNfiq1Score.setCancelable(false);
                this.onErrorResponse.getNfiq1Score.setMessage("matching ...");
                if (FingerActivity.PngjPrematureEnding) {
                    this.onErrorResponse.getNfiq1Score.show();
                }
            } catch (Exception unused) {
            }
            Calendar.getInstance().getTimeInMillis();
            try {
                FingerMatchSecLevel fingerMatchSecLevel2 = IdentySdk.getInstance().PngjOutputException;
                this.PngjBadCrcException = 0;
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                for (Map.Entry<Pair<Hand, Finger>, a> entry : hashMap.entrySet()) {
                    a value = entry.getValue();
                    try {
                        new com.identy.b.PngjBadSignature();
                        PngjExceptionInternal pngjExceptionInternal = (PngjExceptionInternal) this.values.get(entry.getKey());
                        fingerMatchSecLevel = fingerMatchSecLevel2;
                        j = timeInMillis;
                        try {
                            new PngjBadSignature.AsyncTaskC0018PngjBadSignature(new PngjBadCrcException(hashMap, fingerMatchSecLevel2, timeInMillis, hashMap2), this, pngjExceptionInternal, value, e1.PngjInputException).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new a[0]);
                            getNfiq1Score = (getOveralTimetaken + 45) % 128;
                        } catch (Exception unused2) {
                            try {
                                this.onErrorResponse.valueOf();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            fingerMatchSecLevel2 = fingerMatchSecLevel;
                            timeInMillis = j;
                        }
                    } catch (Exception unused3) {
                        fingerMatchSecLevel = fingerMatchSecLevel2;
                        j = timeInMillis;
                    }
                    fingerMatchSecLevel2 = fingerMatchSecLevel;
                    timeInMillis = j;
                }
                getOveralTimetaken = (getNfiq1Score + 85) % 128;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0418  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        int i;
        char c;
        int intValue;
        Object[] PngjBadSignature$1eba2e16;
        super.attachBaseContext(context);
        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature == null) {
            char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14829);
            int indexOf = 27 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 721;
            byte b = $$a[18];
            byte b2 = (byte) (b - 1);
            byte b3 = b;
            Object[] objArr = new Object[1];
            b(b2, b3, (byte) (b3 - 1), objArr);
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(c2, indexOf, tapTimeout, -815159504, false, (String) objArr[0], null);
        }
        long j = ((Field) PngjBadSignature).getLong(null);
        try {
            try {
                if (j != -1) {
                    getOveralTimetaken = (getNfiq1Score + 123) % 128;
                    long j2 = j + 4611686018427387888L;
                    i = 864471691;
                    Object[] objArr2 = new Object[1];
                    c((short) ((-59) - View.MeasureSpec.getMode(0)), (-1774066389) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 1801737912, (byte) ('G' - AndroidCharacter.getMirror('0')), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) - 10, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    c = 18;
                    Object[] objArr3 = new Object[1];
                    c((short) (85 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1774066386, 1801737934 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 18), ((byte) KeyEvent.getModifierMetaStateMask()) - 16, objArr3);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature2 == null) {
                            char maximumFlingVelocity = (char) (14830 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            int defaultSize = 28 - View.getDefaultSize(0, 0);
                            int scrollDefaultDelay = 721 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            byte b4 = $$a[18];
                            byte b5 = (byte) (b4 - 1);
                            Object[] objArr4 = new Object[1];
                            b(b4, b5, b5, objArr4);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumFlingVelocity, defaultSize, scrollDefaultDelay, -779023007, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) PngjBadSignature2).get(null);
                        PngjBadSignature$1eba2e16 = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i2 = ((int[]) objArr5[3])[0];
                        int i3 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int identityHashCode = System.identityHashCode(this);
                        int i4 = ~identityHashCode;
                        int c3 = defpackage.a.c((~(i4 | (-1012564475))) | (-1029683196), 564, ((~(identityHashCode | (-1007681697))) * 1128) + (((~((-22001500) | i4)) | (-1012564475) | (~(22001499 | identityHashCode))) * (-564)) + 702796553, -1209935742);
                        int i5 = c3 ^ (c3 << 13);
                        int i6 = i5 ^ (i5 >>> 17);
                        ((int[]) PngjBadSignature$1eba2e16[1])[0] = i6 ^ (i6 << 5);
                        if (((int[]) PngjBadSignature$1eba2e16[3])[0] != ((int[]) PngjBadSignature$1eba2e16[0])[0]) {
                            Object[] objArr6 = {new int[]{0}, new int[1], 0, new int[]{0}};
                            int i7 = ((int[]) PngjBadSignature$1eba2e16[1])[0];
                            int i8 = ((int[]) PngjBadSignature$1eba2e16[3])[0];
                            int i9 = ((int[]) PngjBadSignature$1eba2e16[0])[0];
                            String[] strArr2 = (String[]) PngjBadSignature$1eba2e16[2];
                            int identityHashCode2 = System.identityHashCode(this);
                            int c4 = defpackage.a.c((~((~identityHashCode2) | 592616159)) | (-441949815), 168, (((~(identityHashCode2 | 592616159)) | (-995598080)) * (-168)) + ((((~((-441949815) | identityHashCode2)) | 38967894) * 336) - 973825651), i7);
                            int i10 = c4 ^ (c4 << 13);
                            int i11 = i10 ^ (i10 >>> 17);
                            ((int[]) objArr6[1])[0] = i11 ^ (i11 << 5);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) PngjBadSignature$1eba2e16[2];
                        if (strArr3 == null) {
                            throw null;
                        }
                        int i12 = getNfiq1Score + 25;
                        getOveralTimetaken = i12 % 128;
                        int i13 = i12 % 2 == 0 ? 0 : 1;
                        while (i13 < strArr3.length) {
                            getNfiq1Score = (getOveralTimetaken + 25) % 128;
                            arrayList.add(strArr3[i13]);
                            i13++;
                            getNfiq1Score = (getOveralTimetaken + 107) % 128;
                        }
                        throw null;
                    }
                } else {
                    i = 864471691;
                    c = 18;
                }
                Object[] objArr7 = new Object[1];
                c((short) ((-59) - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0)), (-1774066391) - ImageFormat.getBitsPerPixel(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1801737911, (byte) (23 - Gravity.getAbsoluteGravity(0, 0)), Gravity.getAbsoluteGravity(0, 0) - 10, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c((short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 83), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) - 1774066386, 1801737933 - Drawable.resolveOpacity(0, 0), (byte) ((-17) - View.MeasureSpec.getSize(0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 18, objArr8);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr8[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature3 == null) {
                    char alpha = (char) (14830 - Color.alpha(0));
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                    int offsetAfter = 721 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0);
                    byte b6 = $$a[c];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = b6;
                    Object[] objArr9 = new Object[1];
                    b(b7, b8, (byte) (b8 - 1), objArr9);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, scrollBarSize, offsetAfter, -815159504, false, (String) objArr9[0], null);
                }
                ((Field) PngjBadSignature3).set(null, valueOf2);
                if (((int[]) PngjBadSignature$1eba2e16[3])[0] != ((int[]) PngjBadSignature$1eba2e16[0])[0]) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr10 = {2082879564};
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature4 == null) {
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Gravity.getAbsoluteGravity(0, 0), 24 - Color.red(0), KeyEvent.normalizeMetaState(0) + 697, 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjBadSignature$1eba2e16 = arid.chunks.PngBadCharsetException.PngjBadSignature$1eba2e16(intValue, ((Constructor) PngjBadSignature4).newInstance(objArr10), -1209935742);
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature5 == null) {
                char keyRepeatDelay = (char) (14830 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                int offsetBefore = 28 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 721;
                byte b9 = $$a[c];
                byte b10 = (byte) (b9 - 1);
                Object[] objArr11 = new Object[1];
                b(b9, b10, b10, objArr11);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatDelay, offsetBefore, keyRepeatTimeout, -779023007, false, (String) objArr11[0], null);
            }
            ((Field) PngjBadSignature5).set(null, PngjBadSignature$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        Object[] objArr12 = new Object[1];
        c((short) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 59), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1774066382, View.resolveSize(0, 0) + 1801737947, (byte) (54 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (-16) - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr12);
        Class<?> cls3 = Class.forName((String) objArr12[0]);
        Object[] objArr13 = new Object[1];
        c((short) (View.combineMeasuredStates(0, 0) - 98), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1774066382, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1801737962, (byte) ((-48) - (KeyEvent.getMaxKeyCode() >> 16)), (-16) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr13);
        intValue = ((Integer) cls3.getMethod((String) objArr13[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity
    public final void getPadSub2() {
        super.getPadSub2();
        try {
            IdentyUser B = IdentySdk.getInstance().B();
            boolean isEnrolled = IdentySdk.getInstance().isEnrolled(new FingerDetectionMode[]{this.PngjExceptionInternal}, B);
            ArrayList arrayList = this.getPadSub2;
            this.values = com.identy.f.PngjBadSignature.PngjException(IdentySdk.getInstance().getData, (FingerDetectionMode[]) arrayList.toArray(new FingerDetectionMode[arrayList.size()]), B);
            if (!isEnrolled) {
                int i = getNfiq1Score + 113;
                getOveralTimetaken = i % 128;
                (i % 2 != 0 ? Toast.makeText(this, "Fingers not registered .. please register first", 1) : Toast.makeText(this, "Fingers not registered .. please register first", 1)).show();
                finish();
                getOveralTimetaken = (getNfiq1Score + 125) % 128;
                return;
            }
        } catch (Exception unused) {
        }
        int i2 = getOveralTimetaken + 21;
        getNfiq1Score = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getOveralTimetaken = (getNfiq1Score + 89) % 128;
        super.onCreate(bundle);
        int i = getOveralTimetaken + 75;
        getNfiq1Score = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        getOveralTimetaken = (getNfiq1Score + 75) % 128;
        super.onPause();
        int i = getOveralTimetaken + 39;
        getNfiq1Score = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = getNfiq1Score + 83;
        getOveralTimetaken = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 != 0) {
            int i3 = 25 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        int i = getNfiq1Score + 49;
        getOveralTimetaken = i % 128;
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
                getNfiq1Score = (getOveralTimetaken + 99) % 128;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
