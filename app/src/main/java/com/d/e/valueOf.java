package com.d.e;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class valueOf {
    public static void PngjException(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            PngjException(iArr);
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i ^ iArr[i4];
            int PngjException = i2 ^ PngjException(i5, iArr2);
            i4++;
            i2 = i5;
            i = PngjException;
        }
        int i6 = i ^ iArr[iArr.length - 2];
        int i7 = i2 ^ iArr[iArr.length - 1];
        if (!z) {
            PngjException(iArr);
        }
        iArr3[0] = i7;
        iArr3[1] = i6;
    }

    private static void PngjException(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    private static int PngjException(int i, int[][] iArr) {
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr[2][(i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE]) + iArr[3][i & KotlinVersion.MAX_COMPONENT_VALUE];
    }
}
