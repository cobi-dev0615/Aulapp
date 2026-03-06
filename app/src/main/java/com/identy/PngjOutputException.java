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
        throw new UnsupportedOperationException("Method not decompiled");
    }

    public final int PngjBadCrcException(Integer num) {
        this.PngjUnsupportedException.add(num);
        this.PngjInputException = this.PngjUnsupportedException.size() - 1;
        return this.PngjUnsupportedException.size() - 1;
    }
}
