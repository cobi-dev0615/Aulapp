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
                    int e = IdentyB.e((i14 | (-255)) << 1, i14 ^ (-255), 128, -1);
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
            int e2 = IdentyB.e((i142 | (-255)) << 1, i142 ^ (-255), 128, -1);
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
            a($$a[32], (byte) 125, $$a[53], objArr4);
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
                    int c = defpackage.a.c((~((~((int) Runtime.getRuntime().totalMemory())) | (-130149866))) | 33647017, 983, (((~((-368739415) | 0)) | (-130149866)) * (-983)) - 1599656758, -1414748314);
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
        throw new UnsupportedOperationException("Method not decompiled");
    }

}
