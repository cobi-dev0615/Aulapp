package com.identy.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.Process;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.d.e.a.values;
import com.identy.Fpnative;
import defpackage.a;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class PlayGifView extends View {
    private static final byte[] $$a = {34, -96, 112, -1, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12};
    private static final int $$b = 224;
    private int a;
    private Movie b;
    private long c;
    private int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayGifView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i = ~startElapsedRealtime;
                    int c = a.c((~(startElapsedRealtime | 498757631)) | (~((-159541227) | i)) | 131648, 676, (((~(339348053 | i)) | 159409578) * 676) + (((-159409579) | startElapsedRealtime) * (-676)) + 1789220043, -1379038954);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4948;
                    Fpnative.valueOf = objArr;
                    this.c = 0L;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(1710627967 * i4);
                    int i7 = (((i5 & i6) + (i5 | i6)) - (~(-(i4 * 1796730569)))) - 1;
                    int i8 = ((i7 | 857198864) << 1) - (857198864 ^ i7);
                    int i9 = i8 >> 19;
                    int i10 = ((i9 & (-16383)) + (i9 | (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
                    int i12 = (i8 ^ i11) + ((i11 & i8) << 1);
                    int i13 = i8 >> 28;
                    int i14 = (((i13 | (-31)) << 1) - (i13 ^ (-31))) / 16;
                    int i15 = -((((i14 | 1) << 1) - (i14 ^ 1)) ^ i12);
                    int i16 = (i15 ^ 3) + ((i15 & 3) << 1);
                    int i17 = ((i16 >> 18) - 32767) / 16384;
                    int i18 = ((i17 | 1) << 1) - (i17 ^ 1);
                    this.d = 0 / (((-((i18 ^ 1) + ((i18 & 1) << 1))) & i16) * 773);
                    setLayerType(1, null);
                }
            }
            byte[] bArr = $$a;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            e(bArr[78], bArr[34], bArr[52], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            e(bArr[100], bArr[50], bArr[32], objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1379038954);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4948;
            Fpnative.valueOf = objArr;
            this.c = 0L;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1710627967 * i42);
            int i72 = (((i52 & i62) + (i52 | i62)) - (~(-(i42 * 1796730569)))) - 1;
            int i82 = ((i72 | 857198864) << 1) - (857198864 ^ i72);
            int i92 = i82 >> 19;
            int i102 = ((i92 & (-16383)) + (i92 | (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i112 = ((i102 | 1) << 1) - (i102 ^ 1);
            int i122 = (i82 ^ i112) + ((i112 & i82) << 1);
            int i132 = i82 >> 28;
            int i142 = (((i132 | (-31)) << 1) - (i132 ^ (-31))) / 16;
            int i152 = -((((i142 | 1) << 1) - (i142 ^ 1)) ^ i122);
            int i162 = (i152 ^ 3) + ((i152 & 3) << 1);
            int i172 = ((i162 >> 18) - 32767) / 16384;
            int i182 = ((i172 | 1) << 1) - (i172 ^ 1);
            this.d = 0 / (((-((i182 ^ 1) + ((i182 & 1) << 1))) & i162) * 773);
            setLayerType(1, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private void a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.c == 0) {
            this.c = uptimeMillis;
        }
        int duration = this.b.duration();
        if (duration == 0) {
            duration = 1000;
        }
        this.d = (int) ((uptimeMillis - this.c) % duration);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = b + 4;
        byte[] bArr = $$a;
        int i4 = (s * 19) + 80;
        byte[] bArr2 = new byte[44 - i];
        int i5 = 43 - i;
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i4 = i5;
            i3++;
            i4 = (i4 + i6) - 13;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i3++;
            i4 = (i4 + i6) - 13;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    @Override // android.view.View
    public void invalidate() {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = a.c(identityHashCode | (-776311489), 397, (((~(i | (-164945004))) | (~((-663834284) | i)) | 26233899) * (-397)) + 1281828411, 1410978615);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4988;
                    Fpnative.valueOf = objArr;
                    super.invalidate();
                }
            }
            byte[] bArr = $$a;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            e(bArr[93], bArr[29], bArr[52], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            e(bArr[27], (byte) (bArr[39] + 1), bArr[78], objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1410978615);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4988;
            Fpnative.valueOf = objArr;
            super.invalidate();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~System.identityHashCode(this);
                    int c = a.c(i | 263975423, -828, (((~(i | 263975423)) | 234913856) * (-828)) + 1262351875, 378218866);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4993;
                    Fpnative.valueOf = objArr;
                    if (this.b != null) {
                        a(canvas);
                        return;
                    }
                    a();
                    a(canvas);
                    invalidate();
                    return;
                }
            }
            byte[] bArr = $$a;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            e((byte) 79, bArr[78], bArr[52], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            e((byte) 122, bArr[4], bArr[78], objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -93462158);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4993;
            Fpnative.valueOf = objArr;
            if (this.b != null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i3 = ~((-577) | elapsedRealtime);
                    int i4 = ~elapsedRealtime;
                    int c = a.c((~(elapsedRealtime | (-220743833))) | (~((-577) | i4)) | (~((-278144296) | elapsedRealtime)), 920, (((~((-278144872) | i4)) | 576) * 920) + ((i3 | (~(i4 | (-220743833)))) * 920) + 1082253271, -1203002137);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4992;
                    Fpnative.valueOf = objArr;
                    if (this.b != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    float width = r0.width() / this.b.height();
                    View.MeasureSpec.getMode(i2);
                    int size = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension((int) (size * width), size);
                    return;
                }
            }
            byte[] bArr = $$a;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            e(bArr[78], bArr[34], bArr[52], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            e(bArr[100], bArr[50], bArr[32], objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1203002137);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4992;
            Fpnative.valueOf = objArr;
            if (this.b != null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public void setImageResource(int i) {
        java.lang.Object[] objArr;
        long j;
        java.lang.Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new java.lang.Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i2 = ~System.identityHashCode(this);
                    int c = a.c((~(i2 | (-295595750))) | 203293530, 160, (((~(i2 | 203293530)) | (-496922624)) * (-160)) + 133454335, 276330771);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5010;
                    Fpnative.valueOf = objArr;
                    this.a = i;
                    this.b = Movie.decodeStream(getResources().openRawResource(this.a));
                    requestLayout();
                }
            }
            byte[] bArr = $$a;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            e(bArr[93], bArr[29], bArr[52], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            e(bArr[27], (byte) (bArr[39] + 1), bArr[78], objArr4);
            objArr = (java.lang.Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 276330771);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5010;
            Fpnative.valueOf = objArr;
            this.a = i;
            this.b = Movie.decodeStream(getResources().openRawResource(this.a));
            requestLayout();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private void a(Canvas canvas) {
        canvas.scale(getWidth() / this.b.width(), getHeight() / this.b.height());
        this.b.setTime(this.d);
        this.b.draw(canvas, 0.0f, 0.0f);
        canvas.restore();
    }
}
