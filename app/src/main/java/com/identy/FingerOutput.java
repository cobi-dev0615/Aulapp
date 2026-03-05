package com.identy;

import android.content.Context;
import android.os.Process;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import com.identy.enums.Template;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.io.ConstantsKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FingerOutput {
    private static final byte[] $$a = {25, 31, -61, 78, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12};
    private static final int $$b = 215;
    private int Action;
    private Finger Attempt;
    private Map PngBadCharsetException;
    private float PngjBadCrcException;
    private int PngjBadSignature;
    private boolean PngjException;
    private String PngjExceptionInternal;
    private int PngjInputException;
    private int PngjOutputException;
    private int PngjPrematureEnding;
    private List PngjUnsupportedException;
    private Map a;
    private WSQCompression e1;
    private long getAsHighestSecurityLevelReached;
    private long getData;
    private String getPadSub1;
    private double getPadSub2;
    private Hand getPadSub3;
    private long getQualityScore;
    private FingerAS getScore;
    private Date onErrorResponse;
    private boolean valueOf;
    private int values;

    /* JADX WARN: Removed duplicated region for block: B:11:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FingerOutput(Hand hand, Finger finger, getPadSub3 getpadsub3, WSQCompression wSQCompression) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((~((int) Runtime.getRuntime().totalMemory())) | 1763253);
                    int c = defpackage.a.c(i | 33408, 970, ((1729845 | i) * (-970)) + 2144433169, 443375789);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4885;
                    Fpnative.valueOf = objArr;
                    this.PngjBadSignature = 0;
                    this.PngjException = false;
                    this.PngjBadCrcException = 0.0f;
                    this.valueOf = false;
                    this.PngjInputException = 8;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(1553022728 * i4);
                    int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                    int i8 = -(i4 * 1030427428);
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    int i10 = (i9 & (-1639969308)) + ((-1639969308) | i9);
                    int i11 = i10 >> 19;
                    int a = IdentyB.a(i11 & (-16383), i11 | (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1);
                    int i12 = (i10 ^ a) + ((a & i10) << 1);
                    int i13 = i10 >> 21;
                    int i14 = ((i13 ^ (-4095)) + ((i13 & (-4095)) << 1)) / 2048;
                    int i15 = (-(((i14 & 1) + (i14 | 1)) ^ i12)) + 9;
                    int i16 = ((i15 >> 17) - 65535) / 32768;
                    int i17 = ((i16 | 1) << 1) - (i16 ^ 1);
                    this.PngjExceptionInternal = IdentyB.c(i15 & (-(((i17 | 1) << 1) - (i17 ^ 1))), 1009, 45405, "2,31,");
                    this.PngjUnsupportedException = new ArrayList();
                    this.PngBadCharsetException = new HashMap();
                    this.a = new HashMap();
                    this.getPadSub2 = 0.0d;
                    this.onErrorResponse = getpadsub3.PngjExceptionInternal;
                    this.PngBadCharsetException = new HashMap();
                    this.getPadSub3 = hand;
                    this.Attempt = finger;
                    this.getPadSub2 = getpadsub3.PngjPrematureEnding;
                    this.Action = getpadsub3.Action;
                    this.PngjOutputException = getpadsub3.valueOf();
                    this.values = getpadsub3.PngjBadSignature();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.PngjOutputException);
                    sb.append("x");
                    sb.append(this.values);
                    sb.append("x1");
                    this.PngjExceptionInternal = sb.toString();
                    this.PngjPrematureEnding = getpadsub3.PngjBadSignature;
                    this.PngjUnsupportedException = getpadsub3.PngjOutputException;
                    this.e1 = wSQCompression;
                    this.getPadSub1 = getpadsub3.values() != null ? BuildConfig.FLAVOR : getpadsub3.values().getData();
                    this.getAsHighestSecurityLevelReached = getpadsub3.values() != null ? 0L : getpadsub3.values().getCaptureTime();
                    this.getQualityScore = getpadsub3.values() != null ? 0L : getpadsub3.values().getOveralTimetaken();
                    this.getData = getpadsub3.values() != null ? getpadsub3.values().getProcessingTime() : 0L;
                    this.getScore = getpadsub3.onErrorResponse;
                }
            }
            byte b = $$a[16];
            byte b2 = (byte) (-b);
            Object[] objArr3 = new Object[1];
            b(b2, (byte) (b2 | 22), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(r2[42], r2[19], r2[21], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 443375789);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4885;
            Fpnative.valueOf = objArr;
            this.PngjBadSignature = 0;
            this.PngjException = false;
            this.PngjBadCrcException = 0.0f;
            this.valueOf = false;
            this.PngjInputException = 8;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1553022728 * i42);
            int i72 = (i52 ^ i62) + ((i52 & i62) << 1);
            int i82 = -(i42 * 1030427428);
            int i92 = (i72 ^ i82) + ((i82 & i72) << 1);
            int i102 = (i92 & (-1639969308)) + ((-1639969308) | i92);
            int i112 = i102 >> 19;
            int a2 = IdentyB.a(i112 & (-16383), i112 | (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1);
            int i122 = (i102 ^ a2) + ((a2 & i102) << 1);
            int i132 = i102 >> 21;
            int i142 = ((i132 ^ (-4095)) + ((i132 & (-4095)) << 1)) / 2048;
            int i152 = (-(((i142 & 1) + (i142 | 1)) ^ i122)) + 9;
            int i162 = ((i152 >> 17) - 65535) / 32768;
            int i172 = ((i162 | 1) << 1) - (i162 ^ 1);
            this.PngjExceptionInternal = IdentyB.c(i152 & (-(((i172 | 1) << 1) - (i172 ^ 1))), 1009, 45405, "2,31,");
            this.PngjUnsupportedException = new ArrayList();
            this.PngBadCharsetException = new HashMap();
            this.a = new HashMap();
            this.getPadSub2 = 0.0d;
            this.onErrorResponse = getpadsub3.PngjExceptionInternal;
            this.PngBadCharsetException = new HashMap();
            this.getPadSub3 = hand;
            this.Attempt = finger;
            this.getPadSub2 = getpadsub3.PngjPrematureEnding;
            this.Action = getpadsub3.Action;
            this.PngjOutputException = getpadsub3.valueOf();
            this.values = getpadsub3.PngjBadSignature();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.PngjOutputException);
            sb2.append("x");
            sb2.append(this.values);
            sb2.append("x1");
            this.PngjExceptionInternal = sb2.toString();
            this.PngjPrematureEnding = getpadsub3.PngjBadSignature;
            this.PngjUnsupportedException = getpadsub3.PngjOutputException;
            this.e1 = wSQCompression;
            this.getPadSub1 = getpadsub3.values() != null ? BuildConfig.FLAVOR : getpadsub3.values().getData();
            this.getAsHighestSecurityLevelReached = getpadsub3.values() != null ? 0L : getpadsub3.values().getCaptureTime();
            this.getQualityScore = getpadsub3.values() != null ? 0L : getpadsub3.values().getOveralTimetaken();
            this.getData = getpadsub3.values() != null ? getpadsub3.values().getProcessingTime() : 0L;
            this.getScore = getpadsub3.onErrorResponse;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, Object[] objArr) {
        int i2;
        int i3 = (b * 19) + 80;
        byte[] bArr = $$a;
        int i4 = s + 4;
        byte[] bArr2 = new byte[i + 6];
        int i5 = i + 5;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i6 = 0;
            int i7 = i4;
            i3 = (i4 + (-i3)) - 13;
            i4 = i7;
            bArr = bArr3;
            i2 = i6;
            int i8 = i4 + 1;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i8];
            i4 = i3;
            i3 = b2;
            bArr3 = bArr;
            i7 = i8;
            i3 = (i4 + (-i3)) - 13;
            i4 = i7;
            bArr = bArr3;
            i2 = i6;
            int i82 = i4 + 1;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            int i822 = i4 + 1;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addEncryptedTemplates(Template template, TemplateSize templateSize, TemplateOutput templateOutput) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c(~((~Process.myPid()) | (-37552193)), -948, (((~((-176115908) | r0)) | (-322773373)) * (-948)) - 1093434069, 1948336709);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4982;
                    Fpnative.valueOf = objArr;
                    HashMap hashMap = new HashMap();
                    if (this.a.containsKey(template)) {
                        this.a.put(template, hashMap);
                    } else {
                        hashMap = (HashMap) this.a.get(template);
                    }
                    hashMap.put(templateSize, templateOutput);
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[16]), (byte) (-bArr[31]), (byte) (-bArr[27]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[68];
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 73), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 162753301);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4982;
            Fpnative.valueOf = objArr;
            HashMap hashMap2 = new HashMap();
            if (this.a.containsKey(template)) {
            }
            hashMap2.put(templateSize, templateOutput);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addTemplates(Template template, TemplateSize templateSize, String str) {
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
                    int i = (((~((-578497686) | identityHashCode)) | 574686336 | (~(79608405 | identityHashCode))) * (-880)) + 1434790607;
                    int i2 = (~((-578497686) | (~identityHashCode))) | (-79608406);
                    int i3 = ~(identityHashCode | 578497685);
                    int c = defpackage.a.c(i3, 880, ((i2 | i3) * (-880)) + i, -846004927);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 5037;
                    Fpnative.valueOf = objArr;
                    HashMap hashMap = new HashMap();
                    if (this.PngBadCharsetException.containsKey(template)) {
                        this.PngBadCharsetException.put(template, hashMap);
                    } else {
                        hashMap = (HashMap) this.PngBadCharsetException.get(template);
                    }
                    hashMap.put(templateSize, str);
                }
            }
            byte b = $$a[16];
            byte b2 = (byte) (-b);
            Object[] objArr3 = new Object[1];
            b(b2, (byte) (b2 | 22), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(r1[42], r1[19], r1[21], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -846004927);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5037;
            Fpnative.valueOf = objArr;
            HashMap hashMap2 = new HashMap();
            if (this.PngBadCharsetException.containsKey(template)) {
            }
            hashMap2.put(templateSize, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public FingerAS getAsHighestSecurityLevelReached() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = (int) Runtime.getRuntime().totalMemory();
                    int i2 = (((~(233412653 | i)) | 265476626) * 672) - 1879897633;
                    int i3 = ~i;
                    int c = defpackage.a.c((~((-265476627) | i3)) | 34750994, 672, (((~(i | 265476626)) | (~((-233412654) | i3))) * (-672)) + i2, 125547453);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4906;
                    Fpnative.valueOf = objArr;
                    return this.getScore;
                }
            }
            byte b = $$a[16];
            byte b2 = (byte) (-b);
            Object[] objArr3 = new Object[1];
            b(b2, (byte) (b2 | 22), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(r1[42], r1[19], r1[21], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 125547453);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4906;
            Fpnative.valueOf = objArr;
            return this.getScore;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public List<Attempt> getAttempts() {
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
                    int c = defpackage.a.c((~(identityHashCode | (-27263238))) | 196666, 366, (((~((-262977926) | identityHashCode)) | 235911354) * (-366)) + 871119167, -62231329);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5017;
                    Fpnative.valueOf = objArr;
                    return this.PngjUnsupportedException;
                }
            }
            byte b = $$a[16];
            byte b2 = (byte) (-b);
            Object[] objArr3 = new Object[1];
            b(b2, (byte) (b2 | 22), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(r1[42], r1[19], r1[21], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -62231329);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5017;
            Fpnative.valueOf = objArr;
            return this.PngjUnsupportedException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public String getData() {
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
                    int c = defpackage.a.c((~(identityHashCode | 1064820469)) | 557009973, 130, ((~((~identityHashCode) | 1064820469)) * 130) + 2089744449, -422074082);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4889;
                    Fpnative.valueOf = objArr;
                    return this.getPadSub1;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[16]), (byte) (-bArr[31]), (byte) (-bArr[27]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[68];
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 73), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -422074082);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4889;
            Fpnative.valueOf = objArr;
            return this.getPadSub1;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public Map<Template, HashMap<TemplateSize, TemplateOutput>> getEncryptedTemplates() {
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
                    int c = defpackage.a.c((~((~identityHashCode) | 127152035)) | 271073308, 191, (((~(identityHashCode | 127152035)) | 371737244) * 191) + 1027754807, -262015512);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5020;
                    Fpnative.valueOf = objArr;
                    return this.a;
                }
            }
            byte b = $$a[16];
            byte b2 = (byte) (-b);
            Object[] objArr3 = new Object[1];
            b(b2, (byte) (b2 | 22), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(r1[42], r1[19], r1[21], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -262015512);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5020;
            Fpnative.valueOf = objArr;
            return this.a;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public int getHeight() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c(~(System.identityHashCode(this) | (-403194295)), -1504, (((~((-973654519) | r0)) | 570460224) * 1504) - 1003693777, 114829975);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4998;
                    Fpnative.valueOf = objArr;
                    return this.values;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[16]), (byte) (-bArr[31]), (byte) (-bArr[27]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[68];
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 73), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1885931911);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4998;
            Fpnative.valueOf = objArr;
            return this.values;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public double getIdentyQuality() {
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
                    int i2 = (~((-978541126) | i)) | 403851269;
                    int i3 = ~(identityHashCode | 1054341701);
                    int c = defpackage.a.c(~(i | 479651845), 713, (i3 * 1426) + ((i2 | i3) * (-713)) + 808391970, -1686328658);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4896;
                    Fpnative.valueOf = objArr;
                    return this.getPadSub2;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[16]), (byte) (-bArr[31]), (byte) (-bArr[27]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[68];
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 73), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1686328658);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4896;
            Fpnative.valueOf = objArr;
            return this.getPadSub2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public int getScore() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((~System.identityHashCode(this)) | 259588718);
                    int c = defpackage.a.c(i | 239141440, 374, ((20447278 | i) * (-374)) + 311651315, 2139951470);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4988;
                    Fpnative.valueOf = objArr;
                    return this.PngjBadSignature;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[16]), (byte) (-bArr[31]), (byte) (-bArr[27]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[68];
            byte b2 = bArr[42];
            Object[] objArr4 = new Object[1];
            b(b, b2, (byte) (b2 | 73), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2139951470);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4988;
            Fpnative.valueOf = objArr;
            return this.PngjBadSignature;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public float getSpoofScore() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i = ~elapsedCpuTime;
                    int c = defpackage.a.c((~(elapsedCpuTime | (-50602497))) | (~(i | 737656530)) | (~((-549491777) | elapsedCpuTime)), 192, (((~(188164754 | i)) | 549491776) * (-384)) + ((137562258 | i) * (-192)) + 1796350335, 2119022426);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4914;
                    Fpnative.valueOf = objArr;
                    return this.PngjBadCrcException;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[16]), (byte) (-bArr[14]), bArr[3], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[42], (byte) (-bArr[98]), (byte) 121, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2119022426);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4914;
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

    public Map<Template, HashMap<TemplateSize, String>> getTemplates() {
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
                    int c = defpackage.a.c((~(identityHashCode | 352527903)) | (~(i | 146361376)), 950, (((~(i | 352527903)) | (~(identityHashCode | 146361376))) * (-950)) + ((((~((-146361377) | i)) | (~((-352527904) | identityHashCode))) * 1900) - 999523211), -1066077146);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4874;
                    Fpnative.valueOf = objArr;
                    return this.PngBadCharsetException;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[16]), (byte) (-bArr[14]), bArr[3], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[42], (byte) (-bArr[98]), (byte) 121, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1066077146);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4874;
            Fpnative.valueOf = objArr;
            return this.PngBadCharsetException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public int getWidth() {
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
                    int c = defpackage.a.c((~(identityHashCode | (-2575517))) | (~((~identityHashCode) | 496313763)), 979, ((identityHashCode | 496313763) * (-979)) + (((~((-2575517) | r5)) * 979) - 1462671356), -982905571);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4887;
                    Fpnative.valueOf = objArr;
                    return this.PngjOutputException;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[16]), (byte) (-bArr[14]), bArr[3], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[42], (byte) (-bArr[98]), (byte) 121, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -982905571);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4887;
            Fpnative.valueOf = objArr;
            return this.PngjOutputException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [boolean, int] */
    public void setScore(int i) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[]{r0 ^ (r0 << 5)}};
                    int c = defpackage.a.c((~((-471990320) | i)) | 16780560, 235, (((~((-477049520) | i)) | 21839760) * (-470)) + ((((~((~i) | (-477049520))) | 21839760) * (-235)) - 1683838140), -1759213173);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((long[]) objArr[0])[0] = j + 4857;
                    Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(906913570 * i4);
                    int i7 = ((((i5 | i6) << 1) - (i5 ^ i6)) - (~(-(i4 * 2067396202)))) - (-373014819);
                    int i8 = i7 >> 15;
                    int a = IdentyB.a(i8 & (-262143), i8 | (-262143), 131072, -1);
                    int i9 = (i7 & a) + (a | i7);
                    int i10 = i7 >> 21;
                    int i11 = -(IdentyB.e((i10 | (-4095)) << 1, i10 ^ (-4095), 2048, -1) ^ i9);
                    int i12 = ((i11 | 2) << 1) - (i11 ^ 2);
                    int i13 = i12 >> 17;
                    int i14 = (((i13 | (-65535)) << 1) - (i13 ^ (-65535))) / 32768;
                    int i15 = ((i14 | 1) << 1) - (i14 ^ 1);
                    this.PngjException = 2554 / (((-(((i15 | 1) << 1) - (i15 ^ 1))) & i12) * 1277);
                    this.PngjBadSignature = i;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[16]), (byte) (-bArr[14]), bArr[3], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[42], (byte) (-bArr[98]), (byte) 121, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1759213173);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4857;
            Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(906913570 * i42);
            int i72 = ((((i52 | i62) << 1) - (i52 ^ i62)) - (~(-(i42 * 2067396202)))) - (-373014819);
            int i82 = i72 >> 15;
            int a2 = IdentyB.a(i82 & (-262143), i82 | (-262143), 131072, -1);
            int i92 = (i72 & a2) + (a2 | i72);
            int i102 = i72 >> 21;
            int i112 = -(IdentyB.e((i102 | (-4095)) << 1, i102 ^ (-4095), 2048, -1) ^ i92);
            int i122 = ((i112 | 2) << 1) - (i112 ^ 2);
            int i132 = i122 >> 17;
            int i142 = (((i132 | (-65535)) << 1) - (i132 ^ (-65535))) / 32768;
            int i152 = ((i142 | 1) << 1) - (i142 ^ 1);
            this.PngjException = 2554 / (((-(((i152 | 1) << 1) - (i152 ^ 1))) & i122) * 1277);
            this.PngjBadSignature = i;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    public void setSpoofScore(float f) {
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
                    int c = defpackage.a.c((~(identityHashCode | (-402665917))) | (~(977089020 | i)) | (-1052622845), 140, (((~((-478199741) | i)) | 402665916) * (-280)) + ((identityHashCode | (-478199741)) * 140) + 604339911, 2006147757);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4895;
                    Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(1218664364 * i4);
                    int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                    int i8 = -(i4 * (-493310050));
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    int i10 = (i9 & (-1850128295)) + ((-1850128295) | i9);
                    int i11 = i10 >> 23;
                    int e = IdentyB.e((i11 | (-1023)) << 1, i11 ^ (-1023), ConstantsKt.MINIMUM_BLOCK_SIZE, -1);
                    int i12 = -(IdentyB.e(i10 >> 16, 131071, 65536, -1) ^ ((i10 ^ e) + ((e & i10) << 1)));
                    int i13 = (i12 & 6) + (i12 | 6);
                    int i14 = i13 >> 18;
                    int i15 = ((i14 & (-32767)) + (i14 | (-32767))) / 16384;
                    this.valueOf = 8532 / (((-(((i15 & 1) + (i15 | 1)) - (-1))) & i13) * 1422);
                    this.PngjBadCrcException = f;
                }
            }
            byte b = $$a[16];
            byte b2 = (byte) (-b);
            Object[] objArr3 = new Object[1];
            b(b2, (byte) (b2 | 22), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(r2[42], r2[19], r2[21], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2006147757);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4895;
            Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1218664364 * i42);
            int i72 = (i52 ^ i62) + ((i52 & i62) << 1);
            int i82 = -(i42 * (-493310050));
            int i92 = (i72 ^ i82) + ((i82 & i72) << 1);
            int i102 = (i92 & (-1850128295)) + ((-1850128295) | i92);
            int i112 = i102 >> 23;
            int e2 = IdentyB.e((i112 | (-1023)) << 1, i112 ^ (-1023), ConstantsKt.MINIMUM_BLOCK_SIZE, -1);
            int i122 = -(IdentyB.e(i102 >> 16, 131071, 65536, -1) ^ ((i102 ^ e2) + ((e2 & i102) << 1)));
            int i132 = (i122 & 6) + (i122 | 6);
            int i142 = i132 >> 18;
            int i152 = ((i142 & (-32767)) + (i142 | (-32767))) / 16384;
            this.valueOf = 8532 / (((-(((i152 & 1) + (i152 | 1)) - (-1))) & i132) * 1422);
            this.PngjBadCrcException = f;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(2:3|(14:5|6|7|8|9|10|(1:12)|13|(1:15)|16|(7:19|(1:21)|22|(2:25|23)|26|27|17)|28|29|30))|37|38|39|6|7|8|9|10|(0)|13|(0)|16|(1:17)|28|29|30) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(2:3|(14:5|6|7|8|9|10|(1:12)|13|(1:15)|16|(7:19|(1:21)|22|(2:25|23)|26|27|17)|28|29|30))|36|37|38|39|6|7|8|9|10|(0)|13|(0)|16|(1:17)|28|29|30) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01b9 A[Catch: Exception -> 0x024c, TryCatch #0 {Exception -> 0x024c, blocks: (B:10:0x0103, B:12:0x01b9, B:13:0x01c0, B:15:0x01cb, B:16:0x01da, B:17:0x01e9, B:19:0x01ef, B:21:0x01fd, B:22:0x0208, B:23:0x021b, B:25:0x0221, B:27:0x0239, B:29:0x0247), top: B:9:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01cb A[Catch: Exception -> 0x024c, TryCatch #0 {Exception -> 0x024c, blocks: (B:10:0x0103, B:12:0x01b9, B:13:0x01c0, B:15:0x01cb, B:16:0x01da, B:17:0x01e9, B:19:0x01ef, B:21:0x01fd, B:22:0x0208, B:23:0x021b, B:25:0x0221, B:27:0x0239, B:29:0x0247), top: B:9:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ef A[Catch: Exception -> 0x024c, TryCatch #0 {Exception -> 0x024c, blocks: (B:10:0x0103, B:12:0x01b9, B:13:0x01c0, B:15:0x01cb, B:16:0x01da, B:17:0x01e9, B:19:0x01ef, B:21:0x01fd, B:22:0x0208, B:23:0x021b, B:25:0x0221, B:27:0x0239, B:29:0x0247), top: B:9:0x0103 }] */
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
                    int i = (int) Runtime.getRuntime().totalMemory();
                    int c = defpackage.a.c((~(i | (-287649173))) | (~((-786538453) | i)) | 2166164, -69, (((~((-784372289) | i)) | (~((-285483009) | i))) * 69) + 1603391372, -954351567);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4939;
                    Fpnative.valueOf = objArr;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("date", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:s.SSS Z", context.getResources().getConfiguration().getLocales().get(0)).format(this.onErrorResponse));
                    jSONObject.put("captureTimeTaken", this.getAsHighestSecurityLevelReached);
                    jSONObject.put("overallTimeTaken", this.getQualityScore);
                    jSONObject.put("processingTimeTaken", this.getData);
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(1796795015 * i4);
                    int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                    int i8 = -(i4 * 1513746151);
                    int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                    int i10 = (i9 & (-741807407)) + ((-741807407) | i9);
                    int i11 = i10 >> 20;
                    int i12 = (((i11 ^ (-8191)) + ((i11 & (-8191)) << 1)) / ConstantsKt.DEFAULT_BLOCK_SIZE) + 1;
                    int i13 = -((((i10 | i12) << 1) - (i12 ^ i10)) ^ ((((i10 >> 18) - 32767) / 16384) + 1));
                    int i14 = ((i13 | 8) << 1) - (i13 ^ 8);
                    int i15 = i14 >> 16;
                    int i16 = (((i15 & (-131071)) + (i15 | (-131071))) / 65536) + 1;
                    jSONObject.put("27;0;1;hand".substring(100576 / (((-((i16 ^ 1) + ((i16 & 1) << 1))) & i14) * 1796)), this.getPadSub3);
                    jSONObject.put("finger", this.Attempt);
                    jSONObject.put("identy_quality", this.getPadSub2);
                    jSONObject.put("fingerprintQuality", this.Action);
                    jSONObject.put("height", this.values);
                    jSONObject.put("width", this.PngjOutputException);
                    jSONObject.put("bits_per_pixel", this.PngjInputException);
                    jSONObject.put("resolution", this.PngjExceptionInternal);
                    if (this.PngjException) {
                        jSONObject.put("score", this.PngjBadSignature);
                    }
                    jSONObject.put("nfiq_1", this.PngjPrematureEnding);
                    if (this.valueOf) {
                        jSONObject.put("spoof_score", this.PngjBadCrcException);
                        jSONObject.put("asHighestSecurityLevelReached", this.getScore);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : this.PngBadCharsetException.entrySet()) {
                        if (entry.equals(Template.WSQ)) {
                            jSONObject.put("wsq_compression", this.e1.toString());
                        }
                        HashMap hashMap = (HashMap) entry.getValue();
                        JSONObject jSONObject3 = new JSONObject();
                        for (Map.Entry entry2 : hashMap.entrySet()) {
                            jSONObject3.put(((TemplateSize) entry2.getKey()).toString(), entry2.getValue());
                        }
                        jSONObject2.put(((Template) entry.getKey()).toString(), jSONObject3);
                    }
                    jSONObject.put("templates", jSONObject2);
                    return jSONObject;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            b((byte) (-bArr[16]), (byte) (-bArr[14]), bArr[3], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(bArr[42], (byte) (-bArr[98]), (byte) 121, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 685210);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4939;
            Fpnative.valueOf = objArr;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("date", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:s.SSS Z", context.getResources().getConfiguration().getLocales().get(0)).format(this.onErrorResponse));
            jSONObject4.put("captureTimeTaken", this.getAsHighestSecurityLevelReached);
            jSONObject4.put("overallTimeTaken", this.getQualityScore);
            jSONObject4.put("processingTimeTaken", this.getData);
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1796795015 * i42);
            int i72 = ((i52 | i62) << 1) - (i52 ^ i62);
            int i82 = -(i42 * 1513746151);
            int i92 = ((i72 | i82) << 1) - (i82 ^ i72);
            int i102 = (i92 & (-741807407)) + ((-741807407) | i92);
            int i112 = i102 >> 20;
            int i122 = (((i112 ^ (-8191)) + ((i112 & (-8191)) << 1)) / ConstantsKt.DEFAULT_BLOCK_SIZE) + 1;
            int i132 = -((((i102 | i122) << 1) - (i122 ^ i102)) ^ ((((i102 >> 18) - 32767) / 16384) + 1));
            int i142 = ((i132 | 8) << 1) - (i132 ^ 8);
            int i152 = i142 >> 16;
            int i162 = (((i152 & (-131071)) + (i152 | (-131071))) / 65536) + 1;
            jSONObject4.put("27;0;1;hand".substring(100576 / (((-((i162 ^ 1) + ((i162 & 1) << 1))) & i142) * 1796)), this.getPadSub3);
            jSONObject4.put("finger", this.Attempt);
            jSONObject4.put("identy_quality", this.getPadSub2);
            jSONObject4.put("fingerprintQuality", this.Action);
            jSONObject4.put("height", this.values);
            jSONObject4.put("width", this.PngjOutputException);
            jSONObject4.put("bits_per_pixel", this.PngjInputException);
            jSONObject4.put("resolution", this.PngjExceptionInternal);
            if (this.PngjException) {
            }
            jSONObject4.put("nfiq_1", this.PngjPrematureEnding);
            if (this.valueOf) {
            }
            JSONObject jSONObject22 = new JSONObject();
            while (r1.hasNext()) {
            }
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
}
