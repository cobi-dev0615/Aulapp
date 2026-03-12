package com.identy;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.identy.app.users.IdentyUser;
import com.identy.b.PngjBadSignature;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.FingerMatchSecLevel;
import com.identy.enums.Hand;
import com.identy.values;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class Verify4FActivity extends FingerActivity {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    private static boolean getFingerPrintQualityScore;
    private static boolean getMatchingTime;
    private static int getNfiq1Score;
    private static int getOveralTimetaken;
    private static int getScore;
    private static char[] valueOf;
    protected HashMap values = new HashMap();
    int PngjBadCrcException = 0;

    public class PngjException implements org.cameracontroller.PngjBadSignature.values {
        private /* synthetic */ HashMap PngjBadCrcException;
        private /* synthetic */ FingerMatchSecLevel PngjBadSignature;
        private /* synthetic */ HashMap valueOf;
        private /* synthetic */ long values;

        public class PngjBadCrcException implements DialogInterface.OnDismissListener {
            public PngjBadCrcException() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Verify4FActivity verify4FActivity = Verify4FActivity.this;
                verify4FActivity.values((Pair<Hand, Finger>[]) verify4FActivity.onErrorResponse.PngjExceptionInternal());
            }
        }

        public PngjException(HashMap hashMap, FingerMatchSecLevel fingerMatchSecLevel, long j, HashMap hashMap2) {
            this.valueOf = hashMap;
            this.PngjBadSignature = fingerMatchSecLevel;
            this.values = j;
            this.PngjBadCrcException = hashMap2;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0205 A[Catch: Exception -> 0x0284, TryCatch #6 {Exception -> 0x0284, blocks: (B:53:0x01c4, B:55:0x01cc, B:56:0x01d0, B:58:0x01d6, B:59:0x01d8, B:61:0x01e0, B:65:0x01ec, B:67:0x01fb, B:69:0x0205, B:71:0x021e, B:73:0x0228, B:75:0x0230, B:76:0x0267, B:78:0x023e, B:80:0x0246, B:81:0x0254, B:82:0x026f, B:84:0x0279, B:86:0x027f), top: B:52:0x01c4 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x021e A[Catch: Exception -> 0x0284, TryCatch #6 {Exception -> 0x0284, blocks: (B:53:0x01c4, B:55:0x01cc, B:56:0x01d0, B:58:0x01d6, B:59:0x01d8, B:61:0x01e0, B:65:0x01ec, B:67:0x01fb, B:69:0x0205, B:71:0x021e, B:73:0x0228, B:75:0x0230, B:76:0x0267, B:78:0x023e, B:80:0x0246, B:81:0x0254, B:82:0x026f, B:84:0x0279, B:86:0x027f), top: B:52:0x01c4 }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.identy.b.PngjBadSignature.values
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void values() {
            VerifyResult verifyResult;
            int i;
            com.identy.e1 e1Var;
            com.identy.valueOf valueof;
            Verify4FActivity verify4FActivity = Verify4FActivity.this;
            int i2 = verify4FActivity.PngjBadCrcException + 1;
            verify4FActivity.PngjBadCrcException = i2;
            if (i2 != this.valueOf.size() || !FingerActivity.PngjPrematureEnding) {
                return;
            }
            VerifyResult verifyResult2 = null;
            try {
                HashMap hashMap = new HashMap();
                for (Object _entry : this.valueOf.entrySet()) {
                    Map.Entry entry = (Map.Entry) _entry;
                    hashMap.put(Integer.valueOf(Position.getFromHandFinger((Pair) entry.getKey()).ordinal()), ((PngjExceptionInternal) Verify4FActivity.this.values.get(entry.getKey())).PngjBadCrcException());
                }
                verifyResult = Fpnative.matchCaptured(com.identy.e1.values, hashMap, this.PngjBadSignature.ordinal());
            } catch (Exception unused) {
            }
            if (verifyResult == null) {
                return;
            }
            try {
                VerifyResult verifyResult3 = null;
                for (Object _entry2 : this.valueOf.entrySet()) {
                    Map.Entry entry2 = (Map.Entry) _entry2;
                    verifyResult3 = new VerifyResult(verifyResult.getEnrollmentTs());
                    verifyResult3.setMatched(verifyResult.isMatched());
                    verifyResult3.setScore(verifyResult.getScore());
                    verifyResult3.positionMismatched = verifyResult.positionMismatched;
                    verifyResult3.setMatched_true_up_to_security_level(verifyResult.matched_true_up_to_security_level);
                    com.identy.getProcessingTime getprocessingtime = (com.identy.getProcessingTime) entry2.getValue();
                    getprocessingtime.PngjBadCrcException(verifyResult.isMatched());
                    ((com.identy.IdentyA) getprocessingtime).values = Math.round(verifyResult.getFingerScore((Pair) entry2.getKey()));
                    Verify4FActivity.this.onErrorResponse.Capture2IndexActivity.PngjBadSignature.put((Pair) entry2.getKey(), Integer.valueOf(((com.identy.IdentyA) getprocessingtime).values));
                }
                Verify4FActivity.this.onErrorResponse.Capture2IndexActivity.getFingerPrintQualityScore = verifyResult.isMatched() ? 1 : 2;
                try {
                    Verify4FActivity.this.onErrorResponse.valueOf();
                } catch (Exception unused2) {
                }
                com.identy.e1.values(new Object[]{Verify4FActivity.this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                Verify4FActivity verify4FActivity2 = Verify4FActivity.this;
                FingerDetectionMode fingerDetectionMode = verify4FActivity2.PngjExceptionInternal;
                com.identy.e1 e1Var2 = verify4FActivity2.onErrorResponse;
                int i3 = e1Var2.getEncryptedTemplates;
                HashMap hashMap2 = this.valueOf;
                long j = e1Var2.toString;
                long j2 = e1Var2.Enroll2IndexActivity;
                try {
                    long timeInMillis = Calendar.getInstance().getTimeInMillis() - this.values;
                    byte[] PngjPrematureEnding = Verify4FActivity.this.onErrorResponse.PngjPrematureEnding();
                    com.identy.e1 e1Var3 = Verify4FActivity.this.onErrorResponse;
                    identySdk.a(fingerDetectionMode, i3, hashMap2, verifyResult3, j, j2, timeInMillis, PngjPrematureEnding, e1Var3.setFoundMatchingTemplates + e1Var3.Enroll2IndexActivity);
                } catch (Exception unused3) {
                    verifyResult2 = verifyResult;
                    verifyResult = verifyResult2;
                    i = IdentySdk.getInstance().getAllowedAttempts();
                    e1Var = Verify4FActivity.this.onErrorResponse;
                    e1Var.getEncryptedTemplates++;
                    if (!((com.identy.IdentyA) this.valueOf.get(e1Var.PngjExceptionInternal()[0])).PngjOutputException()) {
                    }
                }
            } catch (Exception unused4) {
            }
            try {
                i = IdentySdk.getInstance().getAllowedAttempts();
            } catch (Exception e) {
                e.printStackTrace();
                i = 0;
            }
            e1Var = Verify4FActivity.this.onErrorResponse;
            e1Var.getEncryptedTemplates++;
            if (!((com.identy.IdentyA) this.valueOf.get(e1Var.PngjExceptionInternal()[0])).PngjOutputException()) {
                Verify4FActivity verify4FActivity3 = Verify4FActivity.this;
                if (verify4FActivity3.onErrorResponse.getEncryptedTemplates < i) {
                    verify4FActivity3.e1();
                    return;
                }
                try {
                    if (IdentySdk.getInstance().isDisplayTransactionAlerts()) {
                        com.identy.ui.c.a aVar = new com.identy.ui.c.a(Verify4FActivity.this);
                        aVar.PngjBadSignature = R.string.id_spoof_final_message;
                        aVar.PngjException = R.string.id_done;
                        aVar.values(new PngjBadCrcException()).show();
                    } else {
                        Verify4FActivity verify4FActivity4 = Verify4FActivity.this;
                        verify4FActivity4.values((Pair<Hand, Finger>[]) verify4FActivity4.onErrorResponse.PngjExceptionInternal());
                    }
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            try {
                Object obj = com.identy.valueOf.UNSUCCESS;
                com.identy.valueOf valueof2 = verifyResult.isMatched() ? com.identy.valueOf.SUCCESS : obj;
                if (valueof2.equals(obj)) {
                    valueof2 = com.identy.valueOf.RETAKE;
                }
                if (Verify4FActivity.this.onErrorResponse.getEncryptedTemplates >= i && valueof2.equals(com.identy.valueOf.RETAKE)) {
                    valueof = obj;
                    if (!valueof.equals(com.identy.valueOf.RETAKE)) {
                        try {
                            Verify4FActivity.this.Action.PngjException();
                        } catch (Exception unused5) {
                        }
                    }
                    if (!IdentySdk.getInstance().isDisplayPrints()) {
                        Verify4FActivity verify4FActivity5 = Verify4FActivity.this;
                        Verify4FActivity verify4FActivity6 = Verify4FActivity.this;
                        verify4FActivity5.getPadSub1 = new com.identy.ui.c.PngjBadCrcException(verify4FActivity6, this.valueOf, this.PngjBadCrcException, valueof, verify4FActivity6.getQualityScore);
                        Verify4FActivity.this.getPadSub1.show();
                        return;
                    }
                    if (!IdentySdk.getInstance().v()) {
                        if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                            Verify4FActivity.this.Attempt();
                            return;
                        } else {
                            Verify4FActivity.this.Action();
                            return;
                        }
                    }
                    if (valueof.equals(com.identy.valueOf.RETAKE)) {
                        Verify4FActivity verify4FActivity7 = Verify4FActivity.this;
                        Verify4FActivity verify4FActivity8 = Verify4FActivity.this;
                        verify4FActivity7.getPadSub1 = new com.identy.ui.c.getScore(verify4FActivity8, verify4FActivity8.getQualityScore);
                    } else if (valueof.equals(com.identy.valueOf.UNSUCCESS)) {
                        Verify4FActivity verify4FActivity9 = Verify4FActivity.this;
                        Verify4FActivity verify4FActivity10 = Verify4FActivity.this;
                        verify4FActivity9.getPadSub1 = new com.identy.ui.c.isQualityFailed(verify4FActivity10, verify4FActivity10.getQualityScore);
                    } else {
                        Verify4FActivity verify4FActivity11 = Verify4FActivity.this;
                        Verify4FActivity verify4FActivity12 = Verify4FActivity.this;
                        verify4FActivity11.getPadSub1 = new com.identy.ui.c.getFingerPrintQualityScore(verify4FActivity12, verify4FActivity12.getQualityScore, verify4FActivity12.PngjExceptionInternal, verify4FActivity12.onErrorResponse());
                    }
                    Verify4FActivity.this.getPadSub1.show();
                    return;
                }
                valueof = valueof2;
                if (!valueof.equals(com.identy.valueOf.RETAKE)) {
                }
                if (!IdentySdk.getInstance().isDisplayPrints()) {
                }
            } catch (Exception unused6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(short s, byte b, byte b2) {
        int i;
        byte[] bArr = $$c;
        int i2 = 101 - (b * 4);
        int i3 = (s * 2) + 4;
        int i4 = b2 * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i2;
            int i8 = i3;
            int i9 = i8 + 1;
            i2 = (-i3) + i7;
            i3 = i9;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            int i10 = i2;
            i8 = i3;
            i3 = bArr[i3];
            i6 = i + 1;
            bArr3 = bArr;
            i7 = i10;
            int i92 = i8 + 1;
            i2 = (-i3) + i7;
            i3 = i92;
            bArr = bArr3;
            i = i6;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                return new String(bArr2, 0);
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i5) {
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
        getNfiq1Score = 0;
        getOveralTimetaken = 1;
        valueOf = new char[]{25550, 25531, 25537, 25535, 25532, 25542, 25595, 25520, 25552, 25526, 25521, 25538, 25530, 25568, 25529, 25536, 25528, 25533, 25567, 25543, 25523, 25540, 25573, 25541};
        getScore = -2081201363;
        getFingerPrintQualityScore = true;
        getMatchingTime = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        byte[] bArr = $$a;
        int i6 = 19 - (s * 6);
        int i7 = 21 - (i * 18);
        int i8 = 80 - (b * 4);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i5 = 0;
            int i9 = i7;
            int i10 = i9 + i8 + 5;
            int i11 = i7;
            i2 = i10;
            i3 = i11;
            bArr = bArr3;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i2;
            int i12 = i3 + 1;
            if (i5 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i13 = i2;
            i7 = i12;
            i8 = bArr[i12];
            bArr3 = bArr;
            i9 = i13;
            int i102 = i9 + i8 + 5;
            int i112 = i7;
            i2 = i102;
            i3 = i112;
            bArr = bArr3;
            i4 = i5;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i2;
            int i122 = i3 + 1;
            if (i5 == i6) {
            }
        } else {
            i2 = i8;
            i3 = i7;
            i4 = 0;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i2;
            int i1222 = i3 + 1;
            if (i5 == i6) {
            }
        }
    }

    private static void c(int[] iArr, int i, String str, String str2, Object[] objArr) throws Exception {
        char c;
        int i2;
        String str3 = str2;
        $10 = ($11 + 21) % 128;
        byte[] bArr = null;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : null;
        com.d.e.PngjExceptionInternal pngjExceptionInternal = new com.d.e.PngjExceptionInternal();
        char[] cArr = valueOf;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            $10 = ($11 + 1) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i3])};
                    Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                    if (PngjBadSignature == null) {
                        PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 27093), Process.getGidForName(BuildConfig.FLAVOR) + 38, 119 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -373889195, false, "b", new Class[]{cls});
                    }
                    cArr2[i3] = ((Character) ((Method) PngjBadSignature).invoke(null, objArr2)).charValue();
                    i3++;
                    $11 = ($10 + 49) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            cArr = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(getScore)};
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
        if (PngjBadSignature2 == null) {
            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 61713);
            int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33;
            int red = Color.red(0) + 278;
            byte b = (byte) ($$c[0] - 1);
            c = 1;
            byte b2 = b;
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(tapTimeout, i4, red, -1654917268, false, $$i(b, b2, b2), new Class[]{cls});
        } else {
            c = 1;
        }
        int intValue = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr3)).intValue();
        int i5 = -528960794;
        int i6 = 2;
        if (getMatchingTime) {
            int length2 = bArr2.length;
            pngjExceptionInternal.PngjException = length2;
            char[] cArr3 = new char[length2];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i7 = pngjExceptionInternal.values;
                int i8 = pngjExceptionInternal.PngjException;
                if (i7 >= i8) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i7] = (char) (cArr[bArr2[(i8 - 1) - i7] + i] - intValue);
                Object[] objArr4 = new Object[2];
                objArr4[c] = pngjExceptionInternal;
                objArr4[0] = pngjExceptionInternal;
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i5);
                if (PngjBadSignature3 == null) {
                    char resolveSize = (char) View.resolveSize(0, 0);
                    int keyRepeatDelay = 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int red2 = Color.red(0) + 549;
                    byte b3 = $$c[0];
                    byte b4 = (byte) (b3 - 1);
                    byte b5 = b3;
                    i2 = i5;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(resolveSize, keyRepeatDelay, red2, 479715165, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                } else {
                    i2 = i5;
                }
                ((Method) PngjBadSignature3).invoke(null, objArr4);
                i5 = i2;
            }
        } else if (getFingerPrintQualityScore) {
            $11 = ($10 + 33) % 128;
            int length3 = charArray.length;
            pngjExceptionInternal.PngjException = length3;
            char[] cArr4 = new char[length3];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i9 = pngjExceptionInternal.values;
                int i10 = pngjExceptionInternal.PngjException;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                $11 = ($10 + 21) % 128;
                cArr4[i9] = (char) (cArr[charArray[(i10 - 1) - i9] - i] - intValue);
                Object[] objArr5 = new Object[i6];
                objArr5[c] = pngjExceptionInternal;
                objArr5[0] = pngjExceptionInternal;
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                if (PngjBadSignature4 == null) {
                    char lastIndexOf = (char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1);
                    int i11 = 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int scrollBarSize = 549 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b6 = $$c[0];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = b6;
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, i11, scrollBarSize, 479715165, false, $$i(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature4).invoke(null, objArr5);
                i6 = 2;
            }
        } else {
            int length4 = iArr.length;
            pngjExceptionInternal.PngjException = length4;
            char[] cArr5 = new char[length4];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i12 = pngjExceptionInternal.values;
                int i13 = pngjExceptionInternal.PngjException;
                if (i12 >= i13) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i12] = (char) (cArr[iArr[(i13 - 1) - i12] - i] - intValue);
                    pngjExceptionInternal.values = i12 + 1;
                }
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{126, -62, -66, -22, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6};
        $$b = 176;
    }

    public static void init$1() {
        $$c = new byte[]{1, 119, -67, -47};
        $$f = 38;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        FingerMatchSecLevel fingerMatchSecLevel;
        long j;
        int i = getOveralTimetaken + 53;
        getNfiq1Score = i % 128;
        if (i % 2 != 0) {
            super.PngjException(hashMap, hashMap2, bitmap, z, z2);
            throw null;
        }
        super.PngjException(hashMap, hashMap2, bitmap, z, z2);
        if (z && this.getAsHighestSecurityLevelReached) {
            try {
                this.onErrorResponse.PngjException(R.string.id_finger_matching);
                getOveralTimetaken = (getNfiq1Score + 11) % 128;
            } catch (Exception unused) {
            }
            Calendar.getInstance().getTimeInMillis();
            try {
                FingerMatchSecLevel fingerMatchSecLevel2 = IdentySdk.getInstance().PngjOutputException;
                this.PngjBadCrcException = 0;
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                getNfiq1Score = (getOveralTimetaken + 99) % 128;
                for (Map.Entry<Pair<Hand, Finger>, a> entry : hashMap.entrySet()) {
                    a value = entry.getValue();
                    try {
                        new com.identy.b.PngjBadSignature();
                        PngjExceptionInternal pngjExceptionInternal = (PngjExceptionInternal) this.values.get(entry.getKey());
                        fingerMatchSecLevel = fingerMatchSecLevel2;
                        j = timeInMillis;
                        try {
                            new PngjBadSignature.AsyncTaskC0018PngjBadSignature(new PngjException(hashMap, fingerMatchSecLevel2, timeInMillis, hashMap2), this, pngjExceptionInternal, value, com.identy.e1.PngjInputException).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new a[0]);
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
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0327  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        int i;
        float f;
        int intValue;
        Object[] values$1eba2e16;
        super.attachBaseContext(context);
        Object PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        int i2 = 0;
        if (PngjBadSignature == null) {
            char c = (char) (14831 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int myTid = 28 - (Process.myTid() >> 22);
            int i3 = 722 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            byte b = $$a[20];
            byte b2 = (byte) (b - 1);
            Object[] objArr = new Object[1];
            b(b2, b2, b, objArr);
            PngjBadSignature = com.d.e.a.PngjBadCrcException.PngjBadSignature(c, myTid, i3, -815159504, false, (String) objArr[0], null);
        }
        long j = ((Field) PngjBadSignature).getLong(null);
        try {
            try {
                if (j != -1) {
                    getNfiq1Score = (getOveralTimetaken + 111) % 128;
                    long j2 = j + 4611686018427387878L;
                    i = 864471691;
                    Object[] objArr2 = new Object[1];
                    c(null, ImageFormat.getBitsPerPixel(0) + 128, null, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    f = 0.0f;
                    Object[] objArr3 = new Object[1];
                    c(null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr3);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        getOveralTimetaken = (getNfiq1Score + 77) % 128;
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature2 == null) {
                            char indexOf = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 14831);
                            int defaultSize = 28 - View.getDefaultSize(0, 0);
                            int touchSlop = 721 - (ViewConfiguration.getTouchSlop() >> 8);
                            byte b3 = $$a[20];
                            byte b4 = (byte) (b3 - 1);
                            Object[] objArr4 = new Object[1];
                            b(b3, b4, b4, objArr4);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, defaultSize, touchSlop, -779023007, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) PngjBadSignature2).get(null);
                        values$1eba2e16 = new Object[]{new int[]{0}, new int[1], 0, new int[]{0}};
                        int i4 = ((int[]) objArr5[3])[0];
                        int i5 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int c2 = defpackage.a.c((~(System.identityHashCode(this) | 1039032319)) | 263849, 446, (((~((~0) | 2365097)) | 1036667222) * 446) - 820357313, -1544662296);
                        int i6 = c2 ^ (c2 << 13);
                        int i7 = i6 ^ (i6 >>> 17);
                        ((int[]) values$1eba2e16[1])[0] = i7 ^ (i7 << 5);
                        getOveralTimetaken = (getNfiq1Score + 77) % 128;
                        if (((int[]) values$1eba2e16[3])[0] != ((int[]) values$1eba2e16[0])[0]) {
                            Object[] objArr6 = {new int[]{0}, new int[1], 0, new int[]{0}};
                            int i8 = ((int[]) values$1eba2e16[1])[0];
                            int i9 = ((int[]) values$1eba2e16[3])[0];
                            int i10 = ((int[]) values$1eba2e16[0])[0];
                            String[] strArr2 = (String[]) values$1eba2e16[2];
                            int myPid = Process.myPid();
                            int c3 = defpackage.a.c((~(myPid | (-913085849))) | (-930985918), 433, (((~((-121480126) | myPid)) | (-913085849)) * (-433)) + ((~((~myPid) | (-809505793))) * 433) + 1866671594, i8);
                            int i11 = c3 ^ (c3 << 13);
                            int i12 = i11 ^ (i11 >>> 17);
                            ((int[]) objArr6[1])[0] = i12 ^ (i12 << 5);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) values$1eba2e16[2];
                        if (strArr3 == null) {
                            throw null;
                        }
                        while (i2 < strArr3.length) {
                            int i13 = getNfiq1Score + 113;
                            getOveralTimetaken = i13 % 128;
                            if (i13 % 2 == 0) {
                                arrayList.add(strArr3[i2]);
                                i2 += 123;
                            } else {
                                arrayList.add(strArr3[i2]);
                                i2++;
                            }
                        }
                        throw null;
                    }
                } else {
                    i = 864471691;
                    f = 0.0f;
                }
                Object[] objArr7 = new Object[1];
                c(null, View.combineMeasuredStates(0, 0) + 127, null, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr8);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr8[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature3 == null) {
                    char packedPositionType = (char) (14830 - ExpandableListView.getPackedPositionType(0L));
                    int defaultSize2 = View.getDefaultSize(0, 0) + 28;
                    int resolveSize = 721 - View.resolveSize(0, 0);
                    byte b5 = $$a[20];
                    byte b6 = (byte) (b5 - 1);
                    Object[] objArr9 = new Object[1];
                    b(b6, b6, b5, objArr9);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType, defaultSize2, resolveSize, -815159504, false, (String) objArr9[0], null);
                }
                ((Field) PngjBadSignature3).set(null, valueOf2);
                if (((int[]) values$1eba2e16[3])[0] != ((int[]) values$1eba2e16[0])[0]) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr10 = {-275138936};
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature4 == null) {
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 25 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), 698 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            values$1eba2e16 = values.PngjBadSignature.values$1eba2e16(intValue, ((Constructor) PngjBadSignature4).newInstance(objArr10), -41775340);
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature5 == null) {
                char rgb = (char) (Color.rgb(0, 0, 0) + 16792046);
                int indexOf2 = 28 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                int i14 = (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 720;
                byte b7 = $$a[20];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr11 = new Object[1];
                b(b7, b8, b8, objArr11);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(rgb, indexOf2, i14, -779023007, false, (String) objArr11[0], null);
            }
            ((Field) PngjBadSignature5).set(null, values$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
        Object[] objArr12 = new Object[1];
        c(null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0096\u0082\u0081\u008f\u0087\u0081\u0095\u0081\u0094", objArr12);
        Class<?> cls3 = Class.forName((String) objArr12[0]);
        Object[] objArr13 = new Object[1];
        c(null, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 127, null, "\u008c\u0083\u0085\u008e\u0098\u0088\u0081\u0097\u008a\u008b\u0086\u008b\u0082\u008c\u0083\u0086", objArr13);
        intValue = ((Integer) cls3.getMethod((String) objArr13[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity
    public final void getPadSub2() {
        super.getPadSub2();
        try {
            IdentyUser B = IdentySdk.getInstance().B();
            boolean isEnrolled = IdentySdk.getInstance().isEnrolled(new FingerDetectionMode[]{this.PngjExceptionInternal}, B);
            this.values = com.identy.f.PngjBadSignature.PngjException(IdentySdk.getInstance().getData, new FingerDetectionMode[]{this.PngjExceptionInternal}, B);
            if (!isEnrolled) {
                int i = getNfiq1Score + 117;
                getOveralTimetaken = i % 128;
                (i % 2 == 0 ? Toast.makeText(this, "Fingers not registered .. please register first", 0) : Toast.makeText(this, "Fingers not registered .. please register first", 1)).show();
                finish();
                return;
            }
        } catch (Exception unused) {
        }
        getNfiq1Score = (getOveralTimetaken + 95) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getOveralTimetaken = (getNfiq1Score + 105) % 128;
        super.onCreate(bundle);
        int i = getOveralTimetaken + 97;
        getNfiq1Score = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        int i = getNfiq1Score + 63;
        getOveralTimetaken = i % 128;
        int i2 = i % 2;
        super.onPause();
        if (i2 == 0) {
            int i3 = 20 / 0;
        }
        int i4 = getNfiq1Score + 19;
        getOveralTimetaken = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        getNfiq1Score = (getOveralTimetaken + 53) % 128;
        super.onResume();
        int i = getOveralTimetaken + 73;
        getNfiq1Score = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        getOveralTimetaken = (getNfiq1Score + 27) % 128;
        super.onStart();
        int i = getOveralTimetaken + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground;
        getNfiq1Score = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        super.values(bundle);
        try {
            try {
                this.onErrorResponse = new com.identy.getOveralTimetaken(this, this, this.PngjExceptionInternal, IdentySdk.getInstance().u(), this.PngjUnsupportedException, true);
                getOveralTimetaken = (getNfiq1Score + 57) % 128;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
