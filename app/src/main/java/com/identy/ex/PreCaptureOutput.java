package com.identy.ex;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Process;
import android.util.Base64;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.Position;
import com.identy.IdentyB;
import com.identy.enums.Finger;
import com.identy.imgutils.ImageUtils;
import defpackage.a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.io.ConstantsKt;
import org.c.a.values$values;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PreCaptureOutput {
    private static final byte[] $$a = {22, -6, 1, 71, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0};
    private static final int $$b = 33;
    int a;
    int b;
    public List<RectF> boxes;
    public List<Integer> boxesOrder;
    public int error;
    public boolean gotAllFingers;
    public byte[] img;
    public boolean isGoodToCapture;
    public List<byte[]> segments;
    public int streakCount;

    /* JADX WARN: Type inference failed for: r0v35, types: [boolean, int] */
    public PreCaptureOutput() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~Process.myTid();
                    int c = defpackage.a.c(i | (-8687617), -828, (((~(i | (-8687617))) | 507576896) * (-828)) + 1262351875, -1594298708);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5017;
                    Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(979612241 * i4);
                    int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                    int i8 = -(i4 * 1979560167);
                    int i9 = ((i7 & i8) + (i8 | i7)) - (-1438193424);
                    int i10 = i9 >> 24;
                    int i11 = ((i10 & (-511)) + (i10 | (-511))) / 256;
                    int i12 = (i9 - (~((i11 ^ 1) + ((i11 & 1) << 1)))) - 1;
                    int i13 = i9 >> 19;
                    int i14 = ((i13 ^ (-16383)) + ((i13 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i15 = -(i12 ^ ((i14 ^ 1) + ((i14 & 1) << 1)));
                    int i16 = ((i15 | 7) << 1) - (i15 ^ 7);
                    int i17 = i16 >> 29;
                    int a = IdentyB.a(i17 ^ (-15), (i17 & (-15)) << 1, 8, -1);
                    this.gotAllFingers = (0 / (((-((a & 1) + (a | 1))) & i16) * 561)) != 0;
                    this.streakCount = 0;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[34]);
            byte b2 = bArr[2];
            Object[] objArr3 = new Object[1];
            c(b, b2, (byte) (b2 | 124), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = (byte) (-bArr[111]);
            byte b4 = bArr[63];
            Object[] objArr4 = new Object[1];
            c(b3, b4, (byte) (b4 | 94), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -197710164);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5017;
            Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(979612241 * i42);
            int i72 = ((i52 | i62) << 1) - (i52 ^ i62);
            int i82 = -(i42 * 1979560167);
            int i92 = ((i72 & i82) + (i82 | i72)) - (-1438193424);
            int i102 = i92 >> 24;
            int i112 = ((i102 & (-511)) + (i102 | (-511))) / 256;
            int i122 = (i92 - (~((i112 ^ 1) + ((i112 & 1) << 1)))) - 1;
            int i132 = i92 >> 19;
            int i142 = ((i132 ^ (-16383)) + ((i132 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i152 = -(i122 ^ ((i142 ^ 1) + ((i142 & 1) << 1)));
            int i162 = ((i152 | 7) << 1) - (i152 ^ 7);
            int i172 = i162 >> 29;
            int a2 = IdentyB.a(i172 ^ (-15), (i172 & (-15)) << 1, 8, -1);
            this.gotAllFingers = (0 / (((-((a2 & 1) + (a2 | 1))) & i162) * 561)) != 0;
            this.streakCount = 0;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, int i2, Object[] objArr) {
        int i3;
        int i4 = 129 - i2;
        int i5 = 118 - (i * 19);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[44 - b];
        int i6 = 43 - b;
        int i7 = 0;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i7 = 0;
            int i8 = i4;
            int i9 = i6;
            i5 = (i9 + (-i5)) - 13;
            i4 = i8 + 1;
            bArr = bArr3;
            i3 = i7;
            bArr2[i3] = (byte) i5;
            i7 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i4];
            int i10 = i4;
            i9 = i5;
            i5 = b2;
            bArr3 = bArr;
            i8 = i10;
            i5 = (i9 + (-i5)) - 13;
            i4 = i8 + 1;
            bArr = bArr3;
            i3 = i7;
            bArr2[i3] = (byte) i5;
            i7 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i7 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    public JSONObject a(RectF rectF) {
        Object[] objArr = new Object[]{new long[1], new int[1]};
        long j;
        JSONObject jSONObject = new JSONObject();
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int identityHashCode = System.identityHashCode(this);
                        int c = defpackage.a.c((~(identityHashCode | 331497871)) | (~((~identityHashCode) | (-331497872))) | (~((-167391409) | identityHashCode)), 959, ((((~((-167391409) | 0)) | (~((-331497872) | identityHashCode))) | (~(0 | 331497871))) * 959) - 2013489538, 353463146);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4881;
                        Fpnative.valueOf = objArr;
                        jSONObject = new JSONObject();
                        jSONObject.put("left", rectF.left);
                        jSONObject.put("bottom", rectF.bottom);
                        jSONObject.put("right", rectF.right);
                        int i3 = ((int[]) objArr[1])[0];
                        int i4 = i3 * i3;
                        int i5 = -(1493470118 * i3);
                        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                        int i7 = -(i3 * (-203772988));
                        int i8 = (i6 & i7) + (i7 | i6);
                        int i9 = (i8 & 564833785) + (564833785 | i8);
                        int i10 = i9 >> 19;
                        int i11 = (((i10 ^ (-16383)) + ((i10 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE) + 1;
                        int i12 = (i9 ^ i11) + ((i11 & i9) << 1);
                        int i13 = i9 >> 25;
                        int i14 = ((i13 & (-255)) + (i13 | (-255))) / 128;
                        int i15 = -((((i14 | 1) << 1) - (i14 ^ 1)) ^ i12);
                        int i16 = (i15 ^ 1) + ((i15 & 1) << 1);
                        int i17 = ((i16 >> 21) - 4095) / 2048;
                        int i18 = (i17 ^ 1) + ((i17 & 1) << 1);
                        jSONObject.put("1/top".substring(2338 / (((-(((i18 | 1) << 1) - (i18 ^ 1))) & i16) * 1169)), rectF.top);
                        return jSONObject;
                    }
                }
                jSONObject.put("left", rectF.left);
                jSONObject.put("bottom", rectF.bottom);
                jSONObject.put("right", rectF.right);
                int i32 = ((int[]) objArr[1])[0];
                int i42 = i32 * i32;
                int i52 = -(1493470118 * i32);
                int i62 = (i42 ^ i52) + ((i42 & i52) << 1);
                int i72 = -(i32 * (-203772988));
                int i82 = (i62 & i72) + (i72 | i62);
                int i92 = (i82 & 564833785) + (564833785 | i82);
                int i102 = i92 >> 19;
                int i112 = (((i102 ^ (-16383)) + ((i102 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE) + 1;
                int i122 = (i92 ^ i112) + ((i112 & i92) << 1);
                int i132 = i92 >> 25;
                int i142 = ((i132 & (-255)) + (i132 | (-255))) / 128;
                int i152 = -((((i142 | 1) << 1) - (i142 ^ 1)) ^ i122);
                int i162 = (i152 ^ 1) + ((i152 & 1) << 1);
                int i172 = ((i162 >> 21) - 4095) / 2048;
                int i182 = (i172 ^ 1) + ((i172 & 1) << 1);
                jSONObject.put("1/top".substring(2338 / (((-(((i182 | 1) << 1) - (i182 ^ 1))) & i162) * 1169)), rectF.top);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return jSONObject;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public List<RectF> getBoxes() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-95229732))) | 594119011, 519, (((~((~identityHashCode) | (-19464484))) | (~((-75765249) | identityHashCode))) * (-519)) + ((((~((-594119012) | 0)) | (-95229732)) * 519) - 726608762), 1537818787);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4923;
                    Fpnative.valueOf = objArr;
                    return this.boxes;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[29]);
            byte b2 = bArr[2];
            int i3 = $$b;
            Object[] objArr3 = new Object[1];
            c(b, b2, (byte) (i3 - 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (i3 - 5), bArr[25], bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1537818787);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4923;
            Fpnative.valueOf = objArr;
            return this.boxes;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public FingerError getError() {
        Object[] objArr;
        long j;
        FingerError[] values;
        int i;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i2 = ~elapsedCpuTime;
                    int c = defpackage.a.c((~(i2 | 488797651)) | 987686931, 217, (((~(elapsedCpuTime | (-987686932))) | 584878080) * 217) + (((~((-987686932) | i2)) | (~(488797651 | elapsedCpuTime))) * 217) + 34398909, -2012057691);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4986;
                    Fpnative.valueOf = objArr;
                    values = FingerError.values();
                    i = this.error;
                    if (i < values.length || i < 0) {
                        return null;
                    }
                    return values[i];
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[29]);
            byte b2 = bArr[2];
            int i5 = $$b;
            Object[] objArr3 = new Object[1];
            c(b, b2, (byte) (i5 - 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (i5 - 5), bArr[25], bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2012057691);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4986;
            Fpnative.valueOf = objArr;
            values = FingerError.values();
            i = this.error;
            if (i < values.length) {
            }
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public byte[] getImg() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c(identityHashCode | (-439802602), 496, (((~((-938691882) | identityHashCode)) | 633406720 | (~((~identityHashCode) | (-134517441)))) * (-496)) + ((0 * 992) - 2137057233), -955806130);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5018;
                    Fpnative.valueOf = objArr;
                    return this.img;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[63];
            byte b2 = bArr[2];
            Object[] objArr3 = new Object[1];
            c(b, b2, (byte) (b2 | 88), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (-bArr[4]), bArr[25], (byte) (-bArr[117]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -955806130);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5018;
            Fpnative.valueOf = objArr;
            return this.img;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0155 A[LOOP:0: B:14:0x014f->B:16:0x0155, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<values$values> getRecog(RectF rectF, boolean z) {
        throw new UnsupportedOperationException("Method not decompiled");
    }


    public List<byte[]> getSegments() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~((-584890497) | identityHashCode);
                    int i2 = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | 939327229)) | (~(i2 | (-853326014))) | 268435517, 497, ((i | (~(i2 | 939327229))) * 497) + 291821168, -598930051);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4938;
                    Fpnative.valueOf = objArr;
                    return this.segments;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[29]);
            byte b2 = bArr[2];
            int i5 = $$b;
            Object[] objArr3 = new Object[1];
            c(b, b2, (byte) (i5 - 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (i5 - 5), bArr[25], bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -598930051);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4938;
            Fpnative.valueOf = objArr;
            return this.segments;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public int getStreakCount() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = defpackage.a.c((~(elapsedCpuTime | (-519137810))) | 1018027089, 519, (((~((~elapsedCpuTime) | (-480331794))) | (~((-38806017) | elapsedCpuTime))) * (-519)) + ((((~((-1018027090) | 0)) | (-519137810)) * 519) - 726608762), -13850401);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4888;
                    Fpnative.valueOf = objArr;
                    return this.streakCount;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[34]);
            byte b2 = bArr[2];
            Object[] objArr3 = new Object[1];
            c(b, b2, (byte) (b2 | 124), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = (byte) (-bArr[111]);
            byte b4 = bArr[63];
            Object[] objArr4 = new Object[1];
            c(b3, b4, (byte) (b4 | 94), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -13850401);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4888;
            Fpnative.valueOf = objArr;
            return this.streakCount;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public boolean ignoreCapture() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | 393113599)) | (~(i | (-18892851))) | (~((-105775681) | identityHashCode)), 192, (((~((-124668531) | i)) | 105775680) * (-384)) + ((268445069 | i) * (-192)) + 1796350335, 382391057);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4960;
                    Fpnative.valueOf = objArr;
                    return this.gotAllFingers;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[29]);
            byte b2 = bArr[2];
            int i4 = $$b;
            Object[] objArr3 = new Object[1];
            c(b, b2, (byte) (i4 - 5), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (i4 - 5), bArr[25], bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 382391057);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4960;
            Fpnative.valueOf = objArr;
            return this.gotAllFingers;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public boolean isGoodToCapture() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int c = defpackage.a.c((~(startUptimeMillis | 630891822)) | (-574920641), 70, ((~((-38015681) | startUptimeMillis)) * 70) + ((((~((-132002543) | startUptimeMillis)) | 93986862) * (-140)) - 1933080019), -710355434);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4895;
                    Fpnative.valueOf = objArr;
                    return this.isGoodToCapture;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[63];
            byte b2 = bArr[2];
            Object[] objArr3 = new Object[1];
            c(b, b2, (byte) (b2 | 88), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((byte) (-bArr[4]), bArr[25], (byte) (-bArr[117]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -710355434);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4895;
            Fpnative.valueOf = objArr;
            return this.isGoodToCapture;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public void setWidthHeight(int i, int i2) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-237569))) | (~((~identityHashCode) | 35889448)) | 499126848, 757, ((~(535016296 | identityHashCode)) * 1514) + (((534778728 | 0) * (-757)) - 1296997628), 1107248303);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4873;
                    Fpnative.valueOf = objArr;
                    this.a = i;
                    this.b = i2;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[34]);
            byte b2 = bArr[2];
            Object[] objArr3 = new Object[1];
            c(b, b2, (byte) (b2 | 124), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = (byte) (-bArr[111]);
            byte b4 = bArr[63];
            Object[] objArr4 = new Object[1];
            c(b3, b4, (byte) (b4 | 94), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1107248303);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4873;
            Fpnative.valueOf = objArr;
            this.a = i;
            this.b = i2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:3|(12:5|6|7|8|9|10|11|12|13|(2:16|14)|17|18))|23|24|25|6|7|8|9|10|11|12|13|(1:14)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0154, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0155, code lost:
    
        0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016b A[LOOP:0: B:14:0x0165->B:16:0x016b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject toJson(long j, long j2) {
        throw new UnsupportedOperationException("Method not decompiled");
    }


    public String toString() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = (~(372281036 | identityHashCode)) | 567083264;
                    int i2 = ~((~identityHashCode) | (-68193985));
                    int c = defpackage.a.c((~(identityHashCode | 939364300)) | i2, 470, ((i | i2) * (-470)) + 740051007, 940313177);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4856;
                    Fpnative.valueOf = objArr;
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = ((((i5 * i5) - (~(-(1643325176 * i5)))) - 1) - (~(-(i5 * (-1066424526))))) - 1;
                    int i7 = (i6 & 1770776505) + (1770776505 | i6);
                    int i8 = i7 >> 22;
                    int i9 = (((i8 | (-2047)) << 1) - (i8 ^ (-2047))) / 1024;
                    int i10 = (i9 ^ 1) + ((i9 & 1) << 1);
                    int i11 = (i7 ^ i10) + ((i10 & i7) << 1);
                    int i12 = ((i7 >> 28) - 31) / 16;
                    int i13 = (-(i11 ^ (((i12 | 1) << 1) - (i12 ^ 1)))) + 2;
                    int i14 = i13 >> 20;
                    int i15 = ((i14 & (-8191)) + (i14 | (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i16 = (i15 ^ 1) + ((i15 & 1) << 1);
                    return IdentyB.c(i13 & (-((i16 ^ 1) + ((i16 & 1) << 1))), 702, 7020, "6,26,");
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[34]);
            byte b2 = bArr[2];
            Object[] objArr3 = new Object[1];
            c(b, b2, (byte) (b2 | 124), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = (byte) (-bArr[111]);
            byte b4 = bArr[63];
            Object[] objArr4 = new Object[1];
            c(b3, b4, (byte) (b4 | 94), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 940313177);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4856;
            Fpnative.valueOf = objArr;
            int i52 = ((int[]) objArr[1])[0];
            int i62 = ((((i52 * i52) - (~(-(1643325176 * i52)))) - 1) - (~(-(i52 * (-1066424526))))) - 1;
            int i72 = (i62 & 1770776505) + (1770776505 | i62);
            int i82 = i72 >> 22;
            int i92 = (((i82 | (-2047)) << 1) - (i82 ^ (-2047))) / 1024;
            int i102 = (i92 ^ 1) + ((i92 & 1) << 1);
            int i112 = (i72 ^ i102) + ((i102 & i72) << 1);
            int i122 = ((i72 >> 28) - 31) / 16;
            int i132 = (-(i112 ^ (((i122 | 1) << 1) - (i122 ^ 1)))) + 2;
            int i142 = i132 >> 20;
            int i152 = ((i142 & (-8191)) + (i142 | (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            int i162 = (i152 ^ 1) + ((i152 & 1) << 1);
            return IdentyB.c(i132 & (-((i162 ^ 1) + ((i162 & 1) << 1))), 702, 7020, "6,26,");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(2:3|(13:5|6|7|8|9|10|11|12|13|(5:28|29|(2:32|30)|33|34)|15|(4:17|(2:20|18)|21|22)|26))|42|43|44|6|7|8|9|10|11|12|13|(0)|15|(0)|26) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e8, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
    
        0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject toJson() {
        throw new UnsupportedOperationException("Method not decompiled");
    }

}
