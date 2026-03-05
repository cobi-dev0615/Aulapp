package com.identy;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.identy.enums.Hand;
import java.io.File;
import java.util.Calendar;
import org.identy.opencv.android.Utils;
import org.identy.opencv.core.Core;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
public final class PngjBadCrcException {
    public static void PngjException(String str, long j) {
        Calendar.getInstance().getTimeInMillis();
        try {
            LibSettings.isSaveCaptured();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static File values(Activity activity, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getFilesDir().getAbsolutePath());
        sb.append("/");
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static Bitmap values(Mat mat, Hand hand) {
        int i;
        int n_rows = Mat.n_rows(mat.PngjException);
        int n_cols = Mat.n_cols(mat.PngjException);
        int i2 = org.identy.opencv.core.PngjBadCrcException.PngjBadSignature;
        Mat mat2 = new Mat(n_rows, n_cols, i2);
        Core.PngjBadCrcException(mat, mat2, i2);
        Bitmap createBitmap = Bitmap.createBitmap(Mat.n_cols(mat2.PngjException), Mat.n_rows(mat2.PngjException), Bitmap.Config.ARGB_8888);
        Utils.PngjBadSignature(mat2, createBitmap);
        if (hand == null || !hand.equals(Hand.LEFT)) {
            i = (hand == null || !hand.equals(Hand.RIGHT)) ? 0 : 270;
        } else {
            i = 90;
        }
        if (i <= 0) {
            return createBitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, createBitmap.getWidth(), createBitmap.getHeight(), true);
        Bitmap createBitmap2 = Bitmap.createBitmap(createScaledBitmap, 0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), matrix, true);
        createScaledBitmap.recycle();
        return createBitmap2;
    }
}
