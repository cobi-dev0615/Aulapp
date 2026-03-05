package com.identy;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import kotlin.jvm.internal.ByteCompanionObject;
import org.identy.nativealgo.NativeAlgoUtils;

/* loaded from: classes2.dex */
public class Verify2TActivity extends FingerActivity {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int getFingerPrintQualityScore;
    private static int getScore;
    private static int valueOf;
    protected HashMap values = new HashMap();
    int PngjBadCrcException = 0;

    public class PngjBadSignature implements PngjBadSignature.values {
        private /* synthetic */ HashMap PngjBadSignature;
        private /* synthetic */ HashMap PngjException;
        private /* synthetic */ long valueOf;
        private /* synthetic */ FingerMatchSecLevel values;

        public class PngjBadCrcException implements DialogInterface.OnDismissListener {
            public PngjBadCrcException() {
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Verify2TActivity verify2TActivity = Verify2TActivity.this;
                verify2TActivity.values((Pair<Hand, Finger>[]) verify2TActivity.onErrorResponse.PngjExceptionInternal());
            }
        }

        public PngjBadSignature(HashMap hashMap, FingerMatchSecLevel fingerMatchSecLevel, long j, HashMap hashMap2) {
            this.PngjException = hashMap;
            this.values = fingerMatchSecLevel;
            this.valueOf = j;
            this.PngjBadSignature = hashMap2;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.identy.b.PngjBadSignature.values
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void values() {
            VerifyResult verifyResult;
            int i;
            e1 e1Var;
            VerifyResult verifyResult2;
            IdentySdk identySdk;
            FingerDetectionMode fingerDetectionMode;
            int i2;
            HashMap hashMap;
            long j;
            long j2;
            Verify2TActivity verify2TActivity = Verify2TActivity.this;
            int i3 = verify2TActivity.PngjBadCrcException + 1;
            verify2TActivity.PngjBadCrcException = i3;
            if (i3 == this.PngjException.size() && FingerActivity.PngjPrematureEnding) {
                VerifyResult verifyResult3 = null;
                try {
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry : this.PngjException.entrySet()) {
                        hashMap2.put(Integer.valueOf(Position.getFromHandFinger((Pair) entry.getKey()).ordinal()), ((PngjExceptionInternal) Verify2TActivity.this.values.get(entry.getKey())).PngjBadCrcException());
                    }
                    verifyResult = Fpnative.matchCaptured(e1.values, hashMap2, this.values.ordinal());
                } catch (Exception unused) {
                }
                if (verifyResult == null) {
                    return;
                }
                try {
                    verifyResult2 = null;
                    for (Map.Entry entry2 : this.PngjException.entrySet()) {
                        verifyResult2 = new VerifyResult(verifyResult.getEnrollmentTs());
                        verifyResult2.setMatched(verifyResult.isMatched());
                        verifyResult2.positionMismatched = verifyResult.positionMismatched;
                        verifyResult2.setMatched_true_up_to_security_level(verifyResult.matched_true_up_to_security_level);
                        verifyResult2.setScore((int) Math.round(verifyResult.getScore()));
                        getProcessingTime getprocessingtime = (getProcessingTime) entry2.getValue();
                        getprocessingtime.PngjBadCrcException(verifyResult.isMatched());
                        ((a) getprocessingtime).values = Math.round(verifyResult.getFingerScore((Pair) entry2.getKey()));
                        Verify2TActivity.this.onErrorResponse.Capture2IndexActivity.PngjBadSignature.put((Pair) entry2.getKey(), Integer.valueOf(((a) getprocessingtime).values));
                    }
                    Verify2TActivity.this.onErrorResponse.Capture2IndexActivity.getFingerPrintQualityScore = verifyResult.isMatched() ? 1 : 2;
                    try {
                        Verify2TActivity.this.onErrorResponse.valueOf();
                    } catch (Exception unused2) {
                    }
                    e1.values(new Object[]{Verify2TActivity.this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                    identySdk = IdentySdk.getInstance();
                    Verify2TActivity verify2TActivity2 = Verify2TActivity.this;
                    fingerDetectionMode = verify2TActivity2.PngjExceptionInternal;
                    e1 e1Var2 = verify2TActivity2.onErrorResponse;
                    i2 = e1Var2.getEncryptedTemplates;
                    hashMap = this.PngjException;
                    j = e1Var2.toString;
                    j2 = e1Var2.Enroll2IndexActivity;
                } catch (Exception unused3) {
                }
                try {
                    long timeInMillis = Calendar.getInstance().getTimeInMillis() - this.valueOf;
                    byte[] PngjPrematureEnding = Verify2TActivity.this.onErrorResponse.PngjPrematureEnding();
                    e1 e1Var3 = Verify2TActivity.this.onErrorResponse;
                    identySdk.a(fingerDetectionMode, i2, hashMap, verifyResult2, j, j2, timeInMillis, PngjPrematureEnding, e1Var3.setFoundMatchingTemplates + e1Var3.Enroll2IndexActivity);
                } catch (Exception unused4) {
                    verifyResult3 = verifyResult;
                    verifyResult = verifyResult3;
                    i = IdentySdk.getInstance().getAllowedAttempts();
                    e1Var = Verify2TActivity.this.onErrorResponse;
                    e1Var.getEncryptedTemplates++;
                    if (!((a) this.PngjException.get(e1Var.PngjExceptionInternal()[0])).PngjOutputException()) {
                    }
                }
                try {
                    i = IdentySdk.getInstance().getAllowedAttempts();
                } catch (Exception e) {
                    e.printStackTrace();
                    i = 0;
                }
                e1Var = Verify2TActivity.this.onErrorResponse;
                e1Var.getEncryptedTemplates++;
                if (!((a) this.PngjException.get(e1Var.PngjExceptionInternal()[0])).PngjOutputException()) {
                    Verify2TActivity verify2TActivity3 = Verify2TActivity.this;
                    if (verify2TActivity3.onErrorResponse.getEncryptedTemplates < i) {
                        verify2TActivity3.e1();
                        return;
                    }
                    try {
                        if (IdentySdk.getInstance().isDisplayTransactionAlerts()) {
                            com.identy.ui.c.a aVar = new com.identy.ui.c.a(Verify2TActivity.this);
                            aVar.PngjBadSignature = R.string.id_spoof_final_message;
                            aVar.PngjException = R.string.id_done;
                            aVar.values(new PngjBadCrcException()).show();
                        } else {
                            Verify2TActivity verify2TActivity4 = Verify2TActivity.this;
                            verify2TActivity4.values((Pair<Hand, Finger>[]) verify2TActivity4.onErrorResponse.PngjExceptionInternal());
                        }
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
                try {
                    valueOf valueof = valueOf.UNSUCCESS;
                    if (verifyResult.isMatched()) {
                        valueof = valueOf.SUCCESS;
                    }
                    valueOf valueof2 = valueof;
                    if (!valueof2.equals(valueOf.RETAKE)) {
                        try {
                            Verify2TActivity.this.Action.PngjException();
                        } catch (Exception unused5) {
                        }
                    }
                    if (IdentySdk.getInstance().isDisplayPrints()) {
                        Verify2TActivity verify2TActivity5 = Verify2TActivity.this;
                        Verify2TActivity verify2TActivity6 = Verify2TActivity.this;
                        verify2TActivity5.getPadSub1 = new com.identy.ui.c.PngjException(verify2TActivity6, this.PngjException, this.PngjBadSignature, valueof2, verify2TActivity6.getQualityScore);
                        Verify2TActivity.this.getPadSub1.show();
                        return;
                    }
                    if (!IdentySdk.getInstance().v()) {
                        if (IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                            Verify2TActivity.this.Attempt();
                            return;
                        } else {
                            Verify2TActivity.this.Action();
                            return;
                        }
                    }
                    if (valueof2.equals(valueOf.RETAKE)) {
                        Verify2TActivity verify2TActivity7 = Verify2TActivity.this;
                        Verify2TActivity verify2TActivity8 = Verify2TActivity.this;
                        verify2TActivity7.getPadSub1 = new com.identy.ui.c.getScore(verify2TActivity8, verify2TActivity8.getQualityScore);
                    } else if (valueof2.equals(valueOf.UNSUCCESS)) {
                        Verify2TActivity verify2TActivity9 = Verify2TActivity.this;
                        Verify2TActivity verify2TActivity10 = Verify2TActivity.this;
                        verify2TActivity9.getPadSub1 = new com.identy.ui.c.isQualityFailed(verify2TActivity10, verify2TActivity10.getQualityScore);
                    } else {
                        Verify2TActivity verify2TActivity11 = Verify2TActivity.this;
                        Verify2TActivity verify2TActivity12 = Verify2TActivity.this;
                        verify2TActivity11.getPadSub1 = new com.identy.ui.c.getFingerPrintQualityScore(verify2TActivity12, verify2TActivity12.getQualityScore, verify2TActivity12.PngjExceptionInternal, verify2TActivity12.onErrorResponse());
                    }
                    Verify2TActivity.this.getPadSub1.show();
                } catch (Exception unused6) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(byte b, short s, byte b2) {
        int i;
        int i2 = 104 - (s * 2);
        int i3 = b2 * 4;
        int i4 = 4 - (b * 3);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i4;
            int i6 = i3;
            i = 0;
            int i7 = i5 + 1;
            i2 = i4 + (-i6);
            i4 = i7;
            bArr2[i] = (byte) i2;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i4];
            i++;
            int i8 = i2;
            i5 = i4;
            i4 = i8;
            int i72 = i5 + 1;
            i2 = i4 + (-i6);
            i4 = i72;
            bArr2[i] = (byte) i2;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i3) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getFingerPrintQualityScore = 0;
        getScore = 1;
        valueOf = 97773872;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b * 18) + 4;
        int i5 = 80 - (b2 * 2);
        byte[] bArr = $$a;
        int i6 = i * 6;
        byte[] bArr2 = new byte[i6 + 13];
        int i7 = i6 + 12;
        if (bArr == null) {
            int i8 = i7;
            i2 = i4;
            i3 = 0;
            i4 = i4 + i8 + 5;
            i2++;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i2];
            i3++;
            i4 = i4 + i8 + 5;
            i2++;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i2 = i4;
            i4 = i5;
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, boolean z, String str, int i2, int i3, Object[] objArr) {
        int i4;
        char[] cArr;
        Throwable cause;
        int i5;
        char c;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.d.e.Action action = new com.d.e.Action();
        char[] cArr2 = new char[i];
        int i6 = 0;
        action.valueOf = 0;
        while (true) {
            int i7 = action.valueOf;
            if (i7 >= i) {
                break;
            }
            $11 = ($10 + 49) % 128;
            char c2 = charArray[i7];
            action.values = c2;
            char c3 = (char) (i3 + c2);
            cArr2[i7] = c3;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(valueOf);
                objArr2[i6] = Integer.valueOf(c3);
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(610361420);
                if (PngjBadSignature2 == null) {
                    char indexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', i6));
                    int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int indexOf2 = 1531 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, i6);
                    c = 1;
                    byte b = (byte) i6;
                    i5 = i6;
                    byte b2 = b;
                    String $$i = $$i(b, b2, b2);
                    Class cls = Integer.TYPE;
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, keyRepeatTimeout, indexOf2, -661778953, false, $$i, new Class[]{cls, cls});
                } else {
                    i5 = i6;
                    c = 1;
                }
                cArr2[i7] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[c] = action;
                objArr3[i5] = action;
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                if (PngjBadSignature3 == null) {
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1)) + 40, 189 - Process.getGidForName(BuildConfig.FLAVOR), 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr3);
                i6 = i5;
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
        int i8 = i6;
        if (i2 > 0) {
            action.PngjException = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, i8, cArr3, i8, i);
            int i9 = action.PngjException;
            System.arraycopy(cArr3, i8, cArr2, i - i9, i9);
            int i10 = action.PngjException;
            System.arraycopy(cArr3, i10, cArr2, i8, i - i10);
        }
        if (z) {
            int i11 = $11 + 87;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i];
                i4 = 1;
                action.valueOf = 1;
            } else {
                i4 = 1;
                cArr = new char[i];
                action.valueOf = 0;
            }
            while (true) {
                int i12 = action.valueOf;
                if (i12 >= i) {
                    break;
                }
                cArr[i12] = cArr2[(i - i12) - i4];
                Object[] objArr4 = new Object[2];
                objArr4[i4] = action;
                objArr4[0] = action;
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-743328348);
                if (PngjBadSignature4 == null) {
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0)), 40 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 190, 794744863, false, "j", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature4).invoke(null, objArr4);
                $10 = ($11 + 21) % 128;
            }
            cArr2 = cArr;
        }
        objArr[0] = new String(cArr2);
    }

    public static void init$0() {
        $$a = new byte[]{37, -49, ByteCompanionObject.MAX_VALUE, 88, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6};
        $$b = 143;
    }

    public static void init$1() {
        $$c = new byte[]{126, 106, 85, 73};
        $$f = 161;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, a> hashMap, HashMap<Pair<Hand, Finger>, a> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        FingerMatchSecLevel fingerMatchSecLevel;
        long j;
        PngjExceptionInternal pngjExceptionInternal;
        int i = getScore + 79;
        getFingerPrintQualityScore = i % 128;
        if (i % 2 != 0) {
            super.PngjException(hashMap, hashMap2, bitmap, z, z2);
            int i2 = 94 / 0;
            if (!z) {
                return;
            }
        } else {
            super.PngjException(hashMap, hashMap2, bitmap, z, z2);
            if (!z) {
                return;
            }
        }
        if (this.getAsHighestSecurityLevelReached) {
            this.onErrorResponse.getNfiq1Score = new ProgressDialog(this);
            try {
                this.onErrorResponse.getNfiq1Score.setTitle(BuildConfig.FLAVOR);
                this.onErrorResponse.getNfiq1Score.setCancelable(false);
                this.onErrorResponse.getNfiq1Score.setMessage("matching ...");
                if (FingerActivity.PngjPrematureEnding) {
                    getScore = (getFingerPrintQualityScore + 113) % 128;
                    this.onErrorResponse.getNfiq1Score.show();
                }
            } catch (Exception unused) {
            }
            try {
                FingerMatchSecLevel fingerMatchSecLevel2 = IdentySdk.getInstance().PngjOutputException;
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                this.PngjBadCrcException = 0;
                getFingerPrintQualityScore = (getScore + 29) % 128;
                for (Map.Entry<Pair<Hand, Finger>, a> entry : hashMap.entrySet()) {
                    a value = entry.getValue();
                    try {
                        new com.identy.b.PngjBadSignature();
                        pngjExceptionInternal = (PngjExceptionInternal) this.values.get(entry.getKey());
                        fingerMatchSecLevel = fingerMatchSecLevel2;
                        j = timeInMillis;
                    } catch (Exception unused2) {
                        fingerMatchSecLevel = fingerMatchSecLevel2;
                        j = timeInMillis;
                    }
                    try {
                        new PngjBadSignature.AsyncTaskC0018PngjBadSignature(new PngjBadSignature(hashMap, fingerMatchSecLevel2, timeInMillis, hashMap2), this, pngjExceptionInternal, value, e1.PngjInputException).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new a[0]);
                    } catch (Exception unused3) {
                        try {
                            this.onErrorResponse.valueOf();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        fingerMatchSecLevel2 = fingerMatchSecLevel;
                        timeInMillis = j;
                    }
                    fingerMatchSecLevel2 = fingerMatchSecLevel;
                    timeInMillis = j;
                }
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0411  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        char c;
        int i;
        int intValue;
        Object[] PngjException$1eba2e16;
        char c2;
        int i2;
        int i3;
        int i4 = getFingerPrintQualityScore + 25;
        getScore = i4 % 128;
        if (i4 % 2 == 0) {
            super.attachBaseContext(context);
            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
            if (PngjBadSignature2 == null) {
                char indexOf = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 14831);
                int i5 = 27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i6 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 720;
                byte b = $$a[20];
                byte b2 = (byte) (b - 1);
                Object[] objArr = new Object[1];
                b(b, b2, b2, objArr);
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, i5, i6, -815159504, false, (String) objArr[0], null);
            }
            ((Field) PngjBadSignature2).getLong(null);
            throw null;
        }
        super.attachBaseContext(context);
        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature3 == null) {
            char maximumFlingVelocity = (char) (14830 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int offsetAfter = TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 28;
            int i7 = 722 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            byte b3 = $$a[20];
            byte b4 = (byte) (b3 - 1);
            c = 2;
            i = 864471691;
            Object[] objArr2 = new Object[1];
            b(b3, b4, b4, objArr2);
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumFlingVelocity, offsetAfter, i7, -815159504, false, (String) objArr2[0], null);
        } else {
            c = 2;
            i = 864471691;
        }
        long j = ((Field) PngjBadSignature3).getLong(null);
        try {
            try {
                if (j != -1) {
                    getFingerPrintQualityScore = (getScore + 45) % 128;
                    long j2 = j + 4611686018427387815L;
                    Object[] objArr3 = new Object[1];
                    c(22 - KeyEvent.getDeadChar(0, 0), true, "\u0000\f\t￠\n\u0002\u0011\u0010\u0016\ufff0ￋ\u0010\fￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\b", ((Process.getThreadPriority(0) + 20) >> 6) + 21, MotionEvent.axisFromString(BuildConfig.FLAVOR) + 158, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0) + 16, false, "￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005\ufffa\t\f\ufffe�", 7 - ExpandableListView.getPackedPositionChild(0L), Color.blue(0) + 161, objArr4);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr4[0], null).invoke(null, null)).longValue()) {
                        getFingerPrintQualityScore = (getScore + 71) % 128;
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature4 == null) {
                            char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14830);
                            int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int minimumFlingVelocity = 721 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            byte b5 = $$a[20];
                            byte b6 = (byte) (b5 - 1);
                            byte b7 = b5;
                            Object[] objArr5 = new Object[1];
                            b(b6, b7, (byte) (b7 - 1), objArr5);
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumFlingVelocity2, scrollBarSize, minimumFlingVelocity, -779023007, false, (String) objArr5[0], null);
                        }
                        Object[] objArr6 = (Object[]) ((Field) PngjBadSignature4).get(null);
                        PngjException$1eba2e16 = new Object[4];
                        PngjException$1eba2e16[0] = new int[]{r5};
                        PngjException$1eba2e16[1] = new int[1];
                        PngjException$1eba2e16[3] = new int[]{r4};
                        int i8 = ((int[]) objArr6[3])[0];
                        int i9 = ((int[]) objArr6[0])[0];
                        PngjException$1eba2e16[c] = (String[]) objArr6[c];
                        int maxMemory = (int) Runtime.getRuntime().maxMemory();
                        int c3 = defpackage.a.c(maxMemory | 1034270677, 744, (((~maxMemory) | 295296) * 744) + (((~(562409856 | maxMemory)) | (-1034270678) | (~(472156117 | maxMemory))) * (-744)) + 116628045, 1549783404);
                        int i10 = c3 ^ (c3 << 13);
                        int i11 = i10 ^ (i10 >>> 17);
                        ((int[]) PngjException$1eba2e16[1])[0] = i11 ^ (i11 << 5);
                        i2 = ((int[]) PngjException$1eba2e16[0])[0];
                        i3 = ((int[]) PngjException$1eba2e16[3])[0];
                        if (i3 != i2) {
                            Object[] objArr7 = new Object[4];
                            objArr7[0] = new int[]{r6};
                            objArr7[1] = new int[1];
                            objArr7[3] = new int[]{r5};
                            int i12 = ((int[]) PngjException$1eba2e16[1])[0];
                            int i13 = ((int[]) PngjException$1eba2e16[3])[0];
                            int i14 = ((int[]) PngjException$1eba2e16[0])[0];
                            objArr7[c] = (String[]) PngjException$1eba2e16[c];
                            int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                            int i15 = ~elapsedRealtime;
                            int c4 = defpackage.a.c((~(elapsedRealtime | (-600483012))) | 30049410 | (~(i15 | 1004516563)), 988, (((~((-570433602) | i15)) | (~(1004516563 | elapsedRealtime))) * 988) + 787757809, i12);
                            int i16 = c4 ^ (c4 << 13);
                            int i17 = i16 ^ (i16 >>> 17);
                            ((int[]) objArr7[1])[0] = i17 ^ (i17 << 5);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) PngjException$1eba2e16[c];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        int[] iArr = new int[i3];
                        int i18 = i3 - 1;
                        iArr[i18] = 1;
                        Toast.makeText((Context) null, iArr[((i3 * i18) % 2) - 1], 1).show();
                        Object[] objArr8 = new Object[4];
                        objArr8[0] = new int[]{r6};
                        objArr8[1] = new int[1];
                        objArr8[3] = new int[]{r5};
                        int i19 = ((int[]) PngjException$1eba2e16[1])[0];
                        int i20 = ((int[]) PngjException$1eba2e16[3])[0];
                        int i21 = ((int[]) PngjException$1eba2e16[0])[0];
                        objArr8[c] = (String[]) PngjException$1eba2e16[c];
                        int c5 = defpackage.a.c(~(System.identityHashCode(this) | (-4211207)), 283, (((~((-694215247) | r1)) | 690004040) * (-283)) - 1262786323, i19);
                        int i22 = c5 ^ (c5 << 13);
                        int i23 = i22 ^ (i22 >>> 17);
                        ((int[]) objArr8[1])[0] = i23 ^ (i23 << 5);
                        return;
                    }
                }
                Object[] objArr9 = new Object[1];
                c(22 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), true, "\u0000\f\t￠\n\u0002\u0011\u0010\u0016\ufff0ￋ\u0010\fￋ\u0001\u0006\f\u000f\u0001\u000b\ufffe\b", 20 - Process.getGidForName(BuildConfig.FLAVOR), 157 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                c(15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), false, "￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005\ufffa\t\f\ufffe�", 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 160, objArr10);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr10[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature5 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 14830);
                    int i24 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 721;
                    byte b8 = $$a[c2];
                    byte b9 = (byte) (b8 - 1);
                    Object[] objArr11 = new Object[1];
                    b(b8, b9, b9, objArr11);
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatDelay, i24, absoluteGravity, -815159504, false, (String) objArr11[0], null);
                }
                ((Field) PngjBadSignature5).set(null, valueOf2);
                getFingerPrintQualityScore = (getScore + 37) % 128;
                i2 = ((int[]) PngjException$1eba2e16[0])[0];
                i3 = ((int[]) PngjException$1eba2e16[3])[0];
                if (i3 != i2) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr12 = {-1754974480};
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature6 == null) {
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, (-16776519) - Color.rgb(0, 0, 0), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjException$1eba2e16 = NativeAlgoUtils.PngjException$1eba2e16(intValue, ((Constructor) PngjBadSignature6).newInstance(objArr12), 1549783404);
            Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature7 == null) {
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 14830);
                int indexOf2 = 27 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0');
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 721;
                byte b10 = $$a[20];
                byte b11 = (byte) (b10 - 1);
                byte b12 = b10;
                c2 = 20;
                Object[] objArr13 = new Object[1];
                b(b11, b12, (byte) (b12 - 1), objArr13);
                PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionGroup, indexOf2, maximumDrawingCacheSize, -779023007, false, (String) objArr13[0], null);
            } else {
                c2 = 20;
            }
            ((Field) PngjBadSignature7).set(null, PngjException$1eba2e16);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        Object[] objArr14 = new Object[1];
        c((ViewConfiguration.getLongPressTimeout() >> 16) + 16, false, "\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ\n\uffff\f\u0005ￌ\ufff1\u0017", 3 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 156 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr14);
        Class<?> cls3 = Class.forName((String) objArr14[0]);
        Object[] objArr15 = new Object[1];
        c(16 - Color.alpha(0), true, "\ufffe\u0003\uffff\ufffe\t\uffdd\u0002\r\ufffb￢\u0013\u000e\u0003\u000e\b\uffff", 1 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 161, objArr15);
        intValue = ((Integer) cls3.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity
    public final void getPadSub2() {
        getScore = (getFingerPrintQualityScore + 47) % 128;
        super.getPadSub2();
        try {
            IdentyUser B = IdentySdk.getInstance().B();
            boolean isEnrolled = IdentySdk.getInstance().isEnrolled(new FingerDetectionMode[]{this.PngjExceptionInternal}, B);
            this.values = com.identy.f.PngjBadSignature.PngjException(IdentySdk.getInstance().getData, new FingerDetectionMode[]{this.PngjExceptionInternal}, B);
            if (!isEnrolled) {
                int i = getScore + 57;
                getFingerPrintQualityScore = i % 128;
                (i % 2 != 0 ? Toast.makeText(this, "Fingers not registered .. please register first", 0) : Toast.makeText(this, "Fingers not registered .. please register first", 1)).show();
                finish();
                return;
            }
        } catch (Exception unused) {
        }
        int i2 = getFingerPrintQualityScore + 47;
        getScore = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = getScore + 63;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onCreate(bundle);
        if (i2 != 0) {
            throw null;
        }
        getFingerPrintQualityScore = (getScore + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        getScore = (getFingerPrintQualityScore + 81) % 128;
        super.onPause();
        int i = getFingerPrintQualityScore + 81;
        getScore = i % 128;
        if (i % 2 == 0) {
            int i2 = 86 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        getScore = (getFingerPrintQualityScore + 41) % 128;
        super.onResume();
        int i = getScore + 109;
        getFingerPrintQualityScore = i % 128;
        if (i % 2 != 0) {
            int i2 = 29 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        int i = getScore + 53;
        getFingerPrintQualityScore = i % 128;
        int i2 = i % 2;
        super.onStart();
        if (i2 != 0) {
            int i3 = 36 / 0;
        }
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        super.values(bundle);
        try {
            try {
                this.onErrorResponse = new isFoundMatchingTemplates(this, this, this.PngjExceptionInternal, IdentySdk.getInstance().u(), this.PngjUnsupportedException);
                int i = getScore + 125;
                getFingerPrintQualityScore = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
