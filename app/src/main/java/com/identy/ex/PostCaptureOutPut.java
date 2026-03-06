package com.identy.ex;

import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.d.e.a.values;
import com.identy.Action;
import com.identy.Fpnative;
import com.identy.LibSettings;
import com.identy.PngjOutputException;
import com.identy.Position;
import com.identy.IdentyB;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.getProcessingTime;
import defpackage.a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.ConstantsKt;
import org.identy.opencv.core.Mat;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PostCaptureOutPut {
    private static final byte[] $$a = {122, 44, -96, 114, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0};
    private static final int $$b = 248;
    boolean a;
    public ASResult asResult;
    public Map<Integer, Long> binarized;
    public Map<Integer, Float> capturerfQuality;
    public boolean capturerfQualityPass;
    public Map<Integer, Float> capturertQuality;
    public boolean capturertQualityPass;
    public byte[] encodedASImage;
    public Map<Integer, byte[]> encodedSegments;
    public int error;
    public Map<Integer, Float> framerfQuality;
    public boolean framerfQualityPass;
    public Map<Integer, Float> framertQuality;
    public boolean framertQualityPass;
    public boolean isrfQualityPassed;
    public boolean isrtQualityPassed;
    public Map<Integer, Boolean> pickedFromCapture;
    public Map<Integer, Float> rfQuality;
    public boolean rfQualityPass;
    public Map<Integer, Float> rtQuality;
    public boolean rtQualityPass;
    public Map<String, Long> timing;

    /* JADX WARN: Type inference failed for: r1v26, types: [boolean, int] */
    public PostCaptureOutPut() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((int) Process.getStartUptimeMillis());
                    int c = a.c((~(i | 384609312)) | (-270756416), 494, (((-213536) | i) * 494) + 1108573101, -581597572);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4975;
                    Fpnative.valueOf = objArr;
                    this.rtQualityPass = true;
                    this.framertQualityPass = true;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(412900802 * i4);
                    int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                    int i8 = -(i4 * 1897332142);
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    int i10 = ((i9 | (-1210960832)) << 1) - ((-1210960832) ^ i9);
                    int i11 = i10 >> 18;
                    int i12 = (i11 - 32767) / 16384;
                    int i13 = (i10 - (~((i12 ^ 1) + ((i12 & 1) << 1)))) - 1;
                    int i14 = (((i11 | (-32767)) << 1) - (i11 ^ (-32767))) / 16384;
                    int i15 = -(((i14 & 1) + (i14 | 1)) ^ i13);
                    int i16 = (i15 & 7) + (i15 | 7);
                    int i17 = i16 >> 19;
                    int i18 = ((i17 ^ (-16383)) + ((i17 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i19 = ((i18 | 1) << 1) - (i18 ^ 1);
                    this.capturertQualityPass = 13832 / (((-(((i19 | 1) << 1) - (i19 ^ 1))) & i16) * 1976);
                    this.rfQualityPass = true;
                    this.framerfQualityPass = true;
                    this.capturerfQualityPass = true;
                    this.a = false;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 125, (byte) (-bArr[113]), (byte) (-bArr[34]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) 94, bArr[63], (byte) (-bArr[111]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -581597572);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4975;
            Fpnative.valueOf = objArr;
            this.rtQualityPass = true;
            this.framertQualityPass = true;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(412900802 * i42);
            int i72 = ((i52 | i62) << 1) - (i52 ^ i62);
            int i82 = -(i42 * 1897332142);
            int i92 = (i72 ^ i82) + ((i82 & i72) << 1);
            int i102 = ((i92 | (-1210960832)) << 1) - ((-1210960832) ^ i92);
            int i112 = i102 >> 18;
            int i122 = (i112 - 32767) / 16384;
            int i132 = (i102 - (~((i122 ^ 1) + ((i122 & 1) << 1)))) - 1;
            int i142 = (((i112 | (-32767)) << 1) - (i112 ^ (-32767))) / 16384;
            int i152 = -(((i142 & 1) + (i142 | 1)) ^ i132);
            int i162 = (i152 & 7) + (i152 | 7);
            int i172 = i162 >> 19;
            int i182 = ((i172 ^ (-16383)) + ((i172 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i192 = ((i182 | 1) << 1) - (i182 ^ 1);
            this.capturertQualityPass = 13832 / (((-(((i192 | 1) << 1) - (i192 ^ 1))) & i162) * 1976);
            this.rfQualityPass = true;
            this.framerfQualityPass = true;
            this.capturerfQualityPass = true;
            this.a = false;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, Object[] objArr) {
        int i2;
        int i3;
        int r5 = 129 - s;
        byte[] bArr = $$a;
        int i4 = 118 - (s2 * 19);
        byte[] bArr2 = new byte[44 - i];
        int i5 = 43 - i;
        if (bArr == null) {
            byte b = 0;
            i2 = 0;
            int i6 = 0;
            i4 = (i4 + (-b)) - 13;
            i3 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            b = bArr[i3];
            i2++;
            i6 = i3;
            i4 = (i4 + (-b)) - 13;
            i3 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject fillQuality(Map<Integer, Float> map) {
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
                    int c = a.c((~((~identityHashCode) | 701664820)) | 202775540, 168, (((~(identityHashCode | 701664820)) | 67375552) * (-168)) + ((((~(202775540 | identityHashCode)) | 566264832) * 336) - 1710130969), -1665956533);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4873;
                    Fpnative.valueOf = objArr;
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<Integer, Float> entry : map.entrySet()) {
                        try {
                            jSONObject.put(entry.getKey().toString(), entry.getValue());
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    return jSONObject;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 89, (byte) (-bArr[113]), bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[117]), bArr[25], (byte) (-bArr[4]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1665956533);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4873;
            Fpnative.valueOf = objArr;
            JSONObject jSONObject2 = new JSONObject();
            while (0.hasNext()) {
            }
            return jSONObject2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public ASResult getAsResult() {
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
                    int c = a.c((~((~identityHashCode) | 928906858)) | 286801962, 449, (((~(928906858 | identityHashCode)) | 286801962) * 449) + 1116117142, -1756537460);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5046;
                    Fpnative.valueOf = objArr;
                    return this.asResult;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 89, (byte) (-bArr[113]), bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[117]), bArr[25], (byte) (-bArr[4]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1756537460);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5046;
            Fpnative.valueOf = objArr;
            return this.asResult;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public Map<Integer, Long> getBinarized() {
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
                    int i = ~startElapsedRealtime;
                    int c = a.c((~(startElapsedRealtime | (-44056577))) | (~(128009648 | i)) | 542945856, 676, (((~(626898928 | i)) | (-670955505)) * 676) + (((670955504 | startElapsedRealtime) * (-676)) - 284020893), 84367867);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5017;
                    Fpnative.valueOf = objArr;
                    return this.binarized;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (bArr[20] + 1), (byte) (-bArr[113]), (byte) (-bArr[29]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[63], bArr[25], (byte) (bArr[20] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 84367867);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5017;
            Fpnative.valueOf = objArr;
            return this.binarized;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public byte[] getEncodedASImage() {
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
                    int c = a.c(identityHashCode | (-5247169), 744, (((~identityHashCode) | 504136448) * 744) + (((((~(1049553664 | identityHashCode)) | 5247168) | (~((-550664385) | identityHashCode))) * (-744)) - 1307546841), 1451327454);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4890;
                    Fpnative.valueOf = objArr;
                    return this.encodedASImage;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (bArr[20] + 1), (byte) (-bArr[113]), (byte) (-bArr[29]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[63], bArr[25], (byte) (bArr[20] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1451327454);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4890;
            Fpnative.valueOf = objArr;
            return this.encodedASImage;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public Map<Integer, byte[]> getEncodedSegments() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int i = ~myUid;
                    int c = a.c((~(myUid | 257249633)) | (~(i | (-241639647))) | (~(241639646 | myUid)), 831, ((~((-17846562) | myUid)) * (-1662)) + (((~((-257249634) | i)) | (~(259486207 | myUid))) * (-831)) + 585886588, 1514698944);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5031;
                    Fpnative.valueOf = objArr;
                    return this.encodedSegments;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 125, (byte) (-bArr[113]), (byte) (-bArr[34]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) 94, bArr[63], (byte) (-bArr[111]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1514698944);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5031;
            Fpnative.valueOf = objArr;
            return this.encodedSegments;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public PostCaptureError getError() {
        Object[] objArr;
        long j;
        PostCaptureError[] valuesCustom;
        int i;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = a.c((~((~elapsedCpuTime) | 1071509470)) | 303587358, 576, (((~(438103774 | elapsedCpuTime)) | 633405696) * 576) + 901473407, -1794337714);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4878;
                    Fpnative.valueOf = objArr;
                    valuesCustom = PostCaptureError.valuesCustom();
                    i = this.error;
                    if (i < valuesCustom.length || i < 0) {
                        return null;
                    }
                    return valuesCustom[i];
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (bArr[20] + 1), (byte) (-bArr[113]), (byte) (-bArr[29]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[63], bArr[25], (byte) (bArr[20] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1563798450);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4878;
            Fpnative.valueOf = objArr;
            valuesCustom = PostCaptureError.valuesCustom();
            i = this.error;
            if (i < valuesCustom.length) {
            }
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HashMap<Pair<Hand, Finger>, com.identy.IdentyA> getFingerRegions(Action action, FingerDetectionMode fingerDetectionMode) {
        Object[] objArr;
        long j;
        Map<Integer, Long> map;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~(System.identityHashCode(this) | 654311374)) | 78864398, 130, ((~((~0) | 654311374)) * 130) - 2002415039, -466829566);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4889;
                    Fpnative.valueOf = objArr;
                    HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap = new HashMap<>(4);
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(400532661 * i3);
                    int i6 = (i4 & i5) + (i4 | i5);
                    int i7 = -(i3 * (-1478293427));
                    int i8 = (((i6 | i7) << 1) - (i7 ^ i6)) - 369300223;
                    int i9 = i8 >> 23;
                    int i10 = ((i9 ^ (-1023)) + ((i9 & (-1023)) << 1)) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i11 = (i8 - (~(((i10 | 1) << 1) - (i10 ^ 1)))) - 1;
                    int i12 = ((i8 >> 15) - 262143) / 131072;
                    int i13 = (-(i11 ^ ((i12 & 1) + (i12 | 1)))) + 8;
                    int i14 = 0 / ((i13 & (-IdentyB.e(i13 >> 24, 511, 256, -2))) * 286);
                    map = this.binarized;
                    if (map != null) {
                        int i15 = i14;
                        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
                            Pair<Hand, Finger> pair = Position.getFromOrdinal(entry.getKey().intValue()).getPair();
                            Hand hand = (Hand) pair.first;
                            Finger finger = (Finger) pair.second;
                            this.pickedFromCapture.get(entry.getKey());
                            FingerDetectionMode fingerDetectionMode2 = fingerDetectionMode;
                            com.identy.IdentyA aVar = new com.identy.IdentyA(i15, hand, finger, fingerDetectionMode2, false);
                            if (this.pickedFromCapture.get(entry.getKey()).booleanValue()) {
                                this.a = true;
                            }
                            if (action.equals(Action.VERIFY)) {
                                Hand hand2 = (Hand) pair.first;
                                Finger finger2 = (Finger) pair.second;
                                this.pickedFromCapture.get(entry.getKey());
                                aVar = new getProcessingTime(i15, hand2, finger2, fingerDetectionMode2);
                            }
                            if (this.rfQuality.containsKey(entry.getKey())) {
                                aVar.PngjUnsupportedException = this.rfQuality.get(entry.getKey()).intValue();
                            }
                            if (this.rtQuality.containsKey(entry.getKey())) {
                                aVar.PngjException = this.rfQuality.get(entry.getKey()).floatValue();
                            }
                            aVar.values(new Mat(entry.getValue().longValue()));
                            i15++;
                            hashMap.put(pair, aVar);
                            fingerDetectionMode = fingerDetectionMode2;
                        }
                    }
                    return hashMap;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (bArr[20] + 1), (byte) (-bArr[113]), (byte) (-bArr[29]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[63], bArr[25], (byte) (bArr[20] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -466829566);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4889;
            Fpnative.valueOf = objArr;
            HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2 = new HashMap<>(4);
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(400532661 * i32);
            int i62 = (i42 & i52) + (i42 | i52);
            int i72 = -(i32 * (-1478293427));
            int i82 = (((i62 | i72) << 1) - (i72 ^ i62)) - 369300223;
            int i92 = i82 >> 23;
            int i102 = ((i92 ^ (-1023)) + ((i92 & (-1023)) << 1)) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i112 = (i82 - (~(((i102 | 1) << 1) - (i102 ^ 1)))) - 1;
            int i122 = ((i82 >> 15) - 262143) / 131072;
            int i132 = (-(i112 ^ ((i122 & 1) + (i122 | 1)))) + 8;
            int i142 = 0 / ((i132 & (-IdentyB.e(i132 >> 24, 511, 256, -2))) * 286);
            map = this.binarized;
            if (map != null) {
            }
            return hashMap2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00df A[LOOP:0: B:7:0x00d9->B:9:0x00df, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HashMap<Pair<Hand, Finger>, Float> getRfQuality() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((int) SystemClock.uptimeMillis());
                    int c = a.c((~(i | (-301260844))) | 271605803, 983, (((~((-197628437) | i)) | (-301260844)) * (-983)) + 11691054, -1178259779);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4956;
                    Fpnative.valueOf = objArr;
                    HashMap<Pair<Hand, Finger>, Float> hashMap = new HashMap<>();
                    for (Map.Entry<Integer, Float> entry : this.rfQuality.entrySet()) {
                        hashMap.put(Position.getFromOrdinal(entry.getKey().intValue()).getPair(), entry.getValue());
                    }
                    return hashMap;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 125, (byte) (-bArr[113]), (byte) (-bArr[34]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) 94, bArr[63], (byte) (-bArr[111]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1178259779);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4956;
            Fpnative.valueOf = objArr;
            HashMap<Pair<Hand, Finger>, Float> hashMap2 = new HashMap<>();
            while (0.hasNext()) {
            }
            return hashMap2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HashMap<Pair<Hand, Finger>, Float> getRtQuality() {
        Object[] objArr;
        long j;
        Map<Integer, Float> map;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~((-131168438) | identityHashCode);
                    int i2 = ~identityHashCode;
                    int i3 = i | (~(367720842 | i2));
                    int c = a.c(271221002 | (~(131168437 | i2)), 516, (((~(identityHashCode | (-96499841))) | (~(i2 | (-271221003)))) * 516) + (((i3 | 0) * (-516)) - 1303067413), -639380744);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 5004;
                    Fpnative.valueOf = objArr;
                    HashMap<Pair<Hand, Finger>, Float> hashMap = new HashMap<>();
                    map = this.rtQuality;
                    if (map != null) {
                        for (Map.Entry<Integer, Float> entry : map.entrySet()) {
                            hashMap.put(Position.getFromOrdinal(entry.getKey().intValue()).getPair(), entry.getValue());
                        }
                    }
                    return hashMap;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 125, (byte) (-bArr[113]), (byte) (-bArr[34]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) 94, bArr[63], (byte) (-bArr[111]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -639380744);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5004;
            Fpnative.valueOf = objArr;
            HashMap<Pair<Hand, Finger>, Float> hashMap2 = new HashMap<>();
            map = this.rtQuality;
            if (map != null) {
            }
            return hashMap2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public Map<String, Long> getTiming() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~(System.identityHashCode(this) | 437414940)) | 27787811, 658, ((431516223 | 0) * (-658)) - 135787977, 541119782);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5005;
                    Fpnative.valueOf = objArr;
                    return this.timing;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 89, (byte) (-bArr[113]), bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[117]), bArr[25], (byte) (-bArr[4]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 541119782);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5005;
            Fpnative.valueOf = objArr;
            return this.timing;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean isImagefromCaptured() {
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
                    int i = ~startUptimeMillis;
                    int c = a.c((~(startUptimeMillis | (-1031519353))) | 532630072 | (~(i | 1031519352)), 45, (((~(532630072 | startUptimeMillis)) | 42222080) * (-45)) + (((~(532630072 | i)) | 1031519352) * (-90)) + 1474070354, -2022991983);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5045;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 89, (byte) (-bArr[113]), bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[117]), bArr[25], (byte) (-bArr[4]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2022991983);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5045;
            Fpnative.valueOf = objArr;
            return this.a;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean isrfQualityPassed() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int b = a.b(765839178);
                    int i = ~b;
                    int i2 = (((~((-537729089) | i)) | (~((-307291683) | b))) * 520) + 1313698839;
                    int i3 = ~(307291682 | i);
                    int i4 = ~(b | 806180962);
                    int c = a.c(i4 | (~(i | (-806180963))) | (-845020771), 520, ((i3 | i4) * (-1040)) + i2, 491036741);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 5011;
                    Fpnative.valueOf = objArr;
                    return this.isrfQualityPassed;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 125, (byte) (-bArr[113]), (byte) (-bArr[34]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) 94, bArr[63], (byte) (-bArr[111]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 491036741);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5011;
            Fpnative.valueOf = objArr;
            return this.isrfQualityPassed;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [boolean, int] */
    public boolean isrtQualityPassed() {
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
                    int i2 = ~((-158515298) | i);
                    int i3 = ~((-340373983) | identityHashCode);
                    int c = a.c((~(identityHashCode | (-158515298))) | (~(i | 158515297)), 575, ((i3 | (~(340373982 | i))) * (-575)) + ((i2 | i3) * 1150) + 1400362686, -244655984);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4937;
                    Fpnative.valueOf = objArr;
                    if (getError() != null || getError().equals(PostCaptureError.RT_QUALITY_FAILED)) {
                        return false;
                    }
                    int i6 = ((int[]) objArr[1])[0];
                    int i7 = i6 * i6;
                    int i8 = -(918101185 * i6);
                    int i9 = (i7 & i8) + (i7 | i8);
                    int i10 = -(i6 * 479376159);
                    int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                    int i12 = ((i11 | (-1383923456)) << 1) - ((-1383923456) ^ i11);
                    int i13 = i12 >> 29;
                    int i14 = ((i13 & (-15)) + (i13 | (-15))) / 8;
                    int i15 = (i12 - (~(((i14 | 1) << 1) - (i14 ^ 1)))) - 1;
                    int i16 = i12 >> 21;
                    int i17 = ((i16 ^ (-4095)) + ((i16 & (-4095)) << 1)) / 2048;
                    int i18 = -(i15 ^ (((i17 | 1) << 1) - (i17 ^ 1)));
                    int i19 = ((i18 | 6) << 1) - (i18 ^ 6);
                    int i20 = ((i19 >> 17) - 65535) / 32768;
                    int i21 = (i20 ^ 1) + ((i20 & 1) << 1);
                    return 204 / (((-((i21 ^ 1) + ((i21 & 1) << 1))) & i19) * 34);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 89, (byte) (-bArr[113]), bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[117]), bArr[25], (byte) (-bArr[4]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -244655984);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4937;
            Fpnative.valueOf = objArr;
            if (getError() != null) {
            }
            return false;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject toJson(long j, long j2) {
        Object[] objArr;
        long j3;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j4 = ((long[]) objArr2[0])[0];
                j3 = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j4 > j3) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((int) Process.getStartUptimeMillis());
                    int c = a.c((~(i | (-335952401))) | (-834841681), 783, ((~((-268576785) | i)) * (-783)) + 1344896510, -2297401);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j3 + 4870;
                    Fpnative.valueOf = objArr;
                    if (LibSettings.isSaveCaptured()) {
                        return new JSONObject();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("asResult", this.asResult.toJson());
                        jSONObject.put("error", this.error);
                        jSONObject.put("isrfQualityPassed", this.isrfQualityPassed);
                        int i4 = ((int[]) objArr[1])[0];
                        int i5 = i4 * i4;
                        int i6 = -(309661873 * i4);
                        int i7 = (((i5 ^ i6) + ((i5 & i6) << 1)) - (~(-(i4 * 300370659)))) - 1;
                        int i8 = (i7 ^ (-456613020)) + (((-456613020) & i7) << 1);
                        int i9 = i8 >> 15;
                        int i10 = (((i9 | (-262143)) << 1) - (i9 ^ (-262143))) / 131072;
                        int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
                        int i12 = ((i8 | i11) << 1) - (i11 ^ i8);
                        int i13 = i8 >> 27;
                        int i14 = (((i13 | (-63)) << 1) - (i13 ^ (-63))) / 32;
                        int i15 = (-((((i14 | 1) << 1) - (i14 ^ 1)) ^ i12)) + 3;
                        int i16 = i15 >> 21;
                        int i17 = ((i16 ^ (-4095)) + ((i16 & (-4095)) << 1)) / 2048;
                        jSONObject.put("16|1|timetaken".substring(26835 / ((i15 & (-(((i17 ^ 1) + ((i17 & 1) << 1)) + 1))) * 1789)), j2);
                        jSONObject.put("ts", j);
                        jSONObject.put("isrtQualityPassed", this.isrtQualityPassed);
                        jSONObject.put("errorenum", getError());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry<Integer, Float> entry : this.rfQuality.entrySet()) {
                            jSONObject2.put(entry.getKey().toString(), entry.getValue());
                        }
                        jSONObject.put("rfQuality", jSONObject2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        for (Map.Entry<Integer, Float> entry2 : this.rtQuality.entrySet()) {
                            jSONObject3.put(entry2.getKey().toString(), entry2.getValue());
                        }
                        jSONObject.put("rtQuality", jSONObject3);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    return jSONObject;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 125, (byte) (-bArr[113]), (byte) (-bArr[34]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) 94, bArr[63], (byte) (-bArr[111]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2297401);
            j3 = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j3 + 4870;
            Fpnative.valueOf = objArr;
            if (LibSettings.isSaveCaptured()) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
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
                    int c = a.c(~(((int) Process.getStartElapsedRealtime()) | (-573705499)), -1504, (((~((-1072865179) | 0)) | 499159680) * 1504) - 1003693777, -727272897);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5038;
                    Fpnative.valueOf = objArr;
                    StringBuilder sb = new StringBuilder("PostCaptureOutPutv1{asResult=");
                    sb.append(this.asResult);
                    sb.append(", error=");
                    sb.append(this.error);
                    sb.append(", isrfQualityPassed=");
                    sb.append(this.isrfQualityPassed);
                    sb.append(", rfQuality=");
                    sb.append(this.rfQuality);
                    sb.append(", rtQuality=");
                    sb.append(this.rtQuality);
                    sb.append(", isrtQualityPassed=");
                    sb.append(this.isrtQualityPassed);
                    sb.append(", binarized=");
                    sb.append(this.binarized);
                    sb.append(", pickedFromCapture=");
                    sb.append(this.pickedFromCapture);
                    sb.append(", timing=");
                    sb.append(this.timing);
                    sb.append(", encodedSegments=");
                    sb.append(this.encodedSegments);
                    sb.append(", rtQualityPass=");
                    sb.append(this.rtQualityPass);
                    sb.append(", framertQualityPass=");
                    sb.append(this.framertQualityPass);
                    sb.append(", capturertQualityPass=");
                    sb.append(this.capturertQualityPass);
                    sb.append(", rfQualityPass=");
                    sb.append(this.rfQualityPass);
                    sb.append(", framerfQualityPass=");
                    sb.append(this.framerfQualityPass);
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(348197206 * i3);
                    int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                    int i7 = -(i3 * (-49802198));
                    int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                    int i9 = (i8 & (-1172336640)) + ((-1172336640) | i8);
                    int i10 = i9 >> 27;
                    int i11 = ((i10 ^ (-63)) + ((i10 & (-63)) << 1)) / 32;
                    int i12 = ((i11 | 1) << 1) - (i11 ^ 1);
                    int i13 = (i9 ^ i12) + ((i12 & i9) << 1);
                    int i14 = i9 >> 19;
                    int i15 = -(IdentyB.a(i14 & (-16383), i14 | (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1) ^ i13);
                    int i16 = (i15 ^ 7) + ((i15 & 7) << 1);
                    int i17 = i16 >> 20;
                    int i18 = ((i17 & (-8191)) + (i17 | (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    sb.append("24\\13\\16\\, capturerfQualityPass=".substring(108549 / (((-((((i18 | 1) << 1) - (1 ^ i18)) - (-1))) & i16) * 1723)));
                    sb.append(this.capturerfQualityPass);
                    sb.append(", imagefromCaptured=");
                    sb.append(this.a);
                    sb.append('}');
                    return sb.toString();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) 89, (byte) (-bArr[113]), bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((byte) (-bArr[117]), bArr[25], (byte) (-bArr[4]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1181993263);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5038;
            Fpnative.valueOf = objArr;
            StringBuilder sb2 = new StringBuilder("PostCaptureOutPutv1{asResult=");
            sb2.append(this.asResult);
            sb2.append(", error=");
            sb2.append(this.error);
            sb2.append(", isrfQualityPassed=");
            sb2.append(this.isrfQualityPassed);
            sb2.append(", rfQuality=");
            sb2.append(this.rfQuality);
            sb2.append(", rtQuality=");
            sb2.append(this.rtQuality);
            sb2.append(", isrtQualityPassed=");
            sb2.append(this.isrtQualityPassed);
            sb2.append(", binarized=");
            sb2.append(this.binarized);
            sb2.append(", pickedFromCapture=");
            sb2.append(this.pickedFromCapture);
            sb2.append(", timing=");
            sb2.append(this.timing);
            sb2.append(", encodedSegments=");
            sb2.append(this.encodedSegments);
            sb2.append(", rtQualityPass=");
            sb2.append(this.rtQualityPass);
            sb2.append(", framertQualityPass=");
            sb2.append(this.framertQualityPass);
            sb2.append(", capturertQualityPass=");
            sb2.append(this.capturertQualityPass);
            sb2.append(", rfQualityPass=");
            sb2.append(this.rfQualityPass);
            sb2.append(", framerfQualityPass=");
            sb2.append(this.framerfQualityPass);
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(348197206 * i32);
            int i62 = (i42 ^ i52) + ((i42 & i52) << 1);
            int i72 = -(i32 * (-49802198));
            int i82 = (i62 ^ i72) + ((i72 & i62) << 1);
            int i92 = (i82 & (-1172336640)) + ((-1172336640) | i82);
            int i102 = i92 >> 27;
            int i112 = ((i102 ^ (-63)) + ((i102 & (-63)) << 1)) / 32;
            int i122 = ((i112 | 1) << 1) - (i112 ^ 1);
            int i132 = (i92 ^ i122) + ((i122 & i92) << 1);
            int i142 = i92 >> 19;
            int i152 = -(IdentyB.a(i142 & (-16383), i142 | (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1) ^ i132);
            int i162 = (i152 ^ 7) + ((i152 & 7) << 1);
            int i172 = i162 >> 20;
            int i182 = ((i172 & (-8191)) + (i172 | (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            sb2.append("24\\13\\16\\, capturerfQualityPass=".substring(108549 / (((-((((i182 | 1) << 1) - (1 ^ i182)) - (-1))) & i162) * 1723)));
            sb2.append(this.capturerfQualityPass);
            sb2.append(", imagefromCaptured=");
            sb2.append(this.a);
            sb2.append('}');
            return sb2.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void updateMetaTrack(PngjOutputException pngjOutputException) {
        Object[] objArr;
        long j;
        Map<Integer, Float> map;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~((-12354625) | identityHashCode);
                    int c = a.c((~(identityHashCode | (-272777528))) | (~((~identityHashCode) | (-213757129))) | 201402504, 497, ((i | (~(0 | (-272777528)))) * 497) - 790665680, 355881587);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4851;
                    Fpnative.valueOf = objArr;
                    map = this.rtQuality;
                    if (map != null) {
                        for (Map.Entry<Integer, Float> entry : map.entrySet()) {
                            Pair<Hand, Finger> pair = Position.getFromOrdinal(entry.getKey().intValue()).getPair();
                            float floatValue = entry.getValue().floatValue();
                            int i4 = ((int[]) objArr[1])[0];
                            int i5 = i4 * i4;
                            int i6 = -(367620627 * i4);
                            int i7 = (((i5 ^ i6) + ((i5 & i6) << 1)) - (~(-(i4 * 939233517)))) - 1;
                            int i8 = (i7 ^ 394412032) + ((394412032 & i7) << 1);
                            int i9 = i8 >> 25;
                            int i10 = ((i9 & (-255)) + (i9 | (-255))) / 128;
                            int i11 = (i10 ^ 1) + ((i10 & 1) << 1);
                            int i12 = (i8 ^ i11) + ((i11 & i8) << 1);
                            int i13 = i8 >> 18;
                            int i14 = (((i13 | (-32767)) << 1) - (i13 ^ (-32767))) / 16384;
                            int i15 = ((-(((i14 & 1) + (i14 | 1)) ^ i12)) + 6) >> 19;
                            int i16 = (((i15 | (-16383)) << 1) - (i15 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                            int i17 = (i16 ^ 1) + ((i16 & 1) << 1);
                            pngjOutputException.PngjExceptionInternal.put(pair, Integer.valueOf((int) (((99396 / ((0 & (-(((i17 | 1) << 1) - (i17 ^ 1)))) * 502)) + 67.0f) * floatValue)));
                        }
                    }
                    if (this.isrtQualityPassed) {
                        return;
                    }
                    for (Map.Entry<Integer, Float> entry2 : this.rfQuality.entrySet()) {
                        pngjOutputException.values.put(Position.getFromOrdinal(entry2.getKey().intValue()).getPair(), Integer.valueOf(entry2.getValue().intValue()));
                    }
                    ASResult aSResult = this.asResult;
                    if (aSResult != null) {
                        float f = aSResult.spoofScore;
                        pngjOutputException.getCaptureTime = true;
                        pngjOutputException.PngjPrematureEnding = f;
                        pngjOutputException.Attempt = aSResult.l2Pass;
                        pngjOutputException.isQualityFailed = aSResult.l3Pass;
                        int i18 = aSResult.seqFrames;
                        int i19 = (int) (i18 * aSResult.seqFramesPassedRatio);
                        pngjOutputException.getData = i18;
                        pngjOutputException.getOveralTimetaken = i19;
                        pngjOutputException.PngjOutputException = aSResult.l1P;
                        pngjOutputException.a = aSResult.l1R;
                        pngjOutputException.e1 = aSResult.l1S;
                        float f2 = aSResult.l7P;
                        pngjOutputException.Action = f2;
                        pngjOutputException.PngBadCharsetException = f2;
                        pngjOutputException.onErrorResponse = f2;
                        float f3 = aSResult.l3P;
                        pngjOutputException.getPadSub3 = f3;
                        pngjOutputException.getAsHighestSecurityLevelReached = f3;
                        pngjOutputException.getPadSub2 = f3;
                        pngjOutputException.getPadSub1 = !aSResult.isAsPass();
                        pngjOutputException.Attempt = aSResult.l2Pass;
                        pngjOutputException.isQualityFailed = aSResult.l3Pass;
                        pngjOutputException.getScore = aSResult.lAPass;
                        pngjOutputException.getQualityScore = aSResult.lSeqPass;
                        return;
                    }
                    return;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (bArr[20] + 1), (byte) (-bArr[113]), (byte) (-bArr[29]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[63], bArr[25], (byte) (bArr[20] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 355881587);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4851;
            Fpnative.valueOf = objArr;
            map = this.rtQuality;
            if (map != null) {
            }
            if (this.isrtQualityPassed) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(2:3|(13:5|6|7|8|10|11|13|14|16|17|(3:19|(2:22|20)|23)|24|25))|37|38|39|6|7|8|10|11|13|14|16|17|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f3, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01fb, code lost:
    
        0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c4, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01c5, code lost:
    
        0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0188, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0189, code lost:
    
        0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0178, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0179, code lost:
    
        0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d1 A[Catch: Exception -> 0x01f3, TryCatch #3 {Exception -> 0x01f3, blocks: (B:17:0x01c8, B:19:0x01d1, B:20:0x01d9, B:22:0x01df, B:24:0x01f5), top: B:16:0x01c8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject toJson() {
        Object[] objArr;
        long j;
        Map<String, Long> map;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = a.c(identityHashCode | (-1054849989), 54, (((~((~identityHashCode) | 1012669188)) | (~((-1012669189) | identityHashCode)) | (-1054849989)) * 54) + ((((~((-513779909) | 0)) | 471599108) * (-108)) - 997894093), -2022839525);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5046;
                    Fpnative.valueOf = objArr;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("asResult", this.asResult.toJson());
                    jSONObject.put("error", this.error);
                    jSONObject.put("isrfQualityPassed", this.isrfQualityPassed);
                    jSONObject.put("isrtQualityPassed", this.isrtQualityPassed);
                    jSONObject.put("framertQualityPass", this.framertQualityPass);
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = ((i3 * i3) - (~(-(88781272 * i3)))) - 1;
                    int i5 = -(i3 * 2014159068);
                    int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                    int i7 = (i6 & 798880676) + (798880676 | i6);
                    int i8 = i7 >> 23;
                    int i9 = i8 | (-1023);
                    int i10 = (((i8 & (-1023)) + i9) / ConstantsKt.MINIMUM_BLOCK_SIZE) + 1;
                    int i11 = (i7 ^ i10) + ((i7 & i10) << 1);
                    int i12 = ((i9 << 1) - (i8 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i13 = -(((i12 & 1) + (i12 | 1)) ^ i11);
                    int i14 = (i13 & 4) + (i13 | 4);
                    int i15 = i14 >> 20;
                    int i16 = (((i15 ^ (-8191)) + ((i15 & (-8191)) << 1)) / ConstantsKt.DEFAULT_BLOCK_SIZE) + 1;
                    jSONObject.put("8,15,20,capturertQualityPass".substring(1376 / (((-((i16 & 1) + (1 | i16))) & i14) * 43)), this.capturertQualityPass);
                    jSONObject.put("framerfQualityPass", this.framerfQualityPass);
                    jSONObject.put("capturerfQualityPass", this.capturerfQualityPass);
                    jSONObject.put("rfQuality", fillQuality(this.rfQuality));
                    jSONObject.put("rtQuality", fillQuality(this.rtQuality));
                    jSONObject.put("capturerfQuality", fillQuality(this.capturerfQuality));
                    jSONObject.put("capturertQuality", fillQuality(this.capturertQuality));
                    jSONObject.put("framerfQuality", fillQuality(this.framerfQuality));
                    jSONObject.put("framertQuality", fillQuality(this.framertQuality));
                    JSONObject jSONObject2 = new JSONObject();
                    map = this.timing;
                    if (map != null) {
                        for (Map.Entry<String, Long> entry : map.entrySet()) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("timing", jSONObject2);
                    return jSONObject;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (bArr[20] + 1), (byte) (-bArr[113]), (byte) (-bArr[29]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[63], bArr[25], (byte) (bArr[20] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2022839525);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5046;
            Fpnative.valueOf = objArr;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("asResult", this.asResult.toJson());
            jSONObject3.put("error", this.error);
            jSONObject3.put("isrfQualityPassed", this.isrfQualityPassed);
            jSONObject3.put("isrtQualityPassed", this.isrtQualityPassed);
            jSONObject3.put("framertQualityPass", this.framertQualityPass);
            int i32 = ((int[]) objArr[1])[0];
            int i42 = ((i32 * i32) - (~(-(88781272 * i32)))) - 1;
            int i52 = -(i32 * 2014159068);
            int i62 = ((i42 | i52) << 1) - (i52 ^ i42);
            int i72 = (i62 & 798880676) + (798880676 | i62);
            int i82 = i72 >> 23;
            int i92 = i82 | (-1023);
            int i102 = (((i82 & (-1023)) + i92) / ConstantsKt.MINIMUM_BLOCK_SIZE) + 1;
            int i112 = (i72 ^ i102) + ((i72 & i102) << 1);
            int i122 = ((i92 << 1) - (i82 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i132 = -(((i122 & 1) + (i122 | 1)) ^ i112);
            int i142 = (i132 & 4) + (i132 | 4);
            int i152 = i142 >> 20;
            int i162 = (((i152 ^ (-8191)) + ((i152 & (-8191)) << 1)) / ConstantsKt.DEFAULT_BLOCK_SIZE) + 1;
            jSONObject3.put("8,15,20,capturertQualityPass".substring(1376 / (((-((i162 & 1) + (1 | i162))) & i142) * 43)), this.capturertQualityPass);
            jSONObject3.put("framerfQualityPass", this.framerfQualityPass);
            jSONObject3.put("capturerfQualityPass", this.capturerfQualityPass);
            jSONObject3.put("rfQuality", fillQuality(this.rfQuality));
            jSONObject3.put("rtQuality", fillQuality(this.rtQuality));
            jSONObject3.put("capturerfQuality", fillQuality(this.capturerfQuality));
            jSONObject3.put("capturertQuality", fillQuality(this.capturertQuality));
            jSONObject3.put("framerfQuality", fillQuality(this.framerfQuality));
            jSONObject3.put("framertQuality", fillQuality(this.framertQuality));
            JSONObject jSONObject22 = new JSONObject();
            map = this.timing;
            if (map != null) {
            }
            jSONObject3.put("timing", jSONObject22);
            return jSONObject3;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
