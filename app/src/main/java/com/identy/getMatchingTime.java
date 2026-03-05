package com.identy;

import android.util.Pair;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
abstract class getMatchingTime {
    FingerAS Action;
    protected Mat PngjPrematureEnding;
    private int PngjException = -2;
    protected Hand PngjOutputException = Hand.LEFT;
    protected Finger PngjExceptionInternal = Finger.INDEX;
    protected com.identy.enums.PngjException PngjInputException = new com.identy.enums.PngjException(com.identy.enums.PngjBadSignature.BAD, BuildConfig.FLAVOR);
    protected String a = BuildConfig.FLAVOR;
    private boolean valueOf = false;
    boolean onErrorResponse = false;
    Map PngBadCharsetException = new HashMap();
    private float PngjBadCrcException = 0.0f;
    private float PngjBadSignature = 0.0f;
    private float values = 0.0f;
    private float PngjUnsupportedException = 0.0f;
    private float e1 = 0.0f;
    private int getPadSub1 = 0;

    public float Action() {
        return this.PngjUnsupportedException;
    }

    public int Attempt() {
        if (this.PngjException <= 0) {
            getAsHighestSecurityLevelReached();
        }
        return this.PngjException;
    }

    public float PngBadCharsetException() {
        return this.PngjBadSignature;
    }

    public void PngjBadCrcException(boolean z) {
        this.onErrorResponse = z;
    }

    public void PngjBadSignature(float f, float f2, float f3, float f4) {
        this.PngjBadCrcException = f;
        this.PngjBadSignature = f2;
        this.PngjUnsupportedException = f3;
        this.values = f4;
    }

    public void PngjException(boolean z, FingerAS fingerAS) {
        this.valueOf = z;
        this.Action = fingerAS;
    }

    public Map PngjExceptionInternal() {
        return this.PngBadCharsetException;
    }

    public float PngjInputException() {
        return this.e1;
    }

    public boolean PngjOutputException() {
        return this.valueOf;
    }

    public float PngjPrematureEnding() {
        return this.PngjBadSignature;
    }

    public FingerAS PngjUnsupportedException() {
        return this.Action;
    }

    public float a() {
        return this.values;
    }

    public int e1() {
        return this.getPadSub1;
    }

    public void getAsHighestSecurityLevelReached() {
        if (this.PngjPrematureEnding == null) {
            return;
        }
        this.PngjException = Fpnative.generateNFIQ(e1.values, Position.getFromHandFinger(new Pair(this.PngjOutputException, this.PngjExceptionInternal)).ordinal());
    }

    public Mat getPadSub3() {
        return this.PngjPrematureEnding;
    }

    public float onErrorResponse() {
        return this.PngjBadCrcException;
    }

    public final String valueOf(String str) {
        StringBuilder r = defpackage.a.r(str);
        r.append(this.PngjOutputException.toString());
        r.append("_");
        r.append(this.PngjExceptionInternal.toString());
        return r.toString();
    }

    public void valueOf(int i) {
        this.getPadSub1 = i;
    }

    public boolean valueOf() {
        return this.onErrorResponse;
    }
}
