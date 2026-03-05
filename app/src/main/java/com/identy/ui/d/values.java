package com.identy.ui.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.Pair;
import android.util.TypedValue;
import com.identy.CapturePosition;
import com.identy.R;
import com.identy.imgutils.ImageUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.c.a.values$values;

/* loaded from: classes2.dex */
public final class values {
    private float[] Action;
    private int Attempt;
    private float[] PngBadCharsetException;
    public Bitmap PngjBadCrcException;
    private List PngjBadSignature = new LinkedList();
    private final List PngjException = new LinkedList();
    private boolean PngjExceptionInternal;
    private int PngjInputException;
    private Paint PngjOutputException;
    private final float PngjPrematureEnding;
    private boolean PngjUnsupportedException;
    private float[] a;
    private float[] e1;
    private RectF getAsHighestSecurityLevelReached;
    private boolean getCaptureTime;
    private final Context getData;
    private double getFingerPrintQualityScore;
    private CapturePosition getL3Score;
    private boolean getMatchingTime;
    private double getNfiq1Score;
    private boolean getOveralTimetaken;
    private int getPadSub1;
    private int getPadSub2;
    private float[] getPadSub3;
    private int getProcessingTime;
    private double getQualityScore;
    private double getScore;
    private float getSpoofScore;
    private boolean isQualityFailed;
    private float[] onErrorResponse;
    public Matrix valueOf;
    private final Paint values;

    public static class PngjBadSignature {
        int PngjBadCrcException;
        float PngjBadSignature;
        RectF PngjException;
        String values;
    }

