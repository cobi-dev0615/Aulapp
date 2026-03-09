package com.identy.app.s3;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Action;
import com.identy.Fpnative;
import com.identy.ex.PostCaptureOutPut;
import defpackage.a;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Captures3Meta {
    private static final byte[] $$a = {126, 106, 85, 73, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
    private static final int $$b = 178;
    String a;
    String b;
    String c;
    PostCaptureInput d;
    PostCaptureOutPut e;
    Action f;
    String g;
    String h;
    CaptureTiming i;
    JSONArray j;

    public Captures3Meta(String str, String str2, String str3, PostCaptureInput postCaptureInput, PostCaptureOutPut postCaptureOutPut, Action action, String str4, String str5, CaptureTiming captureTiming, JSONArray jSONArray) {
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
                    int c = defpackage.a.c((~(elapsedCpuTime | 788398050)) | (~((~elapsedCpuTime) | (-750349795))) | 213412258, 168, ((~((-536937537) | elapsedCpuTime)) * 168) + ((((~(251460514 | 0)) | 536937536) * 168) - 1710130969), 2043399137);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4971;
                    Fpnative.valueOf = objArr;
                    this.a = str;
                    this.b = str2;
                    this.c = str3;
                    this.d = postCaptureInput;
                    this.e = postCaptureOutPut;
                    this.f = action;
                    this.g = str4;
                    this.h = str5;
                    this.i = captureTiming;
                    this.j = jSONArray;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[27];
            Object[] objArr3 = new Object[1];
            k((byte) 28, b, (byte) (b | 89), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            k((byte) (bArr[25] + 1), bArr[77], bArr[81], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2043399137);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4971;
            Fpnative.valueOf = objArr;
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = postCaptureInput;
            this.e = postCaptureOutPut;
            this.f = action;
            this.g = str4;
            this.h = str5;
            this.i = captureTiming;
            this.j = jSONArray;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void k(short s, short s2, byte b, Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = 99 - (s2 * 19);
        int i3 = 93 - b;
        int i4 = s + 16;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i2 = (i2 + i5) - 13;
            i3++;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = bArr[i3];
            i2 = (i2 + i5) - 13;
            i3++;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i4) {
            }
        }
    }

    public JSONObject toJson() {
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
                        int c = defpackage.a.c(~(System.identityHashCode(this) | (-136858633)), -1504, (((~((-136990281) | 0)) | 131648) * 1504) - 1003693777, -2129266090);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 5013;
                        Fpnative.valueOf = objArr;
                        jSONObject = new JSONObject();
                        jSONObject.put("metadata_by_user_key", this.a);
                        jSONObject.put("metadata_by_mobile_device_key", this.b);
                        jSONObject.put("metadata_by_algorithm", this.e.toJson());
                        int i3 = ((int[]) objArr[1])[0];
                        int i4 = ((i3 * i3) - (~(-(794166186 * i3)))) - 1;
                        int i5 = -(i3 * (-1987320192));
                        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                        int i7 = (i6 ^ 1963013049) + ((1963013049 & i6) << 1);
                        int i8 = ((i7 >> 25) - 255) / 128;
                        int i9 = (i8 & 1) + (i8 | 1);
                        int i10 = (i7 ^ i9) + ((i9 & i7) << 1);
                        int i11 = i7 >> 20;
                        int i12 = (-(i10 ^ ((((i11 ^ (-8191)) + ((i11 & (-8191)) << 1)) / ConstantsKt.DEFAULT_BLOCK_SIZE) + 1))) + 6;
                        int i13 = i12 >> 17;
                        int i14 = ((i13 & (-65535)) + (i13 | (-65535))) / 32768;
                        jSONObject.put("9/12/2/19/metadata_by_sdk".substring(117840 / ((i12 & (-(((i14 ^ 1) + ((i14 & 1) << 1)) + 1))) * 1964)), this.c);
                        jSONObject.put("input", this.d.toJson());
                        jSONObject.put("action", this.f.toString());
                        jSONObject.put("metadata_by_attack", this.g);
                        jSONObject.put("transactionID", this.h);
                        jSONObject.put("timing", this.i.a());
                        jSONObject.put("preCaptureMeta", this.j);
                        this.i.clear();
                        return jSONObject;
                    }
                }
                jSONObject.put("metadata_by_user_key", this.a);
                jSONObject.put("metadata_by_mobile_device_key", this.b);
                jSONObject.put("metadata_by_algorithm", this.e.toJson());
                int i32 = ((int[]) objArr[1])[0];
                int i42 = ((i32 * i32) - (~(-(794166186 * i32)))) - 1;
                int i52 = -(i32 * (-1987320192));
                int i62 = ((i42 | i52) << 1) - (i52 ^ i42);
                int i72 = (i62 ^ 1963013049) + ((1963013049 & i62) << 1);
                int i82 = ((i72 >> 25) - 255) / 128;
                int i92 = (i82 & 1) + (i82 | 1);
                int i102 = (i72 ^ i92) + ((i92 & i72) << 1);
                int i112 = i72 >> 20;
                int i122 = (-(i102 ^ ((((i112 ^ (-8191)) + ((i112 & (-8191)) << 1)) / ConstantsKt.DEFAULT_BLOCK_SIZE) + 1))) + 6;
                int i132 = i122 >> 17;
                int i142 = ((i132 & (-65535)) + (i132 | (-65535))) / 32768;
                jSONObject.put("9/12/2/19/metadata_by_sdk".substring(117840 / ((i122 & (-(((i142 ^ 1) + ((i142 & 1) << 1)) + 1))) * 1964)), this.c);
                jSONObject.put("input", this.d.toJson());
                jSONObject.put("action", this.f.toString());
                jSONObject.put("metadata_by_attack", this.g);
                jSONObject.put("transactionID", this.h);
                jSONObject.put("timing", this.i.a());
                jSONObject.put("preCaptureMeta", this.j);
                this.i.clear();
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
