package com.identy.app.s3;

import android.os.Process;
import android.util.Base64;
import com.d.e.a.values;
import com.identy.Action;
import com.identy.Fpnative;
import defpackage.a;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class RollS3Meta {
    private static final byte[] $$a = {22, -87, -1, -67, -20, -6, 55, -67, -3, -9, -17, -14, -13, 67, -33, -54, 4, -3, -9, 15, -41, 32, -54, 4, -3, -9, 21, -37, -15, -12, 3, -21, -38, -1, -11, 32, -39, -11, 9, -30, -6, -15, 5, -27, -9, -5, 5, -20, -6, 55, -67, -3, -9, -17, -14, -13, 67, -65, 49, -42, -38, -1, -11, 32, -39, -11, 25, -55, 7, 22, -59, 13, -10, -19, -12, 3, -14, -7, 13, -19, -17, 8, -22};
    private static final int $$b = 210;
    String a;
    String b;
    String c;
    byte[] d;
    Action e;
    String f;
    int g;
    int h;
    int i;
    int j;
    String k;
    FrameTiming l;

    public RollS3Meta(String str, String str2, String str3, byte[] bArr, Action action, String str4, int i, int i2, int i3, int i4, String str5, FrameTiming frameTiming) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myPid = Process.myPid();
                    int i5 = ~myPid;
                    int c = defpackage.a.c((~(myPid | (-171827975))) | (-327061306) | (~(i5 | 171827974)), 45, (((~((-327061306) | myPid)) | (-461369152)) * (-45)) + (((~((-327061306) | i5)) | 171827974) * (-90)) + 1474070354, -1812854176);
                    int i6 = c ^ (c << 13);
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                    ((long[]) objArr[0])[0] = j + 4899;
                    Fpnative.valueOf = objArr;
                    this.a = str;
                    this.b = str2;
                    this.c = str3;
                    this.d = bArr;
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
            byte b = $$a[2];
            Object[] objArr3 = new Object[1];
            m((byte) (b + 1), $$a[30], (byte) (-b), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = (byte) 28;
            Object[] objArr4 = new Object[1];
            m(b2, (byte) (b2 & 112), (byte) ($$b & 15), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1812854176);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4899;
            Fpnative.valueOf = objArr;
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = bArr;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m(byte b, int i, byte b2, Object[] objArr) {
        int i2;
        int i3 = 118 - (b2 * 19);
        int i4 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[32 - i];
        int i5 = 31 - i;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4++;
            i3 = (i3 + (-i6)) - 8;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i4++;
            i3 = (i3 + (-i6)) - 8;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
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
                        int c = defpackage.a.c((~(System.identityHashCode(this) | 771521474)) | 272632194, 529, (((~((~0) | 771521474)) | 268435456) * 529) - 1876653424, 335340166);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4969;
                        Fpnative.valueOf = objArr;
                        jSONObject = new JSONObject();
                        jSONObject.put("metadata_by_user_key", this.a);
                        jSONObject.put("metadata_by_mobile_device_key", this.b);
                        jSONObject.put("metadata_by_algorithm", Base64.encodeToString(this.d, 0));
                        jSONObject.put("metadata_by_attack", this.f);
                        jSONObject.put("metadata_by_sdk", this.c);
                        jSONObject.put("transactionID", this.k);
                        int i3 = ((int[]) objArr[1])[0];
                        int i4 = ((i3 * i3) - (~(-(528650810 * i3)))) - 1;
                        int i5 = -(i3 * (-558164560));
                        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                        int i7 = ((i6 | 1927923833) << 1) - (1927923833 ^ i6);
                        int i8 = i7 >> 27;
                        int i9 = (((i8 | (-63)) << 1) - (i8 ^ (-63))) / 32;
                        int i10 = (i9 ^ 1) + ((i9 & 1) << 1);
                        int i11 = ((i7 | i10) << 1) - (i10 ^ i7);
                        int i12 = i7 >> 25;
                        int i13 = -(i11 ^ (((((i12 | (-255)) << 1) - (i12 ^ (-255))) / 128) + 1));
                        int i14 = ((i13 | 2) << 1) - (i13 ^ 2);
                        int i15 = i14 >> 15;
                        int i16 = ((i15 ^ (-262143)) + ((i15 & (-262143)) << 1)) / 131072;
                        int i17 = ((i16 | 1) << 1) - (i16 ^ 1);
                        jSONObject.put("14\\24\\initTime".substring(17328 / (((-((i17 & 1) + (i17 | 1))) & i14) * 1444)), this.g);
                        jSONObject.put("t1", this.h);
                        jSONObject.put("t2", this.i);
                        jSONObject.put("t3", this.j);
                        jSONObject.put("timing", this.l.a());
                        this.l.clear();
                        return jSONObject;
                    }
                }
                jSONObject.put("metadata_by_user_key", this.a);
                jSONObject.put("metadata_by_mobile_device_key", this.b);
                jSONObject.put("metadata_by_algorithm", Base64.encodeToString(this.d, 0));
                jSONObject.put("metadata_by_attack", this.f);
                jSONObject.put("metadata_by_sdk", this.c);
                jSONObject.put("transactionID", this.k);
                int i32 = ((int[]) objArr[1])[0];
                int i42 = ((i32 * i32) - (~(-(528650810 * i32)))) - 1;
                int i52 = -(i32 * (-558164560));
                int i62 = ((i42 | i52) << 1) - (i52 ^ i42);
                int i72 = ((i62 | 1927923833) << 1) - (1927923833 ^ i62);
                int i82 = i72 >> 27;
                int i92 = (((i82 | (-63)) << 1) - (i82 ^ (-63))) / 32;
                int i102 = (i92 ^ 1) + ((i92 & 1) << 1);
                int i112 = ((i72 | i102) << 1) - (i102 ^ i72);
                int i122 = i72 >> 25;
                int i132 = -(i112 ^ (((((i122 | (-255)) << 1) - (i122 ^ (-255))) / 128) + 1));
                int i142 = ((i132 | 2) << 1) - (i132 ^ 2);
                int i152 = i142 >> 15;
                int i162 = ((i152 ^ (-262143)) + ((i152 & (-262143)) << 1)) / 131072;
                int i172 = ((i162 | 1) << 1) - (i162 ^ 1);
                jSONObject.put("14\\24\\initTime".substring(17328 / (((-((i172 & 1) + (i172 | 1))) & i142) * 1444)), this.g);
                jSONObject.put("t1", this.h);
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
