package com.identy.ex;

import android.os.Process;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.IdentyB;
import defpackage.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class RResult {
    private static final byte[] $$a = {49, 26, -54, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12};
    private static final int $$b = 106;
    public Long binarizedimage;
    public byte[] debugData;
    public boolean done;
    public PreCaptureOutput preCaptureOutput;
    public float quality;
    public boolean readyForCapture;
    public float score;
    public boolean sideDone;
    public int sideInt;
    public int statusint;

    /* JADX WARN: Type inference failed for: r0v37, types: [boolean, int] */
    public RResult() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((int) Runtime.getRuntime().freeMemory());
                    int c = a.c((~(i | (-2228512))) | 295274656, 241, (((~((-102921568) | i)) | 100693056) * (-241)) + 849363935, 66937645);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5022;
                    Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(668418059 * i4);
                    int i7 = (i5 & i6) + (i5 | i6);
                    int i8 = -(i4 * (-882423743));
                    int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                    int i10 = ((i9 | (-1520945756)) << 1) - ((-1520945756) ^ i9);
                    int i11 = i10 >> 27;
                    int e = IdentyB.e((i11 | (-63)) << 1, i11 ^ (-63), 32, -1);
                    int i12 = ((i10 | e) << 1) - (e ^ i10);
                    int i13 = ((i10 >> 25) - 255) / 128;
                    int i14 = -(i12 ^ ((i13 & 1) + (i13 | 1)));
                    int i15 = (i14 & 6) + (i14 | 6);
                    int i16 = i15 >> 18;
                    int i17 = ((i16 & (-32767)) + (i16 | (-32767))) / 16384;
                    int i18 = (i17 & 1) + (i17 | 1);
                    this.done = 0 / (((-((i18 & 1) + (i18 | 1))) & i15) * 1478);
                    this.readyForCapture = false;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[16];
            Object[] objArr3 = new Object[1];
            a((byte) (-b), (byte) (-bArr[72]), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[68];
            byte b3 = bArr[21];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b3 + 1), b3, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 66937645);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5022;
            Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(668418059 * i42);
            int i72 = (i52 & i62) + (i52 | i62);
            int i82 = -(i42 * (-882423743));
            int i92 = ((i72 | i82) << 1) - (i82 ^ i72);
            int i102 = ((i92 | (-1520945756)) << 1) - ((-1520945756) ^ i92);
            int i112 = i102 >> 27;
            int e2 = IdentyB.e((i112 | (-63)) << 1, i112 ^ (-63), 32, -1);
            int i122 = ((i102 | e2) << 1) - (e2 ^ i102);
            int i132 = ((i102 >> 25) - 255) / 128;
            int i142 = -(i122 ^ ((i132 & 1) + (i132 | 1)));
            int i152 = (i142 & 6) + (i142 | 6);
            int i162 = i152 >> 18;
            int i172 = ((i162 & (-32767)) + (i162 | (-32767))) / 16384;
            int i182 = (i172 & 1) + (i172 | 1);
            this.done = 0 / (((-((i182 & 1) + (i182 | 1))) & i152) * 1478);
            this.readyForCapture = false;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 44 - s2;
        int i5 = 118 - (s * 19);
        byte[] bArr = $$a;
        int i6 = i + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            i5 = i4;
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i6;
            i5 = (i5 + (-i6)) - 13;
            i6 = i8;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            int i9 = i6 + 1;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i9];
            byte[] bArr4 = bArr;
            i8 = i9;
            i6 = b;
            i7 = i3;
            bArr3 = bArr4;
            i5 = (i5 + (-i6)) - 13;
            i6 = i8;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            int i92 = i6 + 1;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i3 = i2 + 1;
            int i922 = i6 + 1;
            if (i3 == i4) {
            }
        }
    }

    public Long getBinarizedimage() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int c = a.c((~(maxMemory | (-411058723))) | 16986141, 130, ((~((~maxMemory) | (-411058723))) * 130) + 687631937, 194555258);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5000;
                    Fpnative.valueOf = objArr;
                    return this.binarizedimage;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[16]);
            byte b2 = bArr[42];
            Object[] objArr3 = new Object[1];
            a(b, b2, (byte) (b2 | 78), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[68];
            byte b4 = (byte) (-bArr[4]);
            Object[] objArr4 = new Object[1];
            a(b3, b4, (byte) (b4 | 96), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 194555258);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5000;
            Fpnative.valueOf = objArr;
            return this.binarizedimage;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public PreCaptureOutput getPreCaptureOutput() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = a.a();
                    int c = a.c((~(a | (-283734264))) | (~((-782623544) | a)) | 10575927, -69, (((~((-772047617) | a)) | (~((-273158337) | a))) * 69) + 1063133930, 549049084);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4854;
                    Fpnative.valueOf = objArr;
                    return this.preCaptureOutput;
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[16];
            Object[] objArr3 = new Object[1];
            a((byte) (-b), (byte) (-bArr[72]), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[68];
            byte b3 = bArr[21];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b3 + 1), b3, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 383554772);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4854;
            Fpnative.valueOf = objArr;
            return this.preCaptureOutput;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public float getQuality() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i = ~(904764020 | startElapsedRealtime);
                    int c = a.c(~((~startElapsedRealtime) | 904764020), 476, (i * 952) + ((270534708 | i) * (-476)) + 1595335803, -580162808);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4924;
                    Fpnative.valueOf = objArr;
                    return this.quality;
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[16]);
            byte b2 = bArr[42];
            Object[] objArr3 = new Object[1];
            a(b, b2, (byte) (b2 | 78), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[68];
            byte b4 = (byte) (-bArr[4]);
            Object[] objArr4 = new Object[1];
            a(b3, b4, (byte) (b4 | 96), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -580162808);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4924;
            Fpnative.valueOf = objArr;
            return this.quality;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public SIDE getSide() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i = ~freeMemory;
                    int i2 = ~((-218143745) | i);
                    int i3 = ~((-280745536) | freeMemory);
                    int c = a.c((~(freeMemory | (-218143745))) | (~(i | 218143744)), 575, ((i3 | (~(280745535 | i))) * (-575)) + ((i2 | i3) * 1150) + 1400362686, -1016795790);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4925;
                    Fpnative.valueOf = objArr;
                    return SIDE.valuesCustom()[this.sideInt];
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[16]);
            byte b2 = bArr[42];
            Object[] objArr3 = new Object[1];
            a(b, b2, (byte) (b2 | 78), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b3 = bArr[68];
            byte b4 = (byte) (-bArr[4]);
            Object[] objArr4 = new Object[1];
            a(b3, b4, (byte) (b4 | 96), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1016795790);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4925;
            Fpnative.valueOf = objArr;
            return SIDE.valuesCustom()[this.sideInt];
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public STATUS getStatus() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = a.c((~((~((int) Runtime.getRuntime().maxMemory())) | (-742527))) | 498146753, 160, (((~(r0 | 498146753)) | (-498818560)) * (-160)) - 101770849, 200559911);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4942;
                    Fpnative.valueOf = objArr;
                    return STATUS.valuesCustom()[this.statusint];
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[16];
            Object[] objArr3 = new Object[1];
            a((byte) (-b), (byte) (-bArr[72]), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[68];
            byte b3 = bArr[21];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b3 + 1), b3, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 200559911);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4942;
            Fpnative.valueOf = objArr;
            return STATUS.valuesCustom()[this.statusint];
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean isDone() {
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
                    int c = a.c((~(204528972 | i)) | 498813375, 764, (((~(i | 294360307)) | 204491020) * (-1528)) + (((r5 | 294360307) * 764) - 965749081), -1839591171);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4963;
                    Fpnative.valueOf = objArr;
                    return this.done;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) (-bArr[16]), (byte) (-bArr[77]), (byte) (-bArr[27]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[42], (byte) (-bArr[14]), (byte) (bArr[109] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1839591171);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4963;
            Fpnative.valueOf = objArr;
            return this.done;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean isReadyForCapture() {
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
                    int c = a.c((~(identityHashCode | 366633304)) | 305689023, 70, ((~(402289151 | identityHashCode)) * 70) + ((((~(132255975 | identityHashCode)) | 270033176) * (-140)) - 274566875), 193037433);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5011;
                    Fpnative.valueOf = objArr;
                    return this.readyForCapture;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) (-bArr[16]), (byte) (-bArr[77]), (byte) (-bArr[27]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[42], (byte) (-bArr[14]), (byte) (bArr[109] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 193037433);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5011;
            Fpnative.valueOf = objArr;
            return this.readyForCapture;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean isSideDone() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = a.a();
                    int c = a.c((~(a | 93782751)) | (~(405106528 | a)) | (-498561024), -1444, (((~a) | (-498232768)) * 1444) + 1078082705, 137770996);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4852;
                    Fpnative.valueOf = objArr;
                    return this.sideDone;
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) (-bArr[16]), (byte) (-bArr[77]), (byte) (-bArr[27]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[42], (byte) (-bArr[14]), (byte) (bArr[109] + 1), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1190966086);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4852;
            Fpnative.valueOf = objArr;
            return this.sideDone;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
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
                    int c = a.c((~(identityHashCode | (-11534399))) | (~((~identityHashCode) | (-407553))) | (~((-486539778) | identityHashCode)), 867, (((~((-486947330) | identityHashCode)) | 407552 | (~((-11941951) | identityHashCode))) * (-1734)) + ((((~((-486947330) | r6)) | (~((-11941951) | r6))) * (-867)) - 755802724), 158222991);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4970;
                    Fpnative.valueOf = objArr;
                    StringBuilder sb = new StringBuilder("RResult{ sideInt=");
                    sb.append(getSide());
                    sb.append(", statusint=");
                    sb.append(getStatus());
                    sb.append(", done=");
                    sb.append(this.done);
                    sb.append(", readyForCapture=");
                    sb.append(this.readyForCapture);
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(1940416269 * i3);
                    int i6 = (i4 & i5) + (i4 | i5);
                    int i7 = -(i3 * 1510950369);
                    int i8 = (i6 & i7) + (i7 | i6);
                    int i9 = (i8 & 2001021777) + (2001021777 | i8);
                    int i10 = i9 >> 25;
                    int e = IdentyB.e((i10 | (-255)) << 1, i10 ^ (-255), 128, -1);
                    int i11 = (i9 ^ e) + ((e & i9) << 1);
                    int i12 = i9 >> 21;
                    int i13 = ((i12 & (-4095)) + (i12 | (-4095))) / 2048;
                    int i14 = -(((i13 & 1) + (i13 | 1)) ^ i11);
                    int i15 = (i14 & 4) + (i14 | 4);
                    int i16 = i15 >> 15;
                    int i17 = ((i16 & (-262143)) + (i16 | (-262143))) / 131072;
                    sb.append("5,13,0,14,, binarizedimage=".substring(2200 / (((-(((i17 ^ 1) + ((i17 & 1) << 1)) - (-1))) & i15) * 55)));
                    sb.append(this.binarizedimage);
                    sb.append(", score=");
                    sb.append(this.score);
                    sb.append(", precaptureerror =");
                    sb.append(!getStatus().equals(STATUS.PRECAPTURE_ERROR) ? this.preCaptureOutput.getError() : "none");
                    sb.append(", debugData=");
                    sb.append(new String(this.debugData));
                    sb.append('}');
                    return sb.toString();
                }
            }
            byte[] bArr = $$a;
            byte b = bArr[16];
            Object[] objArr3 = new Object[1];
            a((byte) (-b), (byte) (-bArr[72]), b, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b2 = bArr[68];
            byte b3 = bArr[21];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b3 + 1), b3, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 158222991);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4970;
            Fpnative.valueOf = objArr;
            StringBuilder sb2 = new StringBuilder("RResult{ sideInt=");
            sb2.append(getSide());
            sb2.append(", statusint=");
            sb2.append(getStatus());
            sb2.append(", done=");
            sb2.append(this.done);
            sb2.append(", readyForCapture=");
            sb2.append(this.readyForCapture);
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(1940416269 * i32);
            int i62 = (i42 & i52) + (i42 | i52);
            int i72 = -(i32 * 1510950369);
            int i82 = (i62 & i72) + (i72 | i62);
            int i92 = (i82 & 2001021777) + (2001021777 | i82);
            int i102 = i92 >> 25;
            int e2 = IdentyB.e((i102 | (-255)) << 1, i102 ^ (-255), 128, -1);
            int i112 = (i92 ^ e2) + ((e2 & i92) << 1);
            int i122 = i92 >> 21;
            int i132 = ((i122 & (-4095)) + (i122 | (-4095))) / 2048;
            int i142 = -(((i132 & 1) + (i132 | 1)) ^ i112);
            int i152 = (i142 & 4) + (i142 | 4);
            int i162 = i152 >> 15;
            int i172 = ((i162 & (-262143)) + (i162 | (-262143))) / 131072;
            sb2.append("5,13,0,14,, binarizedimage=".substring(2200 / (((-(((i172 ^ 1) + ((i172 & 1) << 1)) - (-1))) & i152) * 55)));
            sb2.append(this.binarizedimage);
            sb2.append(", score=");
            sb2.append(this.score);
            sb2.append(", precaptureerror =");
            sb2.append(!getStatus().equals(STATUS.PRECAPTURE_ERROR) ? this.preCaptureOutput.getError() : "none");
            sb2.append(", debugData=");
            sb2.append(new String(this.debugData));
            sb2.append('}');
            return sb2.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
