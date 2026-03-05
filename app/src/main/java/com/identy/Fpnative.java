package com.identy;

import android.content.res.AssetManager;
import com.identy.ex.PostCaptureOutPut;
import com.identy.ex.PreCaptureOutput;
import com.identy.ex.RResult;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Fpnative {
    public static Object[] valueOf;

    public static native long configure(long j, int i, int i2, int[] iArr, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, float[] fArr, boolean z2, long j2, boolean z3, boolean z4, boolean z5);

    public static native long configureroll(long j, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2, boolean z3);

    public static native byte[] cvtmat2ba(long j);

    public static native void cvtyuv2bgr(long j, boolean z);

    public static native Object[] deduplication(long j, int i, HashMap<Integer, byte[]> hashMap);

    public static native void destroy(long j, long j2);

    public static native HashMap<Integer, byte[]> generate(long j, int i, int[] iArr, float f, boolean z);

    public static native byte[] generateID(long j, int i, int i2, byte[] bArr);

    public static native int generateNFIQ(long j, int i);

    public static native SlapOutput generateST(long j, long[] jArr, int[] iArr, int[] iArr2, float f);

    public static native byte[] generateT(long j, long j2, int i, int i2, float f);

    public static native String getServerRequest(long j, int i, boolean z);

    public static native VerifyResult match(long j, int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4);

    public static native VerifyResult matchCaptured(long j, HashMap<Integer, byte[]> hashMap, int i);

    public static native VerifyResult matchMultiple(long j, int i, HashMap<Integer, byte[]> hashMap, int i2, HashMap<Integer, byte[]> hashMap2, int i3);

    public static native PreCaptureOutput pfk(long j, long j2, int i, boolean z);

    public static native RResult pfkrol(long j, long j2, int i, int i2, int i3);

    public static native void pfkrolChangeMinMaxWidth(long j, int i, int i2);

    public static native int pfkrolGetQuality(long j);

    public static native RResult pfkrolfinalize(long j, long j2, int i, int i2);

    public static native long pfkrolfinalizeF(long j);

    public static native PostCaptureOutPut ppk(long j, long j2, long j3, long j4, boolean z, float[] fArr, float[] fArr2, float[] fArr3, int i, int i2, int i3, boolean z2, long j5);

    public static native void resetAttempt(long j);

    public static native HashMap<Integer, byte[]> rgenerate(long j, int i, int[] iArr, float f, boolean z);

    public static native void setDConfig(long j, int i);

    public static native Object[] uxd565jj(AssetManager assetManager, long j, long j2, boolean z);

    public static native Object[] uxd565jk(long j, int i, int i2);

    public static native long uxd566jk(AssetManager assetManager, long j, long j2);
}
