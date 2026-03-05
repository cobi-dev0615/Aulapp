package com.identy;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class getPadSub1 {
    public final int PngjBadSignature;
    public final int[] PngjException;
    public final int values;

    public getPadSub1(Bitmap bitmap) {
        int width = bitmap.getWidth();
        this.values = width;
        int height = bitmap.getHeight();
        this.PngjBadSignature = height;
        int[] iArr = new int[width * height];
        this.PngjException = iArr;
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
    }
}
