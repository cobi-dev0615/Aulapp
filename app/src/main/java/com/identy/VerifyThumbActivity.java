package com.identy;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import co.ceduladigital.sdk.x5;
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
import org.camera.preview.PngjBadCrcException;

/* loaded from: classes2.dex */
public class VerifyThumbActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static int getFingerPrintQualityScore;
    private static int getProcessingTime;
    private static char getScore;
    private static char[] valueOf;
    int PngjBadCrcException = 0;
    protected HashMap values = new HashMap();

    public class PngjException implements org.cameracontroller.PngjBadSignature.values, com.identy.b.PngjBadSignature.values {
        private /* synthetic */ FingerMatchSecLevel PngjBadCrcException;
        private /* synthetic */ HashMap PngjBadSignature;
        private /* synthetic */ long PngjException;

        public class PngjBadSignature implements DialogInterface.OnDismissListener {
            public PngjBadSignature() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                VerifyThumbActivity verifyThumbActivity = VerifyThumbActivity.this;
                verifyThumbActivity.values((Pair<Hand, Finger>[]) verifyThumbActivity.onErrorResponse.PngjExceptionInternal());
            }
        }

        public PngjException(HashMap hashMap, FingerMatchSecLevel fingerMatchSecLevel, long j) {
            this.PngjBadSignature = hashMap;
            this.PngjBadCrcException = fingerMatchSecLevel;
            this.PngjException = j;
        }

        public void PngjException(boolean z) {
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
        // @Override // com.identy.b.PngjBadSignature.values
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void values() {
            VerifyResult verifyResult;
            int i;
            com.identy.e1 e1Var;
            VerifyResult verifyResult2;
            IdentySdk identySdk;
            FingerDetectionMode fingerDetectionMode;
            int i2;
            HashMap hashMap;
            long j;
            long j2;
            VerifyThumbActivity verifyThumbActivity = VerifyThumbActivity.this;
            int i3 = verifyThumbActivity.PngjBadCrcException + 1;
            verifyThumbActivity.PngjBadCrcException = i3;
            if (i3 == this.PngjBadSignature.size() && FingerActivity.PngjPrematureEnding) {
                VerifyResult verifyResult3 = null;
                try {
                    HashMap hashMap2 = new HashMap();
                    for (Object _entry : this.PngjBadSignature.entrySet()) {
                        Map.Entry entry = (Map.Entry) _entry;
                        hashMap2.put(Integer.valueOf(Position.getFromHandFinger((Pair) entry.getKey()).ordinal()), ((PngjExceptionInternal) VerifyThumbActivity.this.values.get(entry.getKey())).PngjBadCrcException());
                    }
                    verifyResult = Fpnative.matchCaptured(com.identy.e1.values, hashMap2, this.PngjBadCrcException.ordinal());
                } catch (Exception unused) {
                }
                if (verifyResult == null) {
                    return;
                }
                try {
                    verifyResult2 = null;
                    for (Object _entry2 : this.PngjBadSignature.entrySet()) {
                        Map.Entry entry2 = (Map.Entry) _entry2;
                        verifyResult2 = new VerifyResult(verifyResult.getEnrollmentTs());
                        verifyResult2.setMatched(verifyResult.isMatched());
                        verifyResult2.positionMismatched = verifyResult.positionMismatched;
                        verifyResult2.setMatched_true_up_to_security_level(verifyResult.matched_true_up_to_security_level);
                        verifyResult2.setScore((int) Math.round(verifyResult.getScore()));
                        com.identy.getProcessingTime getprocessingtime = (com.identy.getProcessingTime) entry2.getValue();
                        getprocessingtime.PngjBadCrcException(verifyResult.isMatched());
                        ((com.identy.IdentyA) getprocessingtime).values = Math.round(verifyResult.getFingerScore((Pair) entry2.getKey()));
                        VerifyThumbActivity.this.onErrorResponse.Capture2IndexActivity.PngjBadSignature.put((Pair) entry2.getKey(), Integer.valueOf(((com.identy.IdentyA) getprocessingtime).values));
                    }
                    VerifyThumbActivity.this.onErrorResponse.Capture2IndexActivity.getFingerPrintQualityScore = verifyResult.isMatched() ? 1 : 2;
                    try {
                        VerifyThumbActivity.this.onErrorResponse.valueOf();
                    } catch (Exception unused2) {
                    }
                    com.identy.e1.values(new Object[]{VerifyThumbActivity.this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                    identySdk = IdentySdk.getInstance();
                    VerifyThumbActivity verifyThumbActivity2 = VerifyThumbActivity.this;
                    fingerDetectionMode = verifyThumbActivity2.PngjExceptionInternal;
                    com.identy.e1 e1Var2 = verifyThumbActivity2.onErrorResponse;
                    i2 = e1Var2.getEncryptedTemplates;
                    hashMap = this.PngjBadSignature;
                    j = e1Var2.toString;
                    j2 = e1Var2.Enroll2IndexActivity;
                } catch (Exception unused3) {
                }
                try {
                    long timeInMillis = Calendar.getInstance().getTimeInMillis() - this.PngjException;
                    byte[] PngjPrematureEnding = VerifyThumbActivity.this.onErrorResponse.PngjPrematureEnding();
                    com.identy.e1 e1Var3 = VerifyThumbActivity.this.onErrorResponse;
                    identySdk.a(fingerDetectionMode, i2, hashMap, verifyResult2, j, j2, timeInMillis, PngjPrematureEnding, e1Var3.setFoundMatchingTemplates + e1Var3.Enroll2IndexActivity);
                } catch (Exception unused4) {
                    verifyResult3 = verifyResult;
                    verifyResult = verifyResult3;
                    i = IdentySdk.getInstance().getAllowedAttempts();
                    e1Var = VerifyThumbActivity.this.onErrorResponse;
                    e1Var.getEncryptedTemplates++;
                    if (!((com.identy.IdentyA) this.PngjBadSignature.get(e1Var.PngjExceptionInternal()[0])).PngjOutputException()) {
                    }
                }
                try {
                    i = IdentySdk.getInstance().getAllowedAttempts();
                } catch (Exception e) {
                    e.printStackTrace();
                    i = 0;
                }
                e1Var = VerifyThumbActivity.this.onErrorResponse;
                e1Var.getEncryptedTemplates++;
                if (!((com.identy.IdentyA) this.PngjBadSignature.get(e1Var.PngjExceptionInternal()[0])).PngjOutputException()) {
                    VerifyThumbActivity verifyThumbActivity3 = VerifyThumbActivity.this;
                    if (verifyThumbActivity3.onErrorResponse.getEncryptedTemplates < i) {
                        verifyThumbActivity3.e1();
                        return;
                    }
                    try {
                        if (IdentySdk.getInstance().isDisplayTransactionAlerts()) {
                            com.identy.ui.c.a aVar = new com.identy.ui.c.a(VerifyThumbActivity.this);
                            aVar.PngjBadSignature = R.string.id_spoof_final_message;
                            aVar.PngjException = R.string.id_done;
                            aVar.values(new PngjBadSignature()).show();
                        } else {
                            VerifyThumbActivity verifyThumbActivity4 = VerifyThumbActivity.this;
                            verifyThumbActivity4.values((Pair<Hand, Finger>[]) verifyThumbActivity4.onErrorResponse.PngjExceptionInternal());
                        }
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                try {
                    com.identy.valueOf valueof = com.identy.valueOf.UNSUCCESS;
                    com.identy.valueOf valueof2 = verifyResult.isMatched() ? com.identy.valueOf.SUCCESS : valueof;
                    if (valueof2.equals(valueof)) {
                        valueof2 = com.identy.valueOf.RETAKE;
                    }
                    if (VerifyThumbActivity.this.onErrorResponse.getEncryptedTemplates < i || !valueof2.equals(com.identy.valueOf.RETAKE)) {
                        valueof = valueof2;
                    }
                    if (!valueof.equals(com.identy.valueOf.RETAKE)) {
                        try {
                            VerifyThumbActivity.this.Action.PngjException();
                        } catch (Exception unused5) {
                        }
                    }
                    if (IdentySdk.getInstance().isDisplayPrints()) {
                        VerifyThumbActivity.this.getPadSub1 = new com.identy.ui.c.valueOf(VerifyThumbActivity.this, (com.identy.IdentyA) this.PngjBadSignature.get(new Pair(VerifyThumbActivity.this.PngjExceptionInternal.getHand(), Finger.THUMB)), valueof, VerifyThumbActivity.this.getQualityScore);
                        VerifyThumbActivity.this.getPadSub1.show();
                        return;
                    }
                    if (!IdentySdk.getInstance().v()) {
                        if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                            VerifyThumbActivity.this.Attempt();
                            return;
                        } else {
                            VerifyThumbActivity.this.Action();
                            return;
                        }
                    }
                    if (valueof.equals(com.identy.valueOf.RETAKE)) {
                        VerifyThumbActivity verifyThumbActivity5 = VerifyThumbActivity.this;
                        VerifyThumbActivity verifyThumbActivity6 = VerifyThumbActivity.this;
                        verifyThumbActivity5.getPadSub1 = new com.identy.ui.c.getScore(verifyThumbActivity6, verifyThumbActivity6.getQualityScore);
                    } else if (valueof.equals(com.identy.valueOf.UNSUCCESS)) {
                        VerifyThumbActivity verifyThumbActivity7 = VerifyThumbActivity.this;
                        VerifyThumbActivity verifyThumbActivity8 = VerifyThumbActivity.this;
                        verifyThumbActivity7.getPadSub1 = new com.identy.ui.c.isQualityFailed(verifyThumbActivity8, verifyThumbActivity8.getQualityScore);
                    } else {
                        VerifyThumbActivity verifyThumbActivity9 = VerifyThumbActivity.this;
                        VerifyThumbActivity verifyThumbActivity10 = VerifyThumbActivity.this;
                        verifyThumbActivity9.getPadSub1 = new com.identy.ui.c.getFingerPrintQualityScore(verifyThumbActivity10, verifyThumbActivity10.getQualityScore, verifyThumbActivity10.PngjExceptionInternal, verifyThumbActivity10.onErrorResponse());
                    }
                    VerifyThumbActivity.this.getPadSub1.show();
                } catch (Exception unused6) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(short s, short s2, int i) {
        int i2;
        int i3;
        int i4 = (s2 * 2) + 1;
        byte[] bArr = $$c;
        int i5 = 4 - (i * 3);
        int i6 = (s * 2) + 117;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i5++;
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            i5++;
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
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
        getFingerPrintQualityScore = 0;
        getProcessingTime = 1;
        valueOf = new char[]{301, 288, 266, 267, 306, 282, 316, 317, 303, 273, 304, 298, 307, 318, 308, 309, 310, 299, 311, 297, 300, 375, 305, 312, 314};
        getScore = (char) 13510;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, Object[] objArr) {
        int i2;
        int i3 = b + 4;
        byte[] bArr = $$a;
        int i4 = b2 * 6;
        int i5 = 80 - (i * 4);
        byte[] bArr2 = new byte[19 - i4];
        int i6 = 18 - i4;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i5;
            int i9 = i3;
            int i10 = i8 + i3 + 5;
            int i11 = i9;
            i5 = i10;
            i3 = i11;
            bArr = bArr3;
            i2 = i7;
            int i12 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i13 = i5;
            i9 = i12;
            i3 = bArr[i12];
            i7 = i2 + 1;
            bArr3 = bArr;
            i8 = i13;
            int i102 = i8 + i3 + 5;
            int i112 = i9;
            i5 = i102;
            i3 = i112;
            bArr = bArr3;
            i2 = i7;
            int i122 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1222 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    private static void c(String str, int i, byte b, Object[] objArr) throws Exception {
        char c;
        int i2;
        long j;
        char c2;
        int i3;
        int i4;
        int i5;
        char c3;
        char c4;
        char c5;
        char c6;
        int i6;
        long j2;
        char c7;
        int i7 = $10 + 43;
        $11 = i7 % 128;
        char c8 = 2;
        if (i7 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : null;
        com.d.e.PngjInputException pngjInputException = new com.d.e.PngjInputException();
        char[] cArr = valueOf;
        Class cls = Integer.TYPE;
        int i8 = 252968584;
        long j3 = 0;
        char c9 = 4;
        int i9 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(i8);
                    if (PngjBadSignature == null) {
                        c6 = c8;
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(j3);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                        i6 = i8;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j3) + 1531;
                        j2 = j3;
                        byte b2 = (byte) ($$f - 4);
                        byte b3 = (byte) (b2 - 2);
                        c7 = c9;
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType, longPressTimeout, packedPositionGroup, -201551053, false, $$i(b2, b3, b3), new Class[]{cls});
                    } else {
                        c6 = c8;
                        i6 = i8;
                        j2 = j3;
                        c7 = c9;
                    }
                    cArr2[i10] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    i10++;
                    i8 = i6;
                    c8 = c6;
                    j3 = j2;
                    c9 = c7;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            c = c8;
            i2 = i8;
            j = j3;
            c2 = c9;
            $10 = ($11 + 45) % 128;
            cArr = cArr2;
        } else {
            c = 2;
            i2 = 252968584;
            j = 0;
            c2 = 4;
        }
        Object[] objArr3 = {Integer.valueOf(getScore)};
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
        if (PngjBadSignature2 == null) {
            byte b4 = (byte) ($$f - 4);
            byte b5 = (byte) (b4 - 2);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, 1531 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -201551053, false, $$i(b4, b5, b5), new Class[]{cls});
        }
        char charValue = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i11 = $10 + 125;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                i3 = i + 116;
                cArr3[i3] = (char) (charArray[i3] >> b);
            } else {
                i3 = i - 1;
                cArr3[i3] = (char) (charArray[i3] - b);
            }
        } else {
            i3 = i;
        }
        int i12 = 1;
        if (i3 > 1) {
            pngjInputException.values = 0;
            while (true) {
                int i13 = pngjInputException.values;
                if (i13 >= i3) {
                    break;
                }
                char c10 = charArray[i13];
                pngjInputException.valueOf = c10;
                char c11 = charArray[i13 + 1];
                pngjInputException.PngjException = c11;
                if (c10 == c11) {
                    int i14 = $11 + 41;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr3[i13] = (char) (c10 % b);
                        cArr3[i13 - 1] = (char) (c11 - b);
                    } else {
                        cArr3[i13] = (char) (c10 - b);
                        cArr3[i13 + 1] = (char) (c11 - b);
                    }
                    i4 = i12;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = pngjInputException;
                    objArr4[11] = Integer.valueOf(charValue);
                    objArr4[10] = pngjInputException;
                    objArr4[9] = pngjInputException;
                    objArr4[8] = Integer.valueOf(charValue);
                    objArr4[7] = pngjInputException;
                    objArr4[6] = pngjInputException;
                    objArr4[5] = Integer.valueOf(charValue);
                    objArr4[c2] = pngjInputException;
                    objArr4[3] = pngjInputException;
                    objArr4[c] = Integer.valueOf(charValue);
                    objArr4[i12] = pngjInputException;
                    objArr4[i9] = pngjInputException;
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1620847519);
                    if (PngjBadSignature3 == null) {
                        c3 = '\n';
                        char c12 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int i15 = (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 26;
                        c4 = '\t';
                        int touchSlop = 1475 - (ViewConfiguration.getTouchSlop() >> 8);
                        c5 = 7;
                        byte b6 = (byte) ($$f - 5);
                        i4 = i12;
                        byte b7 = (byte) (b6 - 1);
                        i5 = i9;
                        String $$i = $$i(b6, b7, b7);
                        Class cls2 = Integer.TYPE;
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c12, i15, touchSlop, 1670167002, false, $$i, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        i4 = i12;
                        i5 = i9;
                        c3 = '\n';
                        c4 = '\t';
                        c5 = 7;
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr4)).intValue();
                    int i16 = pngjInputException.PngjUnsupportedException;
                    if (intValue == i16) {
                        $11 = ($10 + 37) % 128;
                        Object[] objArr5 = new Object[11];
                        objArr5[c3] = pngjInputException;
                        objArr5[c4] = Integer.valueOf(charValue);
                        objArr5[8] = pngjInputException;
                        objArr5[c5] = Integer.valueOf(charValue);
                        objArr5[6] = Integer.valueOf(charValue);
                        objArr5[5] = pngjInputException;
                        objArr5[c2] = pngjInputException;
                        objArr5[3] = Integer.valueOf(charValue);
                        objArr5[c] = Integer.valueOf(charValue);
                        objArr5[i4] = pngjInputException;
                        objArr5[i5] = pngjInputException;
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1410004713);
                        if (PngjBadSignature4 == null) {
                            char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 37426);
                            int i17 = i5;
                            int resolveSize = 26 - View.resolveSize(i17, i17);
                            int keyCodeFromString = 1017 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR);
                            byte b8 = (byte) i17;
                            byte b9 = b8;
                            String $$i2 = $$i(b8, b9, b9);
                            Class cls3 = Integer.TYPE;
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(touchSlop2, resolveSize, keyCodeFromString, 1461347500, false, $$i2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int intValue2 = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr5)).intValue();
                        int i18 = (pngjInputException.PngjBadCrcException * charValue) + pngjInputException.PngjUnsupportedException;
                        int i19 = pngjInputException.values;
                        cArr3[i19] = cArr[intValue2];
                        cArr3[i19 + 1] = cArr[i18];
                    } else {
                        int i20 = pngjInputException.PngjBadSignature;
                        int i21 = pngjInputException.PngjBadCrcException;
                        if (i20 == i21) {
                            int i22 = i4;
                            int C = x5.C(pngjInputException.PngjOutputException, charValue, i22, charValue);
                            pngjInputException.PngjOutputException = C;
                            int C2 = x5.C(i16, charValue, i22, charValue);
                            pngjInputException.PngjUnsupportedException = C2;
                            int i23 = (i21 * charValue) + C2;
                            int i24 = pngjInputException.values;
                            cArr3[i24] = cArr[(i20 * charValue) + C];
                            cArr3[i24 + i22] = cArr[i23];
                            i4 = 1;
                        } else {
                            int i25 = (i20 * charValue) + i16;
                            int i26 = (i21 * charValue) + pngjInputException.PngjOutputException;
                            int i27 = pngjInputException.values;
                            cArr3[i27] = cArr[i25];
                            i4 = 1;
                            cArr3[i27 + 1] = cArr[i26];
                        }
                    }
                }
                pngjInputException.values += 2;
                i12 = i4;
                i9 = 0;
            }
        }
        for (int i28 = 0; i28 < i; i28++) {
            cArr3[i28] = (char) (cArr3[i28] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{64, -40, -69, -46, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6};
        $$b = 117;
    }

    public static void init$1() {
        $$c = new byte[]{37, -75, 122, 54};
        $$f = 6;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        FingerMatchSecLevel fingerMatchSecLevel;
        long j;
        getFingerPrintQualityScore = (getProcessingTime + 5) % 128;
        super.PngjException(hashMap, hashMap2, bitmap, z, z2);
        if (z && this.getAsHighestSecurityLevelReached) {
            this.onErrorResponse.getNfiq1Score = new ProgressDialog(this);
            try {
                this.onErrorResponse.getNfiq1Score.setTitle(BuildConfig.FLAVOR);
                this.onErrorResponse.getNfiq1Score.setCancelable(false);
                this.onErrorResponse.getNfiq1Score.setMessage("matching ...");
                if (FingerActivity.PngjPrematureEnding) {
                    getProcessingTime = (getFingerPrintQualityScore + 81) % 128;
                    this.onErrorResponse.getNfiq1Score.show();
                }
            } catch (Exception unused) {
            }
            Calendar.getInstance().getTimeInMillis();
            this.PngjBadCrcException = 0;
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            try {
                FingerMatchSecLevel fingerMatchSecLevel2 = IdentySdk.getInstance().PngjOutputException;
                for (Map.Entry<Pair<Hand, Finger>, IdentyA> entry : hashMap.entrySet()) {
                    IdentyA value = entry.getValue();
                    try {
                        new com.identy.b.PngjBadSignature();
                        com.identy.PngjExceptionInternal pngjExceptionInternal = (com.identy.PngjExceptionInternal) this.values.get(entry.getKey());
                        fingerMatchSecLevel = fingerMatchSecLevel2;
                        j = timeInMillis;
                        try {
                            new com.identy.b.PngjBadSignature.AsyncTaskC0018PngjBadSignature(new PngjException(hashMap, fingerMatchSecLevel2, timeInMillis), this, pngjExceptionInternal, value, com.identy.e1.PngjInputException).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new IdentyA[0]);
                            getFingerPrintQualityScore = (getProcessingTime + 61) % 128;
                        } catch (Exception unused2) {
                            try {
                                this.onErrorResponse.valueOf();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            timeInMillis = j;
                            fingerMatchSecLevel2 = fingerMatchSecLevel;
                        }
                    } catch (Exception unused3) {
                        fingerMatchSecLevel = fingerMatchSecLevel2;
                        j = timeInMillis;
                    }
                    timeInMillis = j;
                    fingerMatchSecLevel2 = fingerMatchSecLevel;
                }
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x035d  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        char c;
        char c2;
        int i;
        int intValue;
        Object[] PngjBadCrcException$1eba2e16;
        super.attachBaseContext(context);
        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature == null) {
            char green = (char) (14830 - Color.green(0));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 721;
            byte b = $$a[18];
            byte b2 = (byte) (b + 1);
            Object[] objArr = new Object[1];
            b(b, b2, b2, objArr);
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(green, tapTimeout, edgeSlop, -815159504, false, (String) objArr[0], null);
        }
        long j = ((Field) PngjBadSignature).getLong(null);
        try {
            try {
                if (j != -1) {
                    getProcessingTime = (getFingerPrintQualityScore + 57) % 128;
                    long j2 = j + 4611686018427387952L;
                    c = 18;
                    c2 = 20;
                    Object[] objArr2 = new Object[1];
                    c("\u0003\u0017\f\u0016\u000f\u000b\u0006\u0016\u0015\u0010\u0016\u0001\u0006\u0010\u0001\u0005\n\t\u0010\u0011\u0004\t", TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 22, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 60), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    i = 763257050;
                    Object[] objArr3 = new Object[1];
                    c("\u0005\u0010\u0018\u0012\u0010\u000b\b\u0002\b\u0015\u0014\u0005\u000b\n㘜", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, (byte) ('M' - AndroidCharacter.getMirror('0')), objArr3);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature2 == null) {
                            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 14830);
                            int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                            int absoluteGravity = 721 - Gravity.getAbsoluteGravity(0, 0);
                            byte b3 = (byte) ($$b & 27);
                            byte b4 = $$a[20];
                            Object[] objArr4 = new Object[1];
                            b(b3, (byte) (b4 - 1), b4, objArr4);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarSize, i2, absoluteGravity, -779023007, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) PngjBadSignature2).get(null);
                        PngjBadCrcException$1eba2e16 = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i3 = ((int[]) objArr5[3])[0];
                        int i4 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int c3 = defpackage.a.c((~(((int) Runtime.getRuntime().totalMemory()) | 1065997548)) | 31431574, 529, (((~((~0) | 1065997548)) | 5638930) * 529) - 1435847140, -1432701858);
                        int i5 = c3 ^ (c3 << 13);
                        int i6 = i5 ^ (i5 >>> 17);
                        ((int[]) PngjBadCrcException$1eba2e16[1])[0] = i6 ^ (i6 << 5);
                        getFingerPrintQualityScore = (getProcessingTime + 37) % 128;
                        if (((int[]) PngjBadCrcException$1eba2e16[3])[0] == ((int[]) PngjBadCrcException$1eba2e16[0])[0]) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr2 = (String[]) PngjBadCrcException$1eba2e16[2];
                            if (strArr2 == null) {
                                throw null;
                            }
                            for (String str : strArr2) {
                                arrayList.add(str);
                            }
                            throw null;
                        }
                        Object[] objArr6 = {new int[]{0}, new int[1], 0, new int[]{0}};
                        int i7 = ((int[]) PngjBadCrcException$1eba2e16[1])[0];
                        int i8 = ((int[]) PngjBadCrcException$1eba2e16[3])[0];
                        int i9 = ((int[]) PngjBadCrcException$1eba2e16[0])[0];
                        String[] strArr3 = (String[]) PngjBadCrcException$1eba2e16[2];
                        int uptimeMillis = (int) SystemClock.uptimeMillis();
                        int i10 = ~uptimeMillis;
                        int i11 = (~((-953366007) | i10)) | 939537568 | (~(81199967 | i10));
                        int c4 = defpackage.a.c((~((-81199968) | i10)) | (~(i10 | 953366006)), 590, (i11 * (-1180)) + (((~(uptimeMillis | (-67371530))) | i11) * 590) + 216453463, i7);
                        int i12 = c4 ^ (c4 << 13);
                        int i13 = i12 ^ (i12 >>> 17);
                        ((int[]) objArr6[1])[0] = i13 ^ (i13 << 5);
                        getFingerPrintQualityScore = (getProcessingTime + 33) % 128;
                        return;
                    }
                } else {
                    c = 18;
                    c2 = 20;
                    i = 763257050;
                }
                Object[] objArr7 = new Object[1];
                c("\u0003\u0017\f\u0016\u000f\u000b\u0006\u0016\u0015\u0010\u0016\u0001\u0006\u0010\u0001\u0005\n\t\u0010\u0011\u0004\t", 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (59 - Drawable.resolveOpacity(0, 0)), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c("\u0005\u0010\u0018\u0012\u0010\u000b\b\u0002\b\u0015\u0014\u0005\u000b\n㘜", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29), objArr8);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr8[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
                if (PngjBadSignature3 == null) {
                    char size = (char) (14830 - View.MeasureSpec.getSize(0));
                    int pressedStateDuration = 28 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 722;
                    byte b5 = $$a[c];
                    byte b6 = (byte) (b5 + 1);
                    Object[] objArr9 = new Object[1];
                    b(b5, b6, b6, objArr9);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(size, pressedStateDuration, modifierMetaStateMask, -815159504, false, (String) objArr9[0], null);
                }
                ((Field) PngjBadSignature3).set(null, valueOf2);
                if (((int[]) PngjBadCrcException$1eba2e16[3])[0] == ((int[]) PngjBadCrcException$1eba2e16[0])[0]) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr10 = {1621346766};
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature4 == null) {
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.red(0), Color.blue(0) + 24, KeyEvent.getDeadChar(0, 0) + 697, 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjBadCrcException$1eba2e16 = PngjBadCrcException.valueOf.PngjBadSignature.PngjBadCrcException$1eba2e16(intValue, ((Constructor) PngjBadSignature4).newInstance(objArr10), -1432701858);
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
            if (PngjBadSignature5 == null) {
                char red = (char) (Color.red(0) + 14830);
                int indexOf = 27 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                int offsetAfter = TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 721;
                byte b7 = (byte) ($$b & 27);
                byte b8 = $$a[c2];
                Object[] objArr11 = new Object[1];
                b(b7, (byte) (b8 - 1), b8, objArr11);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(red, indexOf, offsetAfter, -779023007, false, (String) objArr11[0], null);
            }
            ((Field) PngjBadSignature5).set(null, PngjBadCrcException$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        Object[] objArr12 = new Object[1];
        c("\r\u0016\r\u0003\u0014\u0010\u0003\u0017\u000b\u0017\u0003\u0002\n\u0001\t\u000b", 15 - MotionEvent.axisFromString(BuildConfig.FLAVOR), (byte) (13 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)), objArr12);
        Class<?> cls3 = Class.forName((String) objArr12[0]);
        Object[] objArr13 = new Object[1];
        c("\f\u0005\b\u0010\u0005\u000f\u0001\u0002\b\u0018\f\u0015\u0006\u000f\b\u0007", 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (ExpandableListView.getPackedPositionGroup(0L) + 6), objArr13);
        intValue = ((Integer) cls3.getMethod((String) objArr13[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity
    public final void getPadSub2() {
        getFingerPrintQualityScore = (getProcessingTime + 9) % 128;
        super.getPadSub2();
        try {
            IdentyUser B = IdentySdk.getInstance().B();
            boolean isEnrolled = IdentySdk.getInstance().isEnrolled(new FingerDetectionMode[]{this.PngjExceptionInternal}, B);
            IdentySdk identySdk = IdentySdk.getInstance();
            this.values = com.identy.f.PngjBadSignature.PngjException(identySdk.getData, new FingerDetectionMode[]{this.PngjExceptionInternal}, B);
            if (isEnrolled) {
                return;
            }
            getFingerPrintQualityScore = (getProcessingTime + 123) % 128;
            Toast.makeText(this, "Fingers not registered .. please register first", 1).show();
            finish();
        } catch (Exception unused) {
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = getFingerPrintQualityScore + 83;
        getProcessingTime = i % 128;
        int i2 = i % 2;
        super.onCreate(bundle);
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        int i = getProcessingTime + 93;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onPause();
        if (i2 != 0) {
            int i3 = 26 / 0;
        }
        getFingerPrintQualityScore = (getProcessingTime + 125) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = getProcessingTime + 33;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onResume();
        if (i2 != 0) {
            int i3 = 30 / 0;
        }
        int i4 = getProcessingTime + 63;
        getFingerPrintQualityScore = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        int i = getProcessingTime + 121;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onStart();
        if (i2 != 0) {
            throw null;
        }
        int i3 = getFingerPrintQualityScore + 79;
        getProcessingTime = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        super.values(bundle);
        try {
            try {
                this.onErrorResponse = new getFingers(this, this, this.PngjExceptionInternal, IdentySdk.getInstance().u(), this.PngjUnsupportedException);
                getProcessingTime = (getFingerPrintQualityScore + 79) % 128;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
