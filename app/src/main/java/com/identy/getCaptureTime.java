package com.identy;

import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.FingerMatchSecLevel;
import com.identy.enums.Hand;
import java.util.Date;
import java.util.Map;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
public final class getCaptureTime extends getPadSub3 {
    private FingerMatchSecLevel a;
    VerifyResult e1;

    public getCaptureTime(Hand hand, Finger finger, Date date, Map map, double d, VerifyResult verifyResult, float f, int i, float f2, boolean z, Mat mat, String str, long j, long j2, long j3, PngBadCharsetException pngBadCharsetException, int i2, int i3, FingerDetectionMode fingerDetectionMode, FingerAS fingerAS) {
        super(hand, finger, date, map, d, (int) f, i, f2, z, mat, str, j, j2, j3, pngBadCharsetException, i2, i3, fingerDetectionMode, fingerAS);
        this.e1 = verifyResult;
        this.a = verifyResult.matched_true_up_to_security_level;
    }
}
