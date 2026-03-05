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
public final class PngjException extends PngjOutputException {
    public static int PngjBadCrcException;
    public static int values;
    private Template PngjException = Template.NIST_ITL_1_2015_RECORD_9;

    public static int PngjException() {
        int i = values;
        int i2 = i % 5781875;
        values = i + 1;
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
            return Fpnative.generateT(e1.values, new Mat(Mat.n_clone(getpadsub3.values(templateSize).PngjException)).PngjException, template.ordinal(), Position.getFromHandFinger(new Pair(getpadsub3.PngjException, getpadsub3.PngjBadCrcException)).ordinal(), (float) wSQCompression.getCompression());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
