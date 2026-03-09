package com.identy.app.s3;

import com.d.e.a.values;
import com.identy.Action;
import com.identy.FingerAS;
import com.identy.Fpnative;
import com.identy.enums.FingerMatchSecLevel;
import defpackage.a;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.io.ConstantsKt;
import org.cameracontroller.PngjBadSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ActionS3Meta {
    private static final byte[] $$a = {14, 12, 119, -3, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0};
    private static final int $$b = 11;
    boolean a;
    Action b;
    String c;
    int d;
    int e;
    int f;
    int g;
    String h;
    FingerAS i;
    int j;
    int k;
    FingerMatchSecLevel l;
    List m;
    PngjBadSignature.PngjExceptionInternal n;
    boolean o;

    public ActionS3Meta(Action action, String str, int i, int i2, int i3, int i4, String str2, FingerAS fingerAS, List<PngjBadSignature.PngjExceptionInternal> list, PngjBadSignature.PngjExceptionInternal pngjExceptionInternal, FingerMatchSecLevel fingerMatchSecLevel, int i5, int i6, boolean z, boolean z2) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[]{0 ^ (0 << 5)}};
                    int c = a.c((~((~i) | 595891346)) | 570725504, 374, ((25165842 | 0) * (-374)) - 1676961397, 988157494);
                    int i7 = c ^ (c << 13);
                    int i8 = i7 ^ (i7 >>> 17);
                    ((long[]) objArr[0])[0] = j + 4879;
                    Fpnative.valueOf = objArr;
                    this.b = action;
                    this.c = str;
                    this.d = i;
                    this.e = i2;
                    this.f = i3;
                    this.g = i4;
                    this.h = str2;
                    this.i = fingerAS;
                    this.m = list;
                    this.n = pngjExceptionInternal;
                    this.j = i5;
                    this.k = i6;
                    this.o = z;
                    this.a = z2;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[27];
            Object[] objArr3 = new Object[1];
            p(b, b, bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            p((byte) (-bArr[4]), (byte) (-bArr[77]), (byte) (-bArr[88]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 988157494);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4879;
            Fpnative.valueOf = objArr;
            this.b = action;
            this.c = str;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = str2;
            this.i = fingerAS;
            this.m = list;
            this.n = pngjExceptionInternal;
            this.j = i5;
            this.k = i6;
            this.o = z;
            this.a = z2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    private static void p(byte b, short s, byte b2, Object[] objArr) {
        int i = b2 + 4;
        int i2 = 99 - (s * 19);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[44 - b];
        int i3 = 43 - b;
        int i4 = -1;
        if (bArr == null) {
            i2 = (i3 + (-i)) - 13;
            i = i;
            bArr = bArr;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte[] bArr3 = bArr;
            i2 = (i2 + (-bArr[i6])) - 13;
            i = i6;
            bArr = bArr3;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x018e A[Catch: Exception -> 0x01b1, TRY_ENTER, TryCatch #2 {Exception -> 0x01b1, blocks: (B:8:0x00dd, B:10:0x00e4, B:12:0x00eb, B:14:0x00f2, B:16:0x00f9, B:18:0x0100, B:20:0x016e, B:22:0x0175, B:24:0x017c, B:27:0x018e, B:28:0x0192, B:30:0x0198, B:32:0x01b3, B:34:0x01b7, B:35:0x01cf), top: B:7:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b7 A[Catch: Exception -> 0x01b1, TryCatch #2 {Exception -> 0x01b1, blocks: (B:8:0x00dd, B:10:0x00e4, B:12:0x00eb, B:14:0x00f2, B:16:0x00f9, B:18:0x0100, B:20:0x016e, B:22:0x0175, B:24:0x017c, B:27:0x018e, B:28:0x0192, B:30:0x0198, B:32:0x01b3, B:34:0x01b7, B:35:0x01cf), top: B:7:0x00dd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject toJson() {
        Object[] objArr;
        long j;
        JSONObject jSONObject;
        List<PngjBadSignature.PngjExceptionInternal> list;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int identityHashCode = System.identityHashCode(this);
                        int i = ~identityHashCode;
                        int c = a.c(identityHashCode | (-780009471), 54, (((~(i | 708177726)) | (~((-708177727) | identityHashCode)) | (-780009471)) * 54) + (((~((-209288447) | i)) | 137456702) * (-108)) + 1214096615, 814830826);
                        int i2 = c ^ (c << 13);
                        int i3 = i2 ^ (i2 >>> 17);
                        ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                        ((long[]) objArr[0])[0] = j + 5004;
                        Fpnative.valueOf = objArr;
                        jSONObject = new JSONObject();
                        jSONObject.put("transactionID", this.h);
                        jSONObject.put("initTime", this.d);
                        jSONObject.put("rolled", this.a);
                        jSONObject.put("t1", this.e);
                        jSONObject.put("t2", this.f);
                        jSONObject.put("t3", this.g);
                        int i4 = ((int[]) objArr[1])[0];
                        int i5 = ((((i4 * i4) - (~(-(1016286615 * i4)))) - 1) - (~(-(i4 * 182639139)))) - (-1953008840);
                        int i6 = i5 >> 19;
                        int i7 = ((i6 ^ (-16383)) + ((i6 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                        int i8 = (i5 - (~((i7 ^ 1) + ((i7 & 1) << 1)))) - 1;
                        int i9 = ((i5 >> 21) - 4095) / 2048;
                        int i10 = -(i8 ^ ((i9 ^ 1) + ((i9 & 1) << 1)));
                        int i11 = ((i10 | 8) << 1) - (i10 ^ 8);
                        int i12 = i11 >> 28;
                        int i13 = ((i12 ^ (-31)) + ((i12 & (-31)) << 1)) / 16;
                        int i14 = (i13 ^ 1) + ((i13 & 1) << 1);
                        jSONObject.put("26;6;asLevel".substring(79760 / (((-((i14 & 1) + (i14 | 1))) & i11) * 1994)), this.i);
                        jSONObject.put("matchLevel", this.l);
                        jSONObject.put("noAttempt", this.j);
                        jSONObject.put("attemptTimelimit", this.k);
                        JSONArray jSONArray = new JSONArray();
                        list = this.m;
                        if (list != null) {
                            for (PngjBadSignature.PngjExceptionInternal pngjExceptionInternal : list) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("width", pngjExceptionInternal.values);
                                jSONObject2.put("height", pngjExceptionInternal.PngjBadCrcException);
                                jSONArray.put(jSONObject2);
                            }
                        }
                        if (this.n != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("width", this.n.values);
                            jSONObject3.put("height", this.n.PngjBadCrcException);
                            jSONObject.put("currentPreviewSize", jSONObject3);
                        }
                        jSONObject.put("supportedpreview", jSONArray);
                        return jSONObject;
                    }
                }
                jSONObject.put("transactionID", this.h);
                jSONObject.put("initTime", this.d);
                jSONObject.put("rolled", this.a);
                jSONObject.put("t1", this.e);
                jSONObject.put("t2", this.f);
                jSONObject.put("t3", this.g);
                int i42 = ((int[]) objArr[1])[0];
                int i52 = ((((i42 * i42) - (~(-(1016286615 * i42)))) - 1) - (~(-(i42 * 182639139)))) - (-1953008840);
                int i62 = i52 >> 19;
                int i72 = ((i62 ^ (-16383)) + ((i62 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                int i82 = (i52 - (~((i72 ^ 1) + ((i72 & 1) << 1)))) - 1;
                int i92 = ((i52 >> 21) - 4095) / 2048;
                int i102 = -(i82 ^ ((i92 ^ 1) + ((i92 & 1) << 1)));
                int i112 = ((i102 | 8) << 1) - (i102 ^ 8);
                int i122 = i112 >> 28;
                int i132 = ((i122 ^ (-31)) + ((i122 & (-31)) << 1)) / 16;
                int i142 = (i132 ^ 1) + ((i132 & 1) << 1);
                jSONObject.put("26;6;asLevel".substring(79760 / (((-((i142 & 1) + (i142 | 1))) & i112) * 1994)), this.i);
                jSONObject.put("matchLevel", this.l);
                jSONObject.put("noAttempt", this.j);
                jSONObject.put("attemptTimelimit", this.k);
                JSONArray jSONArray2 = new JSONArray();
                list = this.m;
                if (list != null) {
                }
                if (this.n != null) {
                }
                jSONObject.put("supportedpreview", jSONArray2);
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
