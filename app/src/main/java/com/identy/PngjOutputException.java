package com.identy;

import android.util.Pair;
import co.ceduladigital.sdk.x5;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class PngjOutputException {
    public float Action;
    public boolean Attempt;
    public float PngBadCharsetException;
    float PngjBadCrcException;
    public float PngjOutputException;
    public float PngjPrematureEnding;
    public float a;
    public float e1;
    public float getAsHighestSecurityLevelReached;
    private Pair[] getNfiq1Score;
    public boolean getPadSub1;
    public float getPadSub2;
    public float getPadSub3;
    public boolean getQualityScore;
    public boolean getScore;
    public boolean isQualityFailed;
    public float onErrorResponse;
    long valueOf;
    int PngjInputException = 0;
    int getFingerPrintQualityScore = 0;
    public int getData = 0;
    public int getOveralTimetaken = 0;
    public boolean getCaptureTime = false;
    private long getSpoofScore = 0;
    ERRORS getMatchingTime = null;
    private long getProcessingTime = Calendar.getInstance().getTimeInMillis();
    public HashMap PngjException = new HashMap();
    HashMap PngjBadSignature = new HashMap();
    public HashMap PngjExceptionInternal = new HashMap();
    public HashMap values = new HashMap();
    List PngjUnsupportedException = new ArrayList();

    public PngjOutputException(Pair[] pairArr) {
        this.getNfiq1Score = pairArr;
    }

    private static String PngjBadCrcException(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        String format = String.format("%.3g", Float.valueOf(f));
        try {
            if (format.length() > 4) {
                format = format.substring(0, 4);
            }
            return format.replaceAll(",", ".");
        } catch (Exception unused) {
            return "x".concat(String.valueOf(f));
        }
    }

    private static String PngjException(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        String format = String.format("%.3g", Float.valueOf(f));
        try {
            if (format.length() > 4) {
                format = format.substring(0, 4);
            }
            return format.replaceAll(",", ".");
        } catch (Exception unused) {
            return "x".concat(String.valueOf(f));
        }
    }

    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.getProcessingTime / 1000);
        sb.append("|");
        String obj2 = sb.toString();
        Hand hand = Hand.LEFT;
        Finger finger = Finger.THUMB;
        Pair pair = new Pair(hand, finger);
        Finger finger2 = Finger.INDEX;
        Pair pair2 = new Pair(hand, finger2);
        Finger finger3 = Finger.MIDDLE;
        Pair pair3 = new Pair(hand, finger3);
        Finger finger4 = Finger.RING;
        Pair pair4 = new Pair(hand, finger4);
        Finger finger5 = Finger.LITTLE;
        Pair pair5 = new Pair(hand, finger5);
        Hand hand2 = Hand.RIGHT;
        Pair[] pairArr = {pair, pair2, pair3, pair4, pair5, new Pair(hand2, finger), new Pair(hand2, finger2), new Pair(hand2, finger3), new Pair(hand2, finger4), new Pair(hand2, finger5)};
        Pair[] pairArr2 = this.getNfiq1Score;
        if (pairArr2.length == 4) {
            StringBuilder r = defpackage.a.r(obj2);
            r.append(((Hand) this.getNfiq1Score[0].first).toString().toUpperCase().charAt(0));
            r.append("F");
            obj = r.toString();
        } else if (pairArr2.length == 1) {
            StringBuilder 0 = defpackage.a.r(obj2);
            0.append(((Hand) this.getNfiq1Score[0].first).toString().toUpperCase().charAt(0));
            0.append(((Finger) this.getNfiq1Score[0].second).toString().toUpperCase().charAt(0));
            obj = 0.toString();
        } else {
            Hand hand3 = null;
            String str = BuildConfig.FLAVOR;
            boolean z = false;
            for (Pair pair6 : pairArr2) {
                if (hand3 == null) {
                    hand3 = (Hand) pair6.first;
                } else if (!hand3.equals(pair6.first)) {
                    z = true;
                }
                StringBuilder 0 = defpackage.a.r(str);
                0.append(((Finger) pair6.second).toString().charAt(0));
                str = 0.toString();
            }
            if (z) {
                obj = IdentyB.d(obj2, "2T");
            } else {
                StringBuilder 0 = defpackage.a.r(obj2);
                0.append(((Hand) this.getNfiq1Score[0].first).toString().toUpperCase().charAt(0));
                0.append(str);
                obj = 0.toString();
            }
        }
        String d = IdentyB.d(obj, "|");
        for (Object obj3 : this.PngjUnsupportedException) {
            String valueOf = obj3 instanceof Integer ? String.valueOf(obj3) : BuildConfig.FLAVOR;
            String str2 = "T";
            if (obj3 instanceof String) {
                valueOf = (String) obj3;
                if (valueOf.equals("ST")) {
                    valueOf = "T";
                }
            }
            if (obj3 instanceof float[]) {
                float[] fArr = (float[]) obj3;
                int i = 0;
                for (int i2 = 1; i2 < fArr.length; i2++) {
                    if (fArr[i2] > fArr[i]) {
                        i = i2;
                    }
                }
                if (i == 0) {
                    StringBuilder sb2 = new StringBuilder("p");
                    sb2.append((int) (fArr[i] * 100.0f));
                    str2 = sb2.toString();
                } else if (i == 1) {
                    StringBuilder sb3 = new StringBuilder("r");
                    sb3.append((int) (fArr[i] * 100.0f));
                    str2 = sb3.toString();
                } else if (i != 2) {
                    if (i == 3) {
                        StringBuilder sb4 = new StringBuilder("s");
                        sb4.append((int) (fArr[i] * 100.0f));
                        str2 = sb4.toString();
                    }
                }
                d = IdentyB.d(d, str2);
            }
            str2 = valueOf;
            d = IdentyB.d(d, str2);
        }
        StringBuilder 0 = defpackage.a.r(IdentyB.d(d, "|"));
        0.append((int) this.PngjBadCrcException);
        String d2 = IdentyB.d(0.toString(), "|");
        if (this.PngjExceptionInternal.keySet().size() != 0) {
            String str3 = BuildConfig.FLAVOR;
            for (int i3 = 0; i3 < 10; i3++) {
                Pair pair7 = pairArr[i3];
                if (this.PngjExceptionInternal.containsKey(pair7)) {
                    StringBuilder 0 = defpackage.a.r(str3);
                    0.append(str3.equals(BuildConfig.FLAVOR) ? BuildConfig.FLAVOR : "#");
                    StringBuilder 0 = defpackage.a.r(0.toString());
                    0.append(this.PngjExceptionInternal.get(pair7));
                    str3 = 0.toString();
                }
            }
            d2 = IdentyB.d(IdentyB.d(d2, str3), "|");
        }
        if (this.values.keySet().size() != 0) {
            String str4 = BuildConfig.FLAVOR;
            for (int i4 = 0; i4 < 10; i4++) {
                Pair pair8 = pairArr[i4];
                if (this.values.containsKey(pair8)) {
                    StringBuilder 0 = defpackage.a.r(str4);
                    0.append(str4.equals(BuildConfig.FLAVOR) ? BuildConfig.FLAVOR : "#");
                    StringBuilder 0 = defpackage.a.r(0.toString());
                    0.append(this.values.get(pair8));
                    str4 = 0.toString();
                }
            }
            d2 = IdentyB.d(IdentyB.d(d2, str4), "|");
        }
        if (this.getCaptureTime) {
            StringBuilder q = x5.q(d2, "m");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.getPadSub1);
            q.append(sb5.toString().charAt(0));
            StringBuilder q2 = x5.q(q.toString(), "d");
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.isQualityFailed);
            q2.append(sb6.toString().charAt(0));
            StringBuilder q3 = x5.q(q2.toString(), "g");
            StringBuilder sb7 = new StringBuilder();
            sb7.append(this.Attempt);
            q3.append(sb7.toString().charAt(0));
            StringBuilder q4 = x5.q(q3.toString(), "i");
            StringBuilder sb8 = new StringBuilder();
            sb8.append(this.getScore);
            q4.append(sb8.toString().charAt(0));
            StringBuilder q5 = x5.q(q4.toString(), "e");
            StringBuilder sb9 = new StringBuilder();
            sb9.append(this.getQualityScore);
            q5.append(sb9.toString().charAt(0));
            StringBuilder q6 = x5.q(q5.toString(), "h");
            q6.append(PngjException(this.PngjPrematureEnding));
            StringBuilder q7 = x5.q(q6.toString(), "a");
            q7.append(PngjBadCrcException(this.PngjOutputException));
            StringBuilder q8 = x5.q(q7.toString(), "b");
            q8.append(PngjBadCrcException(this.a));
            StringBuilder q9 = x5.q(q8.toString(), "c");
            q9.append(PngjBadCrcException(this.e1));
            StringBuilder q10 = x5.q(q9.toString(), "j");
            q10.append(PngjBadCrcException(this.Action));
            StringBuilder q11 = x5.q(q10.toString(), "k");
            q11.append(PngjBadCrcException(this.PngBadCharsetException));
            StringBuilder q12 = x5.q(q11.toString(), "l");
            q12.append(PngjBadCrcException(this.onErrorResponse));
            StringBuilder q13 = x5.q(q12.toString(), "n");
            q13.append(PngjBadCrcException(this.getPadSub3));
            StringBuilder q14 = x5.q(q13.toString(), "o");
            q14.append(PngjBadCrcException(this.getAsHighestSecurityLevelReached));
            StringBuilder q15 = x5.q(q14.toString(), "p");
            q15.append(PngjBadCrcException(this.getPadSub2));
            d2 = IdentyB.d(q15.toString(), "|");
        }
        if (this.PngjException.keySet().size() != 0) {
            for (int i5 = 0; i5 < 10; i5++) {
                Pair pair9 = pairArr[i5];
                if (this.PngjException.containsKey(pair9)) {
                    StringBuilder 0 = defpackage.a.r(d2);
                    0.append(this.PngjException.get(pair9));
                    d2 = 0.toString();
                }
            }
            d2 = IdentyB.d(d2, "|");
        }
        if (this.PngjBadSignature.keySet().size() != 0) {
            String str5 = BuildConfig.FLAVOR;
            for (int i6 = 0; i6 < 10; i6++) {
                Pair pair10 = pairArr[i6];
                if (this.PngjBadSignature.containsKey(pair10)) {
                    StringBuilder 0 = defpackage.a.r(str5);
                    0.append(str5.equals(BuildConfig.FLAVOR) ? BuildConfig.FLAVOR : "#");
                    StringBuilder 0 = defpackage.a.r(0.toString());
                    0.append(this.PngjBadSignature.get(pair10));
                    str5 = 0.toString();
                }
            }
            StringBuilder q16 = x5.q(IdentyB.d(d2, str5), "#r");
            q16.append(this.getFingerPrintQualityScore);
            d2 = IdentyB.d(q16.toString(), "|");
        }
        StringBuilder q17 = x5.q(d2, "|");
        q17.append(this.getOveralTimetaken);
        q17.append("/");
        q17.append(this.getData);
        q17.append("|");
        StringBuilder 0 = defpackage.a.r(q17.toString());
        0.append(this.valueOf / 1000);
        String obj4 = 0.toString();
        ERRORS errors = this.getMatchingTime;
        return errors != null ? errors.equals(ERRORS.TIMED_OUT) ? IdentyB.d(obj4, "|TO") : this.getMatchingTime.equals(ERRORS.EXCEEDED_TRANSACTION_LIMIT) ? IdentyB.d(obj4, "|TE") : this.getMatchingTime.equals(ERRORS.ACTIVITY_PAUSED_ON_BACK_PRESSED) ? IdentyB.d(obj4, "|AP") : this.getMatchingTime.equals(ERRORS.USER_CANCELLED_ON_NEXT_DETECTION) ? IdentyB.d(obj4, "|UC") : obj4 : obj4;
    }

    public final int PngjBadCrcException(Integer num) {
        this.PngjUnsupportedException.add(num);
        this.PngjInputException = this.PngjUnsupportedException.size() - 1;
        return this.PngjUnsupportedException.size() - 1;
    }
}
