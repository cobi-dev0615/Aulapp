package com.identy;

import android.content.Context;
import android.graphics.RectF;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Pair;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import com.identy.enums.Template;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.ConstantsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SlapOutput {
    private static final byte[] $$a = {126, 106, 85, 73, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27};
    private static final int $$b = 66;
    private HashMap PngjBadCrcException;
    private Date PngjBadSignature;
    private Slap PngjException;
    public HashMap<Integer, RectF> positionsby;
    public Map<Integer, byte[]> templatesby;
    private Map valueOf;

    public SlapOutput(Slap slap) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int c = defpackage.a.c(maxMemory | (-235209281), 591, (((~((~maxMemory) | (-235209281))) | (-263680000)) * (-591)) + 852563534, -1696701493);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4903;
                    Fpnative.valueOf = objArr;
                    this.valueOf = new HashMap();
                    this.templatesby = new HashMap();
                    this.PngjBadCrcException = new HashMap();
                    this.positionsby = new HashMap<>();
                    this.PngjException = slap;
                    this.PngjBadSignature = new Date();
                    this.valueOf = new HashMap();
                    this.PngjBadCrcException = new HashMap();
                }
            }
            byte b = $$a[27];
            Object[] objArr3 = new Object[1];
            a(b, (short) (b | 135), r1[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(r1[4], (short) 92, r1[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1696701493);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4903;
            Fpnative.valueOf = objArr;
            this.valueOf = new HashMap();
            this.templatesby = new HashMap();
            this.PngjBadCrcException = new HashMap();
            this.positionsby = new HashMap<>();
            this.PngjException = slap;
            this.PngjBadSignature = new Date();
            this.valueOf = new HashMap();
            this.PngjBadCrcException = new HashMap();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void a(short s, int i, short s2, Object[] objArr) {
        int i2 = (s2 * 19) + 80;
        byte[] bArr = $$a;
        int i3 = 138 - i;
        byte[] bArr2 = new byte[44 - s];
        int i4 = 43 - s;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i3 + i2) - 13;
            i3 = i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            int i6 = i3 + 1;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + bArr[i6]) - 13;
                i3 = i6;
            }
        }
    }

    private static JSONObject valueOf(RectF rectF) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("left", rectF.left);
            jSONObject.put("bottom", rectF.bottom);
            jSONObject.put("right", rectF.right);
            jSONObject.put("top", rectF.top);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public void addPosition(Pair<Hand, Finger> pair, RectF rectF) {
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
                    int i = (((~((-42672125) | identityHashCode)) | (-456217156)) * (-318)) + 2135555597;
                    int i2 = ~((-456217156) | identityHashCode);
                    int i3 = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | 465264639)) | (~((-422592516) | i3)), 318, ((i2 | (~(i3 | 465264639))) * 318) + i, -49044662);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4943;
                    Fpnative.valueOf = objArr;
                    this.PngjBadCrcException.put(pair, rectF);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[64], bArr[21], bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[75], bArr[27], bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -49044662);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4943;
            Fpnative.valueOf = objArr;
            this.PngjBadCrcException.put(pair, rectF);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
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
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int i2 = (((~(6430048 | i)) | 488128671) * (-1188)) + 1912933933;
                    int i3 = (~(identityHashCode | (-6430049))) | 488128671;
                    int i4 = ~(492459231 | i);
                    int c = defpackage.a.c((~(i | (-6430049))) | 2099488 | i4, 594, ((i3 | i4) * 594) + i2, -385120929);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4895;
                    Fpnative.valueOf = objArr;
                    this.valueOf.put(template, str);
                }
            }
            byte b = $$a[27];
            Object[] objArr3 = new Object[1];
            a(b, (short) (b | 135), r1[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(r1[4], (short) 92, r1[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -385120929);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4895;
            Fpnative.valueOf = objArr;
            this.valueOf.put(template, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public HashMap<Pair<Hand, Finger>, RectF> getPositions() {
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
                    int c = defpackage.a.c(~((~identityHashCode) | (-338296858)), 501, (((~((-338296858) | identityHashCode)) | (-938406490)) * 501) + 506104692, 821984381);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4913;
                    Fpnative.valueOf = objArr;
                    return this.PngjBadCrcException;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[59], (short) ($$b | 8), bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((byte) (bArr[143] + 1), bArr[81], bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 821984381);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4913;
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
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~((~identityHashCode) | 409001424)) | (-779980225), 398, (((~(409001424 | identityHashCode)) | (-779980225)) * 398) + 1795896923, -1644890763);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4996;
                    Fpnative.valueOf = objArr;
                    return this.valueOf;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[64], bArr[21], bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[75], bArr[27], bArr[25], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1644890763);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4996;
            Fpnative.valueOf = objArr;
            return this.valueOf;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0121 A[LOOP:1: B:18:0x011b->B:20:0x0121, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSlab(Slap slap, int i) {
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
                    int c = defpackage.a.c((~(myUid | 191090274)) | (~((~myUid) | (-191090275))) | (~((-307799006) | myUid)), 959, ((((~((-307799006) | r5)) | (~((-191090275) | myUid))) | (~(r5 | 191090274))) * 959) - 1374386114, 588122372);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4940;
                    Fpnative.valueOf = objArr;
                    this.PngjException = slap;
                    for (Map.Entry<Integer, byte[]> entry : this.templatesby.entrySet()) {
                        this.valueOf.put(Template.getFromOrdinal(entry.getKey()) == Template.WSQ ? Template.SLAP_WSQ : Template.SLAP_PNG, new String(Base64.encode(entry.getValue(), i)));
                    }
                    for (Map.Entry<Integer, RectF> entry2 : this.positionsby.entrySet()) {
                        this.PngjBadCrcException.put(Position.getFromOrdinal(entry2.getKey().intValue()).getPair(), entry2.getValue());
                    }
                }
            }
            byte b = $$a[27];
            Object[] objArr3 = new Object[1];
            a(b, (short) (b | 135), r1[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(r1[4], (short) 92, r1[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 588122372);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4940;
            Fpnative.valueOf = objArr;
            this.PngjException = slap;
            while (r15.hasNext()) {
            }
            while (r15.hasNext()) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(2:3|(13:5|6|7|8|9|10|(2:13|11)|14|15|(2:18|16)|19|20|21))|27|28|29|6|7|8|9|10|(1:11)|14|15|(1:16)|19|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x016d A[Catch: Exception -> 0x01e8, LOOP:0: B:11:0x0167->B:13:0x016d, LOOP_END, TryCatch #0 {Exception -> 0x01e8, blocks: (B:10:0x0158, B:11:0x0167, B:13:0x016d, B:15:0x0185, B:16:0x0194, B:18:0x019a, B:20:0x01de), top: B:9:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019a A[Catch: Exception -> 0x01e8, LOOP:1: B:16:0x0194->B:18:0x019a, LOOP_END, TryCatch #0 {Exception -> 0x01e8, blocks: (B:10:0x0158, B:11:0x0167, B:13:0x016d, B:15:0x0185, B:16:0x0194, B:18:0x019a, B:20:0x01de), top: B:9:0x0158 }] */
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
                    int myPid = Process.myPid();
                    int i = ~myPid;
                    int c = defpackage.a.c(~(i | (-4967552)), 184, ((myPid | 489693568) * (-184)) + (((~(493921728 | i)) | 739391) * 184) + 272144631, -732155512);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4976;
                    Fpnative.valueOf = objArr;
                    JSONObject jSONObject = new JSONObject();
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = ((((i4 * i4) - (~(-(849768700 * i4)))) - 1) - (~(-(i4 * 572910386)))) - 1;
                    int i6 = (i5 & 1319126545) + (1319126545 | i5);
                    int i7 = ((i6 >> 29) - 15) / 8;
                    int i8 = (i7 & 1) + (i7 | 1);
                    int i9 = ((i6 | i8) << 1) - (i8 ^ i6);
                    int i10 = i6 >> 17;
                    int i11 = ((i10 & (-65535)) + (i10 | (-65535))) / 32768;
                    int i12 = -(i9 ^ (((i11 | 1) << 1) - (i11 ^ 1)));
                    int i13 = (i12 & 9) + (i12 | 9);
                    int i14 = i13 >> 19;
                    jSONObject.put("date", new SimpleDateFormat("7,14,3,yyyy-MM-dd'T'HH:mm:s.SSS Z".substring(107730 / (((-(((((i14 | (-16383)) << 1) - (i14 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE) + 2)) & i13) * 1710)), context.getResources().getConfiguration().getLocales().get(0)).format(this.PngjBadSignature));
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : this.valueOf.entrySet()) {
                        jSONObject2.put(((Template) entry.getKey()).toString(), entry.getValue());
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry entry2 : this.PngjBadCrcException.entrySet()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(((Hand) ((Pair) entry2.getKey()).first).name());
                        sb.append("_");
                        sb.append(((Finger) ((Pair) entry2.getKey()).second).name());
                        jSONObject3.put(sb.toString(), valueOf((RectF) entry2.getValue()));
                    }
                    jSONObject.put("positions", jSONObject3);
                    jSONObject.put("templates", jSONObject2);
                    return jSONObject;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[59], (short) ($$b | 8), bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((byte) (bArr[143] + 1), bArr[81], bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -732155512);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4976;
            Fpnative.valueOf = objArr;
            JSONObject jSONObject4 = new JSONObject();
            int i42 = ((int[]) objArr[1])[0];
            int i52 = ((((i42 * i42) - (~(-(849768700 * i42)))) - 1) - (~(-(i42 * 572910386)))) - 1;
            int i62 = (i52 & 1319126545) + (1319126545 | i52);
            int i72 = ((i62 >> 29) - 15) / 8;
            int i82 = (i72 & 1) + (i72 | 1);
            int i92 = ((i62 | i82) << 1) - (i82 ^ i62);
            int i102 = i62 >> 17;
            int i112 = ((i102 & (-65535)) + (i102 | (-65535))) / 32768;
            int i122 = -(i92 ^ (((i112 | 1) << 1) - (i112 ^ 1)));
            int i132 = (i122 & 9) + (i122 | 9);
            int i142 = i132 >> 19;
            jSONObject4.put("date", new SimpleDateFormat("7,14,3,yyyy-MM-dd'T'HH:mm:s.SSS Z".substring(107730 / (((-(((((i142 | (-16383)) << 1) - (i142 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE) + 2)) & i132) * 1710)), context.getResources().getConfiguration().getLocales().get(0)).format(this.PngjBadSignature));
            JSONObject jSONObject22 = new JSONObject();
            while (r1.hasNext()) {
            }
            JSONObject jSONObject32 = new JSONObject();
            while (r2.hasNext()) {
            }
            jSONObject4.put("positions", jSONObject32);
            jSONObject4.put("templates", jSONObject22);
            return jSONObject4;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public SlapOutput() {
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
                    int c = defpackage.a.c((~(i | (-229595034))) | 228738329, 983, (((~((-269294247) | i)) | (-229595034)) * (-983)) + 928759530, -1582195675);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4969;
                    Fpnative.valueOf = objArr;
                    this.valueOf = new HashMap();
                    this.templatesby = new HashMap();
                    this.PngjBadCrcException = new HashMap();
                    this.positionsby = new HashMap<>();
                    this.PngjBadSignature = new Date();
                    this.templatesby = new HashMap();
                    this.positionsby = new HashMap<>();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[59], (short) ($$b | 8), bArr[77], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((byte) (bArr[143] + 1), bArr[81], bArr[27], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1582195675);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4969;
            Fpnative.valueOf = objArr;
            this.valueOf = new HashMap();
            this.templatesby = new HashMap();
            this.PngjBadCrcException = new HashMap();
            this.positionsby = new HashMap<>();
            this.PngjBadSignature = new Date();
            this.templatesby = new HashMap();
            this.positionsby = new HashMap<>();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
