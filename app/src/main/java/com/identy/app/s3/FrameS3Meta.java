package com.identy.app.s3;

import android.os.Process;
import android.os.SystemClock;
import com.d.e.a.values;
import com.identy.Action;
import com.identy.Fpnative;
import com.identy.ex.PreCaptureOutput;
import defpackage.a;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FrameS3Meta {
    private static final byte[] $$a = {5, -70, 93, -40, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12};
    private static final int $$b = 184;
    String a;
    String b;
    String c;
    PreCaptureOutput d;
    Action e;
    String f;
    int g;
    int h;
    int i;
    int j;
    String k;
    FrameTiming l;

    public FrameS3Meta(String str, String str2, String str3, PreCaptureOutput preCaptureOutput, Action action, String str4, int i, int i2, int i3, int i4, String str5, FrameTiming frameTiming) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int c = a.c((~(elapsedRealtime | (-429419532))) | (~((~elapsedRealtime) | (-69403061))), 210, (((~((-429452876) | 0)) | (~((-69436405) | elapsedRealtime))) * 210) - 1181641967, -2068133335);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4900;
                    Fpnative.valueOf = objArr;
                    this.a = str;
                    this.b = str2;
                    this.c = str3;
                    this.d = preCaptureOutput;
                    this.e = action;
                    this.f = str4;
                    this.g = i;
                    this.h = i2;
                    this.i = i3;
                    this.j = i4;
                    this.l = frameTiming;
                    this.k = str5;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            m((byte) (bArr[32] - 1), bArr[34], (byte) (bArr[63] - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[32];
            Object[] objArr4 = new Object[1];
            m(b, (byte) (b | 36), bArr[60], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2068133335);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4900;
            Fpnative.valueOf = objArr;
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = preCaptureOutput;
            this.e = action;
            this.f = str4;
            this.g = i;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.l = frameTiming;
            this.k = str5;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m(short s, int i, short s2, Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = s2 + 4;
        byte[] bArr = $$a;
        int i6 = (s * 19) + 80;
        byte[] bArr2 = new byte[44 - i];
        int i7 = 43 - i;
        int i8 = -1;
        if (bArr == null) {
            int i9 = -1;
            byte[] bArr3 = bArr;
            int i10 = i5;
            int i11 = (i10 + i6) - 13;
            int i12 = i5;
            i2 = i11;
            i3 = i12;
            bArr = bArr3;
            i8 = i9;
            i4 = i8 + 1;
            int i13 = i3 + 1;
            bArr2[i4] = (byte) i2;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i14 = i2;
            i5 = i13;
            i6 = bArr[i13];
            i9 = i4;
            bArr3 = bArr;
            i10 = i14;
            int i112 = (i10 + i6) - 13;
            int i122 = i5;
            i2 = i112;
            i3 = i122;
            bArr = bArr3;
            i8 = i9;
            i4 = i8 + 1;
            int i132 = i3 + 1;
            bArr2[i4] = (byte) i2;
            if (i4 == i7) {
            }
        } else {
            i2 = i6;
            i3 = i5;
            i4 = i8 + 1;
            int i1322 = i3 + 1;
            bArr2[i4] = (byte) i2;
            if (i4 == i7) {
            }
        }
    }

    public JSONObject toJson() {
        Object[] objArr;
        long j;
        JSONObject jSONObject;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int i = ~startElapsedRealtime;
                        int c = a.c((~(startElapsedRealtime | (-280051744))) | (~(313639007 | i)) | 151663008, 140, (((~(185250272 | i)) | 280051743) * (-280)) + ((startElapsedRealtime | 185250272) * 140) + 1128208691, -496217158);
                        int i2 = c ^ (c << 13);
                        int i3 = i2 ^ (i2 >>> 17);
                        ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                        ((long[]) objArr[0])[0] = j + 4917;
                        Fpnative.valueOf = objArr;
                        jSONObject = new JSONObject();
                        jSONObject.put("metadata_by_user_key", this.a);
                        jSONObject.put("metadata_by_mobile_device_key", this.b);
                        jSONObject.put("metadata_by_algorithm", this.d.toJson());
                        jSONObject.put("metadata_by_attack", this.f);
                        jSONObject.put("metadata_by_sdk", this.c);
                        jSONObject.put("transactionID", this.k);
                        jSONObject.put("initTime", this.g);
                        int i4 = ((int[]) objArr[1])[0];
                        int i5 = i4 * i4;
                        int i6 = -(2107993740 * i4);
                        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                        int i8 = -(i4 * (-1758441128));
                        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                        int i10 = (i9 ^ 542081220) + ((542081220 & i9) << 1);
                        int i11 = i10 >> 21;
                        int i12 = ((i11 ^ (-4095)) + ((i11 & (-4095)) << 1)) / 2048;
                        int i13 = ((i12 | 1) << 1) - (i12 ^ 1);
                        int i14 = (i10 ^ i13) + ((i13 & i10) << 1);
                        int i15 = i10 >> 18;
                        int i16 = (((i15 | (-32767)) << 1) - (i15 ^ (-32767))) / 16384;
                        int i17 = -(((i16 ^ 1) + ((i16 & 1) << 1)) ^ i14);
                        int i18 = (i17 & 9) + (i17 | 9);
                        int i19 = i18 >> 26;
                        int i20 = ((i19 ^ (-127)) + ((i19 & (-127)) << 1)) / 64;
                        jSONObject.put("13,20,16,4,t1".substring(160083 / (((-((((i20 | 1) << 1) - (1 ^ i20)) + 1)) & i18) * 1617)), this.h);
                        jSONObject.put("t2", this.i);
                        jSONObject.put("t3", this.j);
                        jSONObject.put("timing", this.l.a());
                        this.l.clear();
                        return jSONObject;
                    }
                }
                jSONObject.put("metadata_by_user_key", this.a);
                jSONObject.put("metadata_by_mobile_device_key", this.b);
                jSONObject.put("metadata_by_algorithm", this.d.toJson());
                jSONObject.put("metadata_by_attack", this.f);
                jSONObject.put("metadata_by_sdk", this.c);
                jSONObject.put("transactionID", this.k);
                jSONObject.put("initTime", this.g);
                int i42 = ((int[]) objArr[1])[0];
                int i52 = i42 * i42;
                int i62 = -(2107993740 * i42);
                int i72 = (i52 ^ i62) + ((i52 & i62) << 1);
                int i82 = -(i42 * (-1758441128));
                int i92 = ((i72 | i82) << 1) - (i82 ^ i72);
                int i102 = (i92 ^ 542081220) + ((542081220 & i92) << 1);
                int i112 = i102 >> 21;
                int i122 = ((i112 ^ (-4095)) + ((i112 & (-4095)) << 1)) / 2048;
                int i132 = ((i122 | 1) << 1) - (i122 ^ 1);
                int i142 = (i102 ^ i132) + ((i132 & i102) << 1);
                int i152 = i102 >> 18;
                int i162 = (((i152 | (-32767)) << 1) - (i152 ^ (-32767))) / 16384;
                int i172 = -(((i162 ^ 1) + ((i162 & 1) << 1)) ^ i142);
                int i182 = (i172 & 9) + (i172 | 9);
                int i192 = i182 >> 26;
                int i202 = ((i192 ^ (-127)) + ((i192 & (-127)) << 1)) / 64;
                jSONObject.put("13,20,16,4,t1".substring(160083 / (((-((((i202 | 1) << 1) - (1 ^ i202)) + 1)) & i182) * 1617)), this.h);
                jSONObject.put("t2", this.i);
                jSONObject.put("t3", this.j);
                jSONObject.put("timing", this.l.a());
                this.l.clear();
                return jSONObject;
            } catch (Exception e) {
                try {
                    jSONObject.put("exception", e.getStackTrace().toString());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
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
}
