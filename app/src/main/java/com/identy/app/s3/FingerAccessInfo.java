package com.identy.app.s3;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.b;
import defpackage.a;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FingerAccessInfo {
    private static final byte[] $$a = {117, -53, -53, -125, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
    private static final int $$b = 183;
    String a;
    String b;
    String c;
    String d;

    public FingerAccessInfo(String str, String str2, String str3, String str4) {
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
                    int i = ~(563294994 | startUptimeMillis);
                    int c = a.c((~(startUptimeMillis | (-64405715))) | (~((-563294995) | startUptimeMillis)) | 26345490, 407, ((i | (~((~startUptimeMillis) | 64405714)) | 26345490) * 407) + (((-601355219) | i) * (-814)) + 1094942606, 1720707152);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4958;
                    Fpnative.valueOf = objArr;
                    this.a = str;
                    this.b = str2;
                    this.c = str3;
                    this.d = str4;
                }
            }
            Object[] objArr3 = new Object[1];
            e(r1[113], r1[34], (byte) (-$$a[3]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(r1[32], r1[111], (byte) 94, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1720707152);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4958;
            Fpnative.valueOf = objArr;
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(int i, int i2, short s, Object[] objArr) {
        int i3;
        int i4;
        int i5;
        int i6 = 44 - i2;
        int i7 = (i * 19) + 80;
        int i8 = 129 - s;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i9 = i8;
            i5 = 0;
            int i10 = i8;
            i7 = (i7 + i9) - 13;
            i3 = i5;
            i4 = i10 + 1;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i9 = bArr[i4];
            i10 = i4;
            i7 = (i7 + i9) - 13;
            i3 = i5;
            i4 = i10 + 1;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i8;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i5 == i6) {
            }
        }
    }

    public double a(Activity activity) {
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
                    int i = ((identityHashCode | 82335743) * (-50)) + 967868813;
                    int i2 = ~((-12587585) | identityHashCode);
                    int i3 = ~identityHashCode;
                    int c = a.c((~(i3 | 82335743)) | (~((-416553537) | i3)) | 403965952, 50, ((i2 | (~((-403965953) | i3))) * 50) + i, -125450471);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4863;
                    Fpnative.valueOf = objArr;
                    int i6 = ((int[]) objArr[1])[0];
                    int i7 = i6 * i6;
                    int i8 = -(309713081 * i6);
                    int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                    int i10 = -(i6 * (-434077665));
                    int i11 = (i9 & i10) + (i10 | i9);
                    int i12 = ((i11 | (-1359131248)) << 1) - ((-1359131248) ^ i11);
                    int i13 = i12 >> 18;
                    int e = b.e((i13 | (-32767)) << 1, i13 ^ (-32767), 16384, -1);
                    int i14 = (i12 & e) + (e | i12);
                    int i15 = i12 >> 27;
                    int i16 = -(b.e((i15 | (-63)) << 1, i15 ^ (-63), 32, -1) ^ i14);
                    int i17 = (i16 & 6) + (i16 | 6);
                    int i18 = i17 >> 26;
                    int a = b.a(i18 & (-127), i18 | (-127), 64, -1);
                    ((ActivityManager) activity.getSystemService("25/24/31/8/7/activity".substring(32760 / (((-(((a | 1) << 1) - (a ^ 1))) & i17) * 420)))).getMemoryInfo(new ActivityManager.MemoryInfo());
                    return r0.totalMem / 1048576;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            e(bArr[113], bArr[29], (byte) (bArr[39] + 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            byte b2 = b;
            Object[] objArr4 = new Object[1];
            e(b2, (byte) (b2 | 28), b, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -125450471);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4863;
            Fpnative.valueOf = objArr;
            int i62 = ((int[]) objArr[1])[0];
            int i72 = i62 * i62;
            int i82 = -(309713081 * i62);
            int i92 = ((i72 | i82) << 1) - (i72 ^ i82);
            int i102 = -(i62 * (-434077665));
            int i112 = (i92 & i102) + (i102 | i92);
            int i122 = ((i112 | (-1359131248)) << 1) - ((-1359131248) ^ i112);
            int i132 = i122 >> 18;
            int e2 = b.e((i132 | (-32767)) << 1, i132 ^ (-32767), 16384, -1);
            int i142 = (i122 & e2) + (e2 | i122);
            int i152 = i122 >> 27;
            int i162 = -(b.e((i152 | (-63)) << 1, i152 ^ (-63), 32, -1) ^ i142);
            int i172 = (i162 & 6) + (i162 | 6);
            int i182 = i172 >> 26;
            int a2 = b.a(i182 & (-127), i182 | (-127), 64, -1);
            ((ActivityManager) activity.getSystemService("25/24/31/8/7/activity".substring(32760 / (((-(((a2 | 1) << 1) - (a2 ^ 1))) & i172) * 420)))).getMemoryInfo(new ActivityManager.MemoryInfo());
            return r0.totalMem / 1048576;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public JSONObject toJson(Activity activity) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~System.identityHashCode(this);
                    int c = a.c((~(i | 1033454261)) | 574984896, 184, ((1071502069 | i) * 184) + 2075850999, 681847724);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5019;
                    Fpnative.valueOf = objArr;
                    JSONObject jSONObject = new JSONObject();
                    String str = this.a;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(1033600938 * i4);
                    int i7 = (i5 & i6) + (i5 | i6);
                    int i8 = -(i4 * (-1624051808));
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    int i10 = (i9 ^ (-1629597607)) + (((-1629597607) & i9) << 1);
                    int i11 = i10 >> 23;
                    int i12 = ((i11 & (-1023)) + (i11 | (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i13 = (i10 - (~(((i12 | 1) << 1) - (i12 ^ 1)))) - 1;
                    int i14 = i10 >> 27;
                    int i15 = (((i14 | (-63)) << 1) - (i14 ^ (-63))) / 32;
                    int i16 = -(i13 ^ ((i15 ^ 1) + ((i15 & 1) << 1)));
                    int i17 = (i16 ^ 1) + ((i16 & 1) << 1);
                    int i18 = i17 >> 15;
                    int a = b.a(i18 ^ (-262143), (i18 & (-262143)) << 1, 131072, -1);
                    jSONObject.put(b.c((-((a ^ 1) + ((a & 1) << 1))) & i17, 167, 1503, "20/15/12/unique_installation_id"), str);
                    jSONObject.put("app", this.b);
                    jSONObject.put("app_commit", this.c);
                    jSONObject.put("app_version", this.d);
                    jSONObject.put("sdk", "7.2.1");
                    jSONObject.put("SDK_commit", "aa1bb024f00e2090fd5463ce83cf89e72937a61f");
                    jSONObject.put("manufacturer", Build.MANUFACTURER);
                    jSONObject.put("model", Build.MODEL);
                    jSONObject.put("os", "Android");
                    jSONObject.put("ram", a(activity));
                    jSONObject.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
                    jSONObject.put("unique_device_id", Settings.Secure.getString(activity.getContentResolver(), "android_id"));
                    return jSONObject;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[113];
            byte b2 = bArr[63];
            Object[] objArr3 = new Object[1];
            e(b, b2, (byte) (b2 | 89), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(bArr[63], bArr[4], bArr[117], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 681847724);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5019;
            Fpnative.valueOf = objArr;
            JSONObject jSONObject2 = new JSONObject();
            String str2 = this.a;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1033600938 * i42);
            int i72 = (i52 & i62) + (i52 | i62);
            int i82 = -(i42 * (-1624051808));
            int i92 = (i72 ^ i82) + ((i82 & i72) << 1);
            int i102 = (i92 ^ (-1629597607)) + (((-1629597607) & i92) << 1);
            int i112 = i102 >> 23;
            int i122 = ((i112 & (-1023)) + (i112 | (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i132 = (i102 - (~(((i122 | 1) << 1) - (i122 ^ 1)))) - 1;
            int i142 = i102 >> 27;
            int i152 = (((i142 | (-63)) << 1) - (i142 ^ (-63))) / 32;
            int i162 = -(i132 ^ ((i152 ^ 1) + ((i152 & 1) << 1)));
            int i172 = (i162 ^ 1) + ((i162 & 1) << 1);
            int i182 = i172 >> 15;
            int a2 = b.a(i182 ^ (-262143), (i182 & (-262143)) << 1, 131072, -1);
            jSONObject2.put(b.c((-((a2 ^ 1) + ((a2 & 1) << 1))) & i172, 167, 1503, "20/15/12/unique_installation_id"), str2);
            jSONObject2.put("app", this.b);
            jSONObject2.put("app_commit", this.c);
            jSONObject2.put("app_version", this.d);
            jSONObject2.put("sdk", "7.2.1");
            jSONObject2.put("SDK_commit", "aa1bb024f00e2090fd5463ce83cf89e72937a61f");
            jSONObject2.put("manufacturer", Build.MANUFACTURER);
            jSONObject2.put("model", Build.MODEL);
            jSONObject2.put("os", "Android");
            jSONObject2.put("ram", a(activity));
            jSONObject2.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
            jSONObject2.put("unique_device_id", Settings.Secure.getString(activity.getContentResolver(), "android_id"));
            return jSONObject2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
