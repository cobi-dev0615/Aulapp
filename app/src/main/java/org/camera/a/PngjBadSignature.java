package org.camera.a;

import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.preference.PreferenceManager;
import com.identy.FingerActivity;
import com.identy.PngjUnsupportedException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Locale;

public final class PngjBadSignature {
    private static final DecimalFormat getCaptureTime = new DecimalFormat("#0.0");
    public boolean Action;
    public String PngBadCharsetException;
    public boolean PngjBadCrcException;
    public boolean PngjBadSignature;
    public final SharedPreferences PngjException;
    public boolean PngjExceptionInternal;
    public boolean PngjInputException;
    public int PngjOutputException;
    public boolean PngjPrematureEnding;
    public boolean PngjUnsupportedException;
    public boolean a;
    public boolean e1;
    public final float getAsHighestSecurityLevelReached;
    public boolean getData;
    public boolean getFingerPrintQualityScore;
    private final float[] getL1Score;
    private final Matrix getL2Score;
    public final long getL3Score;
    private final DateFormat getNfiq1Score;
    private final RectF getOveralTimetaken;
    public final Paint getPadSub1;
    public final float getPadSub2;
    public final RectF getPadSub3;
    public int getProcessingTime;
    public boolean getQualityScore;
    public boolean getScore;
    private final float[] getSpoofScore;
    public long isQualityFailed;
    public boolean onErrorResponse;
    public final PngjUnsupportedException valueOf;
    public final FingerActivity values;

    public PngjBadSignature(FingerActivity fingerActivity, PngjUnsupportedException pngjUnsupportedException) {
        Paint paint = new Paint();
        this.getPadSub1 = paint;
        this.getPadSub3 = new RectF();
        this.getNfiq1Score = DateFormat.getTimeInstance();
        this.getOveralTimetaken = new RectF();
        this.getProcessingTime = 0;
        this.getL2Score = new Matrix();
        this.getL3Score = -1L;
        this.getL1Score = new float[3];
        this.getSpoofScore = new float[3];
        this.values = fingerActivity;
        this.PngjException = PreferenceManager.getDefaultSharedPreferences(fingerActivity);
        this.valueOf = pngjUnsupportedException;
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        float f = fingerActivity.getResources().getDisplayMetrics().density;
        this.getAsHighestSecurityLevelReached = f;
        float f2 = f + 0.5f;
        this.getPadSub2 = f2;
        paint.setStrokeWidth(f2);
    }

    public static String valueOf(long j) {
        int i = (int) (j % 60);
        long j2 = j / 60;
        StringBuilder sb = new StringBuilder();
        sb.append(j2 / 60);
        sb.append(":");
        sb.append(String.format(Locale.getDefault(), "%02d", Integer.valueOf((int) (j2 % 60))));
        sb.append(":");
        sb.append(String.format(Locale.getDefault(), "%02d", Integer.valueOf(i)));
        return sb.toString();
    }
}
