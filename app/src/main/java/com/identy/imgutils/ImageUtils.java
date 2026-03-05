package com.identy.imgutils;

import android.graphics.Matrix;

/* loaded from: classes2.dex */
public class ImageUtils {
    static {
        try {
            System.loadLibrary("tensorflow_demo");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static native void convertYUV420SPToARGB8888(byte[] bArr, int[] iArr, int i, int i2, boolean z);

    public static native Object[] convertYUV420ToNV21(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public static int valueOf(int i, int i2) {
        return (i * i2) + ((((i2 + 1) / 2) * ((i + 1) / 2)) << 1);
    }

    public static Matrix valueOf(int i, int i2, int i3, int i4, float f) {
        Matrix matrix = new Matrix();
        if (f != 0.0f) {
            matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
            matrix.postRotate(f);
        }
        boolean z = (Math.abs(f) + 90.0f) % 180.0f == 0.0f;
        int i5 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        if (i5 != i3 || i != i4) {
            matrix.postScale(i3 / i5, i4 / i);
        }
        if (f != 0.0f) {
            matrix.postTranslate(i3 / 2.0f, i4 / 2.0f);
        }
        return matrix;
    }

    public static void valueOf(byte[] bArr, int i, int i2, int[] iArr) {
        try {
            convertYUV420SPToARGB8888(bArr, iArr, i, i2, false);
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
