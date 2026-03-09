package com.identy.app.s3;

import android.os.Process;
import android.os.SystemClock;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.IdentyB;
import defpackage.a;
import java.lang.reflect.Method;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PostCaptureInput {
    private static final byte[] $$a = {0, ByteCompanionObject.MIN_VALUE, -106, -9, 69, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12};
    private static final int $$b = 13;
    float[] a;
    float[] b;
    float[] c;
    float[] d;

    public PostCaptureInput(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((~((int) SystemClock.uptimeMillis())) | (-474015821));
                    int c = defpackage.a.c(i | 566039168, 970, (((-1040054989) | i) * (-970)) + 1660685437, 1494832134);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5038;
                    Fpnative.valueOf = objArr;
                    this.a = fArr;
                    this.b = fArr2;
                    this.c = fArr3;
                    this.d = fArr4;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[63]);
            byte b2 = (byte) ($$b | 66);
            Object[] objArr3 = new Object[1];
            e(b, b2, (byte) (b2 & 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[0];
            Object[] objArr4 = new Object[1];
            e(b3, (byte) (b3 | 48), bArr[26], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1494832134);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5038;
            Fpnative.valueOf = objArr;
            this.a = fArr;
            this.b = fArr2;
            this.c = fArr3;
            this.d = fArr4;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(byte b, byte b2, short s, Object[] objArr) {
        int i;
        int i2;
        int i3 = (s * 19) + 80;
        byte[] bArr = $$a;
        int i4 = 84 - b2;
        int i5 = b + 6;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            i2 = 0;
            int i8 = i7 + 1;
            i3 = (i4 + (-i6)) - 13;
            i4 = i8;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            int i9 = i3;
            i7 = i4;
            i4 = i9;
            int i82 = i7 + 1;
            i3 = (i4 + (-i6)) - 13;
            i4 = i82;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject toJson() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int c = defpackage.a.c((~(startElapsedRealtime | (-134883591))) | 305152185, 446, (((~((~startElapsedRealtime) | (-164310343))) | 29426752) * 446) + 1332570237, 857413437);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4992;
                    Fpnative.valueOf = objArr;
                    JSONObject jSONObject = new JSONObject();
                    if (this.a != null) {
                        jSONObject.put("xdata", new JSONArray(this.a));
                    }
                    if (this.b != null) {
                        jSONObject.put("ydata", new JSONArray(this.b));
                    }
                    if (this.c != null) {
                        JSONArray jSONArray = new JSONArray(this.c);
                        int i3 = ((int[]) objArr[1])[0];
                        int i4 = ((i3 * i3) - (~(-(321241103 * i3)))) - 1;
                        int i5 = -(i3 * (-1827786811));
                        int i6 = ((i4 & i5) + (i5 | i4)) - (-399073764);
                        int i7 = i6 >> 15;
                        int i8 = ((i7 ^ (-262143)) + ((i7 & (-262143)) << 1)) / 131072;
                        int i9 = (i8 ^ 1) + ((i8 & 1) << 1);
                        int i10 = (i6 & i9) + (i9 | i6);
                        int i11 = ((i6 >> 16) - 131071) / 65536;
                        int i12 = -(i10 ^ ((i11 & 1) + (i11 | 1)));
                        int i13 = (i12 & 7) + (i12 | 7);
                        int i14 = i13 >> 24;
                        int a = IdentyB.a(i14 ^ (-511), (i14 & (-511)) << 1, 256, -1);
                        jSONObject.put(IdentyB.c((-((a ^ 1) + ((a & 1) << 1))) & i13, 1673, 163954, "0|29|24|25|15|zdata"), jSONArray);
                    }
                    if (this.d != null) {
                        jSONObject.put("gyroY", new JSONArray(this.d));
                    }
                    return jSONObject;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[57];
            Object[] objArr3 = new Object[1];
            e((byte) 38, b, (byte) (b & 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = (byte) $$b;
            byte b3 = bArr[0];
            Object[] objArr4 = new Object[1];
            e(b2, b3, b3, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 617983933);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4992;
            Fpnative.valueOf = objArr;
            JSONObject jSONObject2 = new JSONObject();
            if (this.a != null) {
            }
            if (this.b != null) {
            }
            if (this.c != null) {
            }
            if (this.d != null) {
            }
            return jSONObject2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }
}
