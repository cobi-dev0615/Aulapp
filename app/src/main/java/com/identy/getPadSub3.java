package com.identy;

import co.ceduladigital.sdk.q;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
public class getPadSub3 {
    final int Action;
    private long Attempt;
    final FingerDetectionMode PngBadCharsetException;
    public Finger PngjBadCrcException;
    protected int PngjBadSignature;
    public Hand PngjException;
    Date PngjExceptionInternal;
    float PngjInputException;
    List PngjOutputException = new ArrayList();
    double PngjPrematureEnding;
    Map PngjUnsupportedException;
    private String a;
    private int e1;
    private long getAsHighestSecurityLevelReached;
    private boolean getPadSub1;
    private long getPadSub2;
    private PngBadCharsetException getPadSub3;
    final FingerAS onErrorResponse;
    public int valueOf;
    protected Mat values;

    public getPadSub3(Hand hand, Finger finger, Date date, Map map, double d, int i, int i2, float f, boolean z, Mat mat, String str, long j, long j2, long j3, PngBadCharsetException pngBadCharsetException, int i3, int i4, FingerDetectionMode fingerDetectionMode, FingerAS fingerAS) {
        this.PngjException = Hand.LEFT;
        this.PngjBadCrcException = Finger.INDEX;
        this.a = BuildConfig.FLAVOR;
        this.getPadSub2 = 0L;
        this.Attempt = 0L;
        this.getAsHighestSecurityLevelReached = 0L;
        this.PngjUnsupportedException = new HashMap();
        this.PngjException = hand;
        this.PngjBadCrcException = finger;
        this.PngBadCharsetException = fingerDetectionMode;
        this.getPadSub1 = z;
        this.onErrorResponse = fingerAS;
        this.PngjExceptionInternal = date;
        this.Action = i4;
        this.PngjUnsupportedException = map;
        this.PngjPrematureEnding = d;
        this.valueOf = i;
        this.PngjBadSignature = i2;
        this.PngjInputException = f;
        this.getPadSub3 = pngBadCharsetException;
        this.e1 = i3;
        if (mat != null) {
            this.values = new Mat(Mat.n_clone(mat.PngjException));
        }
        if (str != null) {
            this.a = str;
        }
        this.getPadSub2 = j;
        this.Attempt = j2;
        this.getAsHighestSecurityLevelReached = j3;
    }

    public final void PngjBadCrcException() {
        Mat mat = this.values;
        if (mat != null) {
            Mat.n_release(mat.PngjException);
            this.values = null;
        }
    }

    public final int PngjBadSignature() {
        Mat mat = this.values;
        if (mat == null) {
            return 0;
        }
        return Mat.n_rows(mat.PngjException);
    }

    public final void PngjException() {
        Mat mat = this.values;
        if (mat != null) {
            Mat.n_release(mat.PngjException);
        }
    }

    public final Mat PngjInputException() {
        return this.values;
    }

    public final int valueOf() {
        Mat mat = this.values;
        if (mat == null) {
            return 0;
        }
        return Mat.n_cols(mat.PngjException);
    }

    public final Attempt values() {
        List list = this.PngjOutputException;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (Attempt) q.d(this.PngjOutputException, 1);
    }

    public final Mat values(TemplateSize templateSize) {
        if (templateSize.equals(TemplateSize.DEFAULT)) {
            return this.values;
        }
        return null;
    }
}