    public values(Context context, double d, double d2, double d3, double d4, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, CapturePosition capturePosition) {
        Paint paint = new Paint();
        this.values = paint;
        this.PngjInputException = 0;
        this.PngjExceptionInternal = false;
        this.PngjUnsupportedException = false;
        this.PngjBadCrcException = null;
        this.PngjOutputException = new Paint();
        this.Action = new float[]{200.0f, 200.0f, 0.0f, 0.0f, 0.0f, 0.0f, 200.0f, 200.0f};
        this.PngBadCharsetException = new float[]{140.0f, 140.0f, 0.0f, 0.0f, 0.0f, 0.0f, 140.0f, 140.0f};
        this.onErrorResponse = new float[]{140.0f, 140.0f, 140.0f, 140.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.e1 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 140.0f, 140.0f, 140.0f, 140.0f};
        this.a = new float[]{0.0f, 0.0f, 200.0f, 200.0f, 200.0f, 200.0f, 0.0f, 0.0f};
        this.getPadSub3 = new float[]{0.0f, 0.0f, 140.0f, 140.0f, 140.0f, 140.0f, 0.0f, 0.0f};
        this.isQualityFailed = false;
        this.getFingerPrintQualityScore = 8.0d;
        this.getScore = 8.0d;
        this.getQualityScore = 8.0d;
        this.getNfiq1Score = 8.0d;
        this.getProcessingTime = 0;
        this.getCaptureTime = false;
        this.getSpoofScore = 12.0f;
        this.getL3Score = CapturePosition.HORIZONTAL;
        this.getData = context;
        this.getFingerPrintQualityScore = d;
        this.getQualityScore = d2;
        this.getScore = d3;
        this.getNfiq1Score = d4;
        this.getProcessingTime = i;
        this.getCaptureTime = z;
        this.PngjInputException = i2;
        this.getOveralTimetaken = z4;
        this.getMatchingTime = z5;
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.getSpoofScore);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeMiter(100.0f);
        this.getL3Score = capturePosition;
        this.PngjPrematureEnding = TypedValue.applyDimension(1, 18.0f, context.getResources().getDisplayMetrics());
        this.PngjExceptionInternal = z2;
        this.PngjUnsupportedException = z3;
    }

    public final synchronized void PngjBadCrcException() {
        this.PngjException.clear();
    }

    public final synchronized void values(int i, int i2, int i3, RectF rectF) {
        if (!this.isQualityFailed) {
            this.Attempt = i;
            this.getPadSub1 = i2;
            this.getPadSub2 = i3;
            this.isQualityFailed = true;
            this.getAsHighestSecurityLevelReached = rectF;
        }
    }

    public final synchronized void values(List<values$values> list) {
        try {
            this.PngjBadCrcException = null;
            LinkedList<Pair> linkedList = new LinkedList();
            this.PngjBadSignature.clear();
            Matrix matrix = new Matrix(this.valueOf);
            for (values$values values_values : list) {
                new RectF(values_values.valueOf);
                RectF rectF = new RectF(new RectF(values_values.valueOf));
                RectF rectF2 = new RectF();
                matrix.mapRect(rectF2, rectF);
                this.PngjBadSignature.add(new Pair(values_values.values, rectF2));
                linkedList.add(new Pair(values_values.values, values_values));
            }
            if (linkedList.isEmpty()) {
                this.PngjException.clear();
                return;
            }
            this.PngjException.clear();
            for (Pair pair : linkedList) {
                PngjBadSignature pngjBadSignature = new PngjBadSignature();
                pngjBadSignature.PngjBadSignature = ((Float) pair.first).floatValue();
                pngjBadSignature.PngjException = new RectF(new RectF(((values$values) pair.second).valueOf));
                pngjBadSignature.values = ((values$values) pair.second).PngjBadCrcException;
                pngjBadSignature.PngjBadCrcException = this.getData.getResources().getColor(R.color.boxes);
                this.PngjException.add(pngjBadSignature);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void values(Canvas canvas, boolean z) {
        Bitmap bitmap;
        float[] fArr;
        Canvas canvas2 = canvas;
        synchronized (this) {
            try {
                float min = Math.min(canvas.getWidth() / this.getPadSub1, canvas.getHeight() / this.Attempt);
                int i = this.Attempt;
                int i2 = this.getPadSub1;
                this.valueOf = ImageUtils.valueOf(i, i2, (int) (i * min), (int) (min * i2), 0.0f);
                if (this.getProcessingTime != 0) {
                    Bitmap decodeResource = BitmapFactory.decodeResource(this.getData.getResources(), this.getProcessingTime);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(this.PngjInputException);
                    bitmap = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, true);
                } else {
                    bitmap = null;
                }
                new Matrix(this.valueOf).mapRect(new RectF(), new RectF(this.getAsHighestSecurityLevelReached));
                RectF rectF = new RectF((int) (canvas.getWidth() / this.getFingerPrintQualityScore), (int) (canvas.getHeight() / this.getQualityScore), (int) (canvas.getWidth() - (canvas.getWidth() / this.getScore)), (int) (canvas.getHeight() - (canvas.getHeight() / this.getNfiq1Score)));
                this.PngjOutputException.setStyle(Paint.Style.STROKE);
                this.PngjOutputException.setColor(this.getData.getResources().getColor(R.color.boxes));
                this.PngjOutputException.setStrokeWidth(10.0f);
                Path path = new Path();
                if (this.PngjExceptionInternal) {
                    if (this.getL3Score.equals(CapturePosition.VERTICAL_FROM_TOP)) {
                        fArr = this.e1;
                    } else {
                        fArr = this.onErrorResponse;
                    }
                } else if (this.PngjUnsupportedException) {
                    fArr = this.getOveralTimetaken ? this.a : this.getPadSub3;
                } else {
                    fArr = this.getOveralTimetaken ? this.Action : this.PngBadCharsetException;
                }
                Paint paint = new Paint();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(this.getData.getResources().getColor(R.color.boxes_transparent));
                canvas.drawPaint(paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawPath(path, paint);
                canvas.drawPath(path, this.PngjOutputException);
                if (z || this.getProcessingTime != 0) {
                    Iterator it = this.PngjException.iterator();
                    while (it.hasNext()) {
                        RectF rectF2 = new RectF(((PngjBadSignature) it.next()).PngjException);
                        this.valueOf.mapRect(rectF2);
                        this.values.setColor(this.getData.getResources().getColor(R.color.boxes));
                        float min2 = Math.min(rectF2.width(), rectF2.height()) / 8.0f;
                        if (!this.getCaptureTime) {
                            if (this.getMatchingTime) {
                                min2 = 0.0f;
                            }
                            canvas.drawRoundRect(rectF2, min2, min2, this.values);
                        }
                        if (bitmap != null) {
                            canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, (int) rectF2.width(), (int) rectF2.height(), true), rectF2.left, rectF2.top, (Paint) null);
                        }
                    }
                }
                if (this.getMatchingTime && z) {
                    for (PngjBadSignature pngjBadSignature : this.PngjException) {
                        RectF rectF3 = new RectF(pngjBadSignature.PngjException);
                        this.valueOf.mapRect(rectF3);
                        int i3 = 8;
                        if (this.PngjExceptionInternal) {
                            String str = pngjBadSignature.values;
                            float f = rectF3.left;
                            if (!this.getOveralTimetaken) {
                                i3 = 5;
                            }
                            Paint paint2 = new Paint();
                            paint2.set(this.values);
                            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                            Paint paint3 = new Paint(1);
                            paint3.setColor(-1);
                            float width = rectF3.width() / i3;
                            if (this.getOveralTimetaken) {
                                width -= 2.0f;
                            }
                            paint3.setTextSize(width);
                            paint3.getFontMetrics();
                            float measureText = paint3.measureText("W");
                            float measureText2 = paint3.measureText(str);
                            float f2 = rectF3.top;
                            RectF rectF4 = new RectF(f, f2 - (4.0f + measureText), rectF3.right, f2);
                            canvas.drawRect(rectF4, paint2);
                            Path path2 = new Path();
                            float width2 = ((rectF4.width() - measureText2) / 2.0f) + rectF4.left;
                            float height = (measureText / 2.0f) + (rectF4.height() / 2.0f) + rectF4.top;
                            path2.moveTo(width2, height);
                            path2.lineTo(width2, rectF4.bottom);
                            canvas.drawText(str, width2, height, paint3);
                        } else if (this.PngjUnsupportedException) {
                            String str2 = pngjBadSignature.values;
                            float f3 = rectF3.right;
                            if (!this.getOveralTimetaken) {
                                i3 = 5;
                            }
                            Paint paint4 = new Paint();
                            paint4.set(this.values);
                            paint4.setStyle(Paint.Style.FILL_AND_STROKE);
                            Paint paint5 = new Paint(1);
                            paint5.setColor(-1);
                            float height2 = rectF3.height() / i3;
                            if (this.getOveralTimetaken) {
                                height2 -= 2.0f;
                            }
                            paint5.setTextSize(height2);
                            paint5.getFontMetrics();
                            float measureText3 = paint5.measureText("W");
                            float measureText4 = paint5.measureText(str2);
                            RectF rectF5 = new RectF(f3, rectF3.top, measureText3 + 4.0f + f3, rectF3.bottom);
                            canvas.drawRect(rectF5, paint4);
                            Path path3 = new Path();
                            float width3 = (rectF5.width() / 2.0f) + rectF5.left;
                            path3.moveTo(width3, ((rectF5.height() - measureText4) / 2.0f) + rectF5.top);
                            path3.lineTo(width3, rectF5.bottom);
                            float f4 = this.getSpoofScore;
                            canvas2.drawTextOnPath(str2, path3, f4, f4, paint5);
                        } else {
                            String str3 = pngjBadSignature.values;
                            float f5 = rectF3.left;
                            if (!this.getOveralTimetaken) {
                                i3 = 5;
                            }
                            Paint paint6 = new Paint();
                            paint6.set(this.values);
                            paint6.setStyle(Paint.Style.FILL_AND_STROKE);
                            Paint paint7 = new Paint(1);
                            paint7.setColor(-1);
                            float height3 = rectF3.height() / i3;
                            if (this.getOveralTimetaken) {
                                height3 -= 2.0f;
                            }
                            paint7.setTextSize(height3);
                            paint7.getFontMetrics();
                            float measureText5 = paint7.measureText("W");
                            float measureText6 = paint7.measureText(str3);
                            RectF rectF6 = new RectF(f5 - (measureText5 + 4.0f), rectF3.top, f5, rectF3.bottom);
                            canvas.drawRect(rectF6, paint6);
                            Path path4 = new Path();
                            float width4 = (rectF6.width() / 2.0f) + rectF6.left;
                            float height4 = ((rectF6.height() - measureText6) / 2.0f) + rectF6.top;
                            path4.moveTo(width4, rectF6.bottom - ((rectF6.height() - measureText6) / 2.0f));
                            path4.lineTo(width4, height4);
                            float f6 = this.getSpoofScore;
                            canvas2.drawTextOnPath(str3, path4, f6, f6, paint7);
                            canvas2 = canvas;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
