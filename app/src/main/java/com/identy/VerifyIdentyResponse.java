package com.identy;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.FingerMatchSecLevel;
import com.identy.enums.Hand;
import com.identy.enums.Template;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VerifyIdentyResponse extends IdentyResponse {
    private static final byte[] $$a = {49, -88, 79, -64, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27};
    private static final int $$b = 166;
    private boolean PngjInputException;
    protected HashMap o;
    protected HashMap p;
    protected HashMap q;

    public VerifyIdentyResponse(Map map, Action action, int i, WSQCompression wSQCompression, IdentyEncrytion identyEncrytion, String str, IdentyCustomEncryption identyCustomEncryption, Activity activity, Map map2, boolean z) {
        super(action, i, wSQCompression, identyEncrytion, str, identyCustomEncryption, activity, map2, null);
        this.o = new HashMap();
        this.p = new HashMap();
        this.q = new HashMap();
        this.PngjInputException = z;
        for (Object _entry : map.entrySet()) {
            Map.Entry entry = (Map.Entry) _entry;
            Hand hand = (Hand) entry.getKey();
            for (Object _entry2 : ((Map) entry.getValue()).entrySet()) {
                Map.Entry entry2 = (Map.Entry) _entry2;
                StringBuilder sb = new StringBuilder();
                sb.append(hand.toString());
                sb.append("_4f");
                String obj = sb.toString();
                Finger finger = (Finger) entry2.getKey();
                Finger finger2 = Finger.THUMB;
                if (finger.equals(finger2)) {
                    if (entry2.getValue() == null || ((getPadSub3) entry2.getValue()).PngBadCharsetException == null || !((getPadSub3) entry2.getValue()).PngBadCharsetException.equals(FingerDetectionMode.TWO_THUMB)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(hand);
                        sb2.append("_");
                        sb2.append(entry2.getKey());
                        obj = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(entry2.getKey());
                        obj = sb3.toString();
                    }
                } else if (((Map) entry.getValue()).size() < 4) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(hand);
                    sb4.append("_f");
                    obj = sb4.toString();
                } else if (((Map) entry.getValue()).size() == 4 && ((Map) entry.getValue()).containsKey(finger2)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(hand);
                    sb5.append("_f");
                    obj = sb5.toString();
                }
                if (z) {
                    obj = "fingers";
                }
                HashMap hashMap = this.o;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(((getCaptureTime) entry2.getValue()).e1.isMatched());
                hashMap.put(obj, sb6.toString());
                HashMap hashMap2 = this.o;
                String d = IdentyB.d(obj, "_position_mismatch");
                StringBuilder sb7 = new StringBuilder();
                sb7.append(((getCaptureTime) entry2.getValue()).e1.isPositionMismatched());
                hashMap2.put(d, sb7.toString());
                HashMap hashMap3 = this.o;
                String d2 = IdentyB.d(obj, "_score");
                StringBuilder sb8 = new StringBuilder();
                sb8.append(((getCaptureTime) entry2.getValue()).e1.getScore());
                hashMap3.put(d2, sb8.toString());
                HashMap hashMap4 = this.o;
                String d3 = IdentyB.d(obj, "_matchHighestSecurityLevelReached");
                StringBuilder sb9 = new StringBuilder();
                sb9.append(((getCaptureTime) entry2.getValue()).e1.getMatched_true_up_to_security_level());
                hashMap4.put(d3, sb9.toString());
                this.p.put(obj, ((getCaptureTime) entry2.getValue()).e1.getMatched_true_up_to_security_level());
            }
            Map map3 = (Map) entry.getValue();
            getCaptureTime getcapturetime = (getCaptureTime) map3.get(map3.keySet().toArray()[0]);
            this.q.put(hand.toString(), getcapturetime.e1.getEnrollmentTs() == null ? BuildConfig.FLAVOR : getcapturetime.e1.getEnrollmentTs());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = s2 + 4;
        byte[] bArr = $$a;
        int i6 = (s * 19) + 80;
        byte[] bArr2 = new byte[44 - i];
        int i7 = 43 - i;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i5;
            int i10 = (i9 + i6) - 13;
            int i11 = i5;
            i2 = i10;
            i3 = i11;
            bArr = bArr3;
            i4 = i8;
            bArr2[i4] = (byte) i2;
            int i12 = i3 + 1;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i13 = i2;
            i5 = i12;
            i6 = bArr[i12];
            i8 = i4 + 1;
            bArr3 = bArr;
            i9 = i13;
            int i102 = (i9 + i6) - 13;
            int i112 = i5;
            i2 = i102;
            i3 = i112;
            bArr = bArr3;
            i4 = i8;
            bArr2[i4] = (byte) i2;
            int i122 = i3 + 1;
            if (i4 == i7) {
            }
        } else {
            i2 = i6;
            i3 = i5;
            i4 = 0;
            bArr2[i4] = (byte) i2;
            int i1222 = i3 + 1;
            if (i4 == i7) {
            }
        }
    }

    @Override // com.identy.IdentyResponse
    public final void PngjException(Template template, getPadSub3 getpadsub3, FingerOutput fingerOutput, getNfiq1Score getnfiq1score, TemplateSize templateSize) {
        super.PngjException(template, getpadsub3, fingerOutput, getnfiq1score, templateSize);
    }

    public final HashMap<String, String> getEnrollMeta() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~Process.myTid();
                    int c = defpackage.a.c((~(i | (-88968285))) | 642020032, 494, (((-17402909) | i) * 494) + 1168573869, -194076227);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5042;
                    Fpnative.valueOf = objArr;
                    return this.q;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[77], bArr[54], bArr[59], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[27], (short) (-bArr[1]), (byte) (bArr[143] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -194076227);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5042;
            Fpnative.valueOf = objArr;
            return this.q;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final HashMap<String, FingerMatchSecLevel> getMatchHighestSecurityLevelReached() {
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
                    int c = defpackage.a.c((~(identityHashCode | 129102487)) | 541983808 | (~(i | (-43094529))), 164, ((627991767 | identityHashCode) * 164) + (((~((-129102488) | i)) | 627991767) * (-328)) + 108295515, 2111006126);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5021;
                    Fpnative.valueOf = objArr;
                    return this.p;
                }
            }
            byte b = $$a[77];
            Object[] objArr3 = new Object[1];
            a(b, (short) (-b), $$a[27], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a($$a[27], $$a[88], $$a[4], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2111006126);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5021;
            Fpnative.valueOf = objArr;
            return this.p;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public final HashMap<String, String> getResult() {
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
                    int c = defpackage.a.c(~(myUid | (-642056769)), 345, (((~((-659891831) | (~myUid))) | (-803059319)) * 345) + (((~((-659891831) | myUid)) | 642056768) * 345) + 180779864, -770177874);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4966;
                    Fpnative.valueOf = objArr;
                    return this.o;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[77];
            Object[] objArr3 = new Object[1];
            a(b, (short) (b | 102), bArr[64], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[25];
            Object[] objArr4 = new Object[1];
            a(b2, (short) (b2 | 132), bArr[75], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -770177874);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4966;
            Fpnative.valueOf = objArr;
            return this.o;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(8:5|6|7|8|(2:11|9)|12|13|14))|18|19|20|21|6|7|8|(1:9)|12|13|14) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00de A[Catch: Exception -> 0x0152, LOOP:0: B:9:0x00d8->B:11:0x00de, LOOP_END, TryCatch #1 {Exception -> 0x0152, blocks: (B:8:0x00ce, B:9:0x00d8, B:11:0x00de, B:13:0x00f2), top: B:7:0x00ce }] */
    @Override // com.identy.IdentyResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject toJson(Context context) {
        throw new UnsupportedOperationException("Method not decompiled");
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
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~((~identityHashCode) | (-81947))) | 296878629, 576, (((~((-101046299) | identityHashCode)) | 100964352) * 576) + 901473407, 813639159);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4880;
                    Fpnative.valueOf = objArr;
                    return toJson(this.PngjException);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[77], bArr[54], bArr[59], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[27], (short) (-bArr[1]), (byte) (bArr[143] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1507252745);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4880;
            Fpnative.valueOf = objArr;
            return toJson(this.PngjException);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    public VerifyIdentyResponse(Map map, Action action, int i, WSQCompression wSQCompression, IdentyEncrytion identyEncrytion, String str, IdentyCustomEncryption identyCustomEncryption, Activity activity, Map map2) {
        this(map, action, i, wSQCompression, identyEncrytion, str, identyCustomEncryption, activity, map2, false);
    }
}
