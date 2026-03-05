package com.identy.i;

import android.app.Activity;
import android.util.Pair;
import com.identy.Fpnative;
import com.identy.Position;
import com.identy.TemplateSize;
import com.identy.WSQCompression;
import com.identy.e1;
import com.identy.enums.Template;
import com.identy.getPadSub3;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
public final class PngjPrematureEnding extends PngjOutputException {
    public static int PngjBadCrcException;
    public static int PngjBadSignature;

    public static int values() {
        int i = PngjBadSignature;
        int i2 = i % 6551130;
        PngjBadSignature = i + 1;
        if (i2 != 0) {
            return PngjBadCrcException;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        PngjBadCrcException = freeMemory;
        return freeMemory;
    }

    @Override // com.identy.i.PngjOutputException
    public final byte[] PngjBadCrcException(Template template, getPadSub3 getpadsub3, Activity activity, long j, TemplateSize templateSize, WSQCompression wSQCompression) {
        super.PngjBadCrcException(template, getpadsub3, activity, j, templateSize, wSQCompression);
        try {
            return Fpnative.generateT(e1.values, new Mat(Mat.n_clone(getpadsub3.values(templateSize).PngjException)).PngjException, Template.WSQ.ordinal(), Position.getFromHandFinger(new Pair(getpadsub3.PngjException, getpadsub3.PngjBadCrcException)).ordinal(), (float) wSQCompression.getCompression());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
