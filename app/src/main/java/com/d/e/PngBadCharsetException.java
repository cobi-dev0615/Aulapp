package com.d.e;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class PngBadCharsetException {
    public int PngjBadCrcException;
    public int PngjException;
    public int values;

    public static int PngjBadCrcException(int i) {
        PngjException pngjException0 = PngjException.PngjBadSignature;
        int i2 = (i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i3 = (i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i4 = (i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i5 = i & KotlinVersion.MAX_COMPONENT_VALUE;
        int[][] iArr = pngjException0.values;
        return ((iArr[0][i2] + iArr[1][i3]) ^ iArr[2][i4]) + iArr[3][i5];
    }

    public static void values(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
