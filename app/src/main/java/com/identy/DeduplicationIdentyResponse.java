package com.identy;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class DeduplicationIdentyResponse extends IdentyResponse {
    private static final byte[] $$a = {25, Base64.padSymbol, -16, 69, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0};
    private static final int $$b = 230;
    private boolean PngjPrematureEnding;
    protected Integer[] o;

    public DeduplicationIdentyResponse(Integer[] numArr) {
        this.PngjPrematureEnding = false;
        this.o = numArr;
        this.PngjPrematureEnding = numArr.length > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, byte b, Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = b + 4;
        byte[] bArr = $$a;
        int i5 = (s * 19) + 80;
        byte[] bArr2 = new byte[s2 + 6];
        int i6 = s2 + 5;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i4;
            i3 = 0;
            int i9 = i4 + 1;
            i = (i8 + (-i7)) - 13;
            i2 = i9;
            bArr2[i3] = (byte) i;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i2];
            i3++;
            int i10 = i;
            i4 = i2;
            i8 = i10;
            int i92 = i4 + 1;
            i = (i8 + (-i7)) - 13;
            i2 = i92;
            bArr2[i3] = (byte) i;
            if (i3 == i6) {
            }
        } else {
            i = i5;
            i2 = i4;
            i3 = 0;
            bArr2[i3] = (byte) i;
            if (i3 == i6) {
            }
        }
    }

    public final Integer[] getFingers() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~((~identityHashCode) | 531710291)) | 1030599571, 217, (((~(identityHashCode | (-1030599572))) | 541897344) * 217) + ((((~((-1030599572) | r5)) | (~(531710291 | identityHashCode))) * 217) - 687709379), -260516091);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4893;
                    Fpnative.valueOf = objArr;
                    return this.o;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) (-bArr[113]), (byte) (-bArr[62]), bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[25], bArr[63], (byte) (-bArr[57]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -260516091);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4893;
            Fpnative.valueOf = objArr;
            return this.o;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final boolean isFoundMatchingTemplates() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | (-2757123))) | (~(103453186 | i)) | 294740029, 140, (((~(395436093 | i)) | 2757122) * (-280)) + (((identityHashCode | 395436093) * 140) - 1250490209), -1043101156);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4904;
                    Fpnative.valueOf = objArr;
                    return this.PngjPrematureEnding;
                }
            }
            byte b = (byte) (-$$a[113]);
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 22), (byte) 97, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(r1[63], r1[116], (byte) 125, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1043101156);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4904;
            Fpnative.valueOf = objArr;
            return this.PngjPrematureEnding;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void setFingers(Integer[] numArr) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((~((int) SystemClock.elapsedRealtime())) | 114542715);
                    int c = defpackage.a.c(i | 113281088, 374, ((1261627 | i) * (-374)) + 1553283825, 1278184126);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4981;
                    Fpnative.valueOf = objArr;
                    this.o = numArr;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) (-bArr[113]), (byte) (-bArr[111]), (byte) (-bArr[50]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            byte b2 = (byte) (-bArr[55]);
            Object[] objArr4 = new Object[1];
            a(b, b2, (byte) (b2 | 66), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1278184126);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4981;
            Fpnative.valueOf = objArr;
            this.o = numArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void setFoundMatchingTemplates(boolean z) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c(identityHashCode | (-489273012), 496, (((~((-988162292) | identityHashCode)) | 583403584 | (~((~identityHashCode) | (-84514305)))) * (-496)) + ((r5 * 992) - 2137057233), -1644443764);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5029;
                    Fpnative.valueOf = objArr;
                    this.PngjPrematureEnding = z;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) (-bArr[113]), (byte) (-bArr[62]), bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[25], bArr[63], (byte) (-bArr[57]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1644443764);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5029;
            Fpnative.valueOf = objArr;
            this.PngjPrematureEnding = z;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(8:5|6|7|8|(1:10)|11|12|13))|17|18|19|20|6|7|8|(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00dc A[Catch: Exception -> 0x0157, LOOP:0: B:9:0x00da->B:10:0x00dc, LOOP_END, TryCatch #1 {Exception -> 0x0157, blocks: (B:8:0x00d6, B:10:0x00dc, B:12:0x00e4), top: B:7:0x00d6 }] */
    @Override // com.identy.IdentyResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject toJson(Context context) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~(System.identityHashCode(this) | 78154811)) | (-653065852), 490, (((-574911041) | (~r0)) * (-490)) - 576195451, -27013057);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4951;
                    Fpnative.valueOf = objArr;
                    JSONObject json = super.toJson(context);
                    JSONArray jSONArray = new JSONArray();
                    for (Integer num : this.o) {
                        jSONArray.put(num);
                    }
                    json.put("fingers", jSONArray);
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(792306197 * i3);
                    int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                    int i7 = -(i3 * (-2112554845));
                    int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                    int i9 = (i8 & 1164474640) + (1164474640 | i8);
                    int i10 = i9 >> 23;
                    int i11 = (((i10 | (-1023)) << 1) - (i10 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i12 = (i9 - (~(((i11 | 1) << 1) - (i11 ^ 1)))) - 1;
                    int i13 = i9 >> 24;
                    int i14 = ((i13 & (-511)) + (i13 | (-511))) / 256;
                    int i15 = -(i12 ^ ((i14 & 1) + (i14 | 1)));
                    int i16 = (i15 ^ 9) + ((i15 & 9) << 1);
                    int i17 = i16 >> 18;
                    int i18 = (((i17 & (-32767)) + (i17 | (-32767))) / 16384) + 1;
                    json.put("28,foundMatchingTemplates".substring(10476 / (((-((i18 ^ 1) + ((i18 & 1) << 1))) & i16) * 388)), this.PngjPrematureEnding);
                    return json;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) (-bArr[113]), (byte) (-bArr[111]), (byte) (-bArr[50]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            byte b2 = (byte) (-bArr[55]);
            Object[] objArr4 = new Object[1];
            a(b, b2, (byte) (b2 | 66), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -743249513);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4951;
            Fpnative.valueOf = objArr;
            JSONObject json2 = super.toJson(context);
            JSONArray jSONArray2 = new JSONArray();
            while (r6 < r5) {
            }
            json2.put("fingers", jSONArray2);
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(792306197 * i32);
            int i62 = ((i42 | i52) << 1) - (i42 ^ i52);
            int i72 = -(i32 * (-2112554845));
            int i82 = ((i62 | i72) << 1) - (i72 ^ i62);
            int i92 = (i82 & 1164474640) + (1164474640 | i82);
            int i102 = i92 >> 23;
            int i112 = (((i102 | (-1023)) << 1) - (i102 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i122 = (i92 - (~(((i112 | 1) << 1) - (i112 ^ 1)))) - 1;
            int i132 = i92 >> 24;
            int i142 = ((i132 & (-511)) + (i132 | (-511))) / 256;
            int i152 = -(i122 ^ ((i142 & 1) + (i142 | 1)));
            int i162 = (i152 ^ 9) + ((i152 & 9) << 1);
            int i172 = i162 >> 18;
            int i182 = (((i172 & (-32767)) + (i172 | (-32767))) / 16384) + 1;
            json2.put("28,foundMatchingTemplates".substring(10476 / (((-((i182 ^ 1) + ((i182 & 1) << 1))) & i162) * 388)), this.PngjPrematureEnding);
            return json2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.identy.IdentyResponse
    public final JSONObject toJson() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int i = ~myUid;
                    int i2 = (~((-675587784) | i)) | 134227079;
                    int c = defpackage.a.c(~(i | 176698503), 713, ((~(myUid | 718059207)) * 1426) + (((i2 | r0) * (-713)) - 1706344122), 1813541786);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4933;
                    Fpnative.valueOf = objArr;
                    return toJson(this.PngjException);
                }
            }
            byte b = (byte) (-$$a[113]);
            Object[] objArr3 = new Object[1];
            a(b, (byte) (b | 22), (byte) 97, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(r1[63], r1[116], (byte) 125, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1813541786);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4933;
            Fpnative.valueOf = objArr;
            return toJson(this.PngjException);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
