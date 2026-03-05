package com.identy;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.identy.enums.Hand;
import com.identy.enums.Template;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.uuid.Uuid;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class HandOutput {
    private static final byte[] $$a = {34, -5, 8, -42, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
    private static final int $$b = 223;
    private Map PngjBadCrcException;
    private Date PngjBadSignature;
    private boolean PngjException;
    private WSQCompression PngjUnsupportedException;
    private Hand valueOf;
    private boolean values;

    /* JADX WARN: Type inference failed for: r0v33, types: [boolean, int] */
    public HandOutput(Hand hand, WSQCompression wSQCompression) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i = ~startElapsedRealtime;
                    int c = defpackage.a.c((~((-463059582) | i)) | 429459517, 859, (((~(startElapsedRealtime | (-33600065))) | (~(35829698 | i))) * 859) + (((startElapsedRealtime | 35829698) * (-859)) - 1419360058), -15694131);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4948;
                    Fpnative.valueOf = objArr;
                    this.PngjBadCrcException = new HashMap();
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = ((i4 * i4) - (~(-(705662715 * i4)))) - 1;
                    int i6 = -(i4 * (-763051911));
                    int i7 = (((i5 | i6) << 1) - (i6 ^ i5)) - (-364000036);
                    int i8 = ((i7 >> 26) - 127) / 64;
                    int i9 = ((i8 | 1) << 1) - (i8 ^ 1);
                    int i10 = (i7 & i9) + (i9 | i7);
                    int i11 = ((i7 >> 21) - 4095) / 2048;
                    int i12 = -(i10 ^ ((i11 & 1) + (i11 | 1)));
                    int i13 = (i12 & 7) + (i12 | 7);
                    int i14 = i13 >> 25;
                    int e = b.e((i14 | (-255)) << 1, i14 ^ (-255), Uuid.SIZE_BITS, -1);
                    this.values = 0 / (((-((e & 1) + (e | 1))) & i13) * 871);
                    this.PngjException = false;
                    this.PngjBadSignature = new Date();
                    this.PngjBadCrcException = new HashMap();
                    this.valueOf = hand;
                    this.PngjUnsupportedException = wSQCompression;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[113], bArr[63], bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, bArr[57], b, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -15694131);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4948;
            Fpnative.valueOf = objArr;
            this.PngjBadCrcException = new HashMap();
            int i42 = ((int[]) objArr[1])[0];
            int i52 = ((i42 * i42) - (~(-(705662715 * i42)))) - 1;
            int i62 = -(i42 * (-763051911));
            int i72 = (((i52 | i62) << 1) - (i62 ^ i52)) - (-364000036);
            int i82 = ((i72 >> 26) - 127) / 64;
            int i92 = ((i82 | 1) << 1) - (i82 ^ 1);
            int i102 = (i72 & i92) + (i92 | i72);
            int i112 = ((i72 >> 21) - 4095) / 2048;
            int i122 = -(i102 ^ ((i112 & 1) + (i112 | 1)));
            int i132 = (i122 & 7) + (i122 | 7);
            int i142 = i132 >> 25;
            int e2 = b.e((i142 | (-255)) << 1, i142 ^ (-255), Uuid.SIZE_BITS, -1);
            this.values = 0 / (((-((e2 & 1) + (e2 | 1))) & i132) * 871);
            this.PngjException = false;
            this.PngjBadSignature = new Date();
            this.PngjBadCrcException = new HashMap();
            this.valueOf = hand;
            this.PngjUnsupportedException = wSQCompression;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = i2 + 6;
        int i6 = i + 4;
        int i7 = 118 - (b * 19);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i7 = i5;
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i6;
            i7 = (i7 + i6) - 13;
            i6 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i6];
            byte[] bArr4 = bArr;
            i9 = i6;
            i6 = b2;
            i8 = i4;
            bArr3 = bArr4;
            i7 = (i7 + i6) - 13;
            i6 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            if (i4 == i5) {
            }
        }
    }

    public void addTemplates(Template template, String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((int) SystemClock.uptimeMillis());
                    int c = defpackage.a.c((~(i | (-243626997))) | 583308736, 494, (((-201417269) | i) * 494) + 107183021, 1588123288);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4874;
                    Fpnative.valueOf = objArr;
                    this.PngjBadCrcException.put(template, str);
                }
            }
            byte b = $$a[113];
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 96), (byte) ($$b & 55), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(r1[32], (byte) 125, r1[53], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1588123288);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4874;
            Fpnative.valueOf = objArr;
            this.PngjBadCrcException.put(template, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public Map<Template, String> getTemplates() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) Runtime.getRuntime().totalMemory())) | (-130149866))) | 33647017, 983, (((~((-368739415) | r0)) | (-130149866)) * (-983)) - 1599656758, -1414748314);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4861;
                    Fpnative.valueOf = objArr;
                    return this.PngjBadCrcException;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[113], bArr[50], bArr[111], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[32];
            Object[] objArr4 = new Object[1];
            a(b, (byte) (b | 77), bArr[55], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1414748314);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4861;
            Fpnative.valueOf = objArr;
            return this.PngjBadCrcException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:3|(11:5|6|7|8|9|10|11|(4:14|(2:16|17)(1:19)|18|12)|20|21|22))|28|29|30|6|7|8|9|10|11|(1:12)|20|21|22) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x016a A[Catch: Exception -> 0x019a, TryCatch #1 {Exception -> 0x019a, blocks: (B:11:0x0150, B:12:0x0164, B:14:0x016a, B:16:0x0178, B:18:0x0183, B:21:0x0195), top: B:10:0x0150 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject toJson(Context context) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~System.identityHashCode(this)) | 346262818)) | (-152626462), 305, (((~(r0 | 346262818)) | (-498855232)) * 305) - 1958702672, -1706388314);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4890;
                    Fpnative.valueOf = objArr;
                    JSONObject jSONObject = new JSONObject();
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(812018213 * i3);
                    int i6 = ((((i4 | i5) << 1) - (i4 ^ i5)) - (~(-(i3 * 1458523371)))) - (-2095183935);
                    int i7 = i6 >> 22;
                    int i8 = (((i7 | (-2047)) << 1) - (i7 ^ (-2047))) / 1024;
                    int i9 = (i6 - (~(((i8 | 1) << 1) - (i8 ^ 1)))) - 1;
                    int i10 = i6 >> 27;
                    int i11 = (((i10 | (-63)) << 1) - (i10 ^ (-63))) / 32;
                    int i12 = -(i9 ^ ((i11 & 1) + (i11 | 1)));
                    int i13 = (i12 ^ 4) + ((i12 & 4) << 1);
                    int i14 = i13 >> 22;
                    int i15 = ((i14 & (-2047)) + (i14 | (-2047))) / 1024;
                    int i16 = (i15 & 1) + (i15 | 1);
                    jSONObject.put("date", new SimpleDateFormat("16,27,yyyy-MM-dd'T'HH:mm:s.SSS Z".substring(35400 / (((-((i16 & 1) + (i16 | 1))) & i13) * 1475)), context.getResources().getConfiguration().getLocales().get(0)).format(this.PngjBadSignature));
                    jSONObject.put("hand", this.valueOf);
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : this.PngjBadCrcException.entrySet()) {
                        if (entry.equals(Template.FF_WSQ)) {
                            jSONObject.put("wsq_compression", this.PngjUnsupportedException.toString());
                        }
                        jSONObject2.put(((Template) entry.getKey()).toString(), entry.getValue());
                    }
                    jSONObject.put("templates", jSONObject2);
                    return jSONObject;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[113], bArr[63], bArr[62], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            a(b, bArr[57], b, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1706388314);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4890;
            Fpnative.valueOf = objArr;
            JSONObject jSONObject3 = new JSONObject();
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(812018213 * i32);
            int i62 = ((((i42 | i52) << 1) - (i42 ^ i52)) - (~(-(i32 * 1458523371)))) - (-2095183935);
            int i72 = i62 >> 22;
            int i82 = (((i72 | (-2047)) << 1) - (i72 ^ (-2047))) / 1024;
            int i92 = (i62 - (~(((i82 | 1) << 1) - (i82 ^ 1)))) - 1;
            int i102 = i62 >> 27;
            int i112 = (((i102 | (-63)) << 1) - (i102 ^ (-63))) / 32;
            int i122 = -(i92 ^ ((i112 & 1) + (i112 | 1)));
            int i132 = (i122 ^ 4) + ((i122 & 4) << 1);
            int i142 = i132 >> 22;
            int i152 = ((i142 & (-2047)) + (i142 | (-2047))) / 1024;
            int i162 = (i152 & 1) + (i152 | 1);
            jSONObject3.put("date", new SimpleDateFormat("16,27,yyyy-MM-dd'T'HH:mm:s.SSS Z".substring(35400 / (((-((i162 & 1) + (i162 | 1))) & i132) * 1475)), context.getResources().getConfiguration().getLocales().get(0)).format(this.PngjBadSignature));
            jSONObject3.put("hand", this.valueOf);
            JSONObject jSONObject22 = new JSONObject();
            while (r1.hasNext()) {
            }
            jSONObject3.put("templates", jSONObject22);
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
