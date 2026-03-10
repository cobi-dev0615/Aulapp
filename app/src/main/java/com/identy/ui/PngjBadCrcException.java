package com.identy.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.d.e.a.values;
import com.identy.Fpnative;
import com.identy.R;
import com.identy.IdentyB;
import com.identy.enums.Hand;
import defpackage.a;
import java.lang.reflect.Method;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class PngjBadCrcException extends View {
    private static final byte[] $$a = {67, 0, -97, -53, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
    private static final int $$b = 109;
    public boolean PngjBadCrcException;
    public boolean PngjBadSignature;
    public int PngjException;
    private final Paint PngjExceptionInternal;
    public double PngjInputException;
    private Handler PngjOutputException;
    private Runnable PngjPrematureEnding;
    private int PngjUnsupportedException;
    private double e1;
    private double onErrorResponse;
    public int valueOf;
    public boolean values;

    public class PngjException implements Runnable {
        public static int PngjBadSignature;
        public static int values;

        public PngjException() {
        }

        public static int valueOf() {
            int i = values;
            int i2 = i % 6982922;
            values = i + 1;
            if (i2 != 0) {
                return PngjBadSignature;
            }
            int uptimeMillis = (int) SystemClock.uptimeMillis();
            PngjBadSignature = uptimeMillis;
            return uptimeMillis;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PngjBadCrcException pngjBadCrcException = PngjBadCrcException.this;
            double d = pngjBadCrcException.valueOf;
            double d2 = d / pngjBadCrcException.PngjInputException;
            int i = (int) (d - d2);
            if (pngjBadCrcException.PngjBadSignature) {
                int i2 = pngjBadCrcException.PngjException;
                int i3 = i2 + 4;
                pngjBadCrcException.PngjException = i3;
                if (i3 >= i) {
                    pngjBadCrcException.PngjBadSignature = false;
                } else if (i3 >= i) {
                    pngjBadCrcException.PngjException = i2;
                    if (i2 < 0) {
                        pngjBadCrcException.PngjException = (int) d2;
                        pngjBadCrcException.PngjBadSignature = true;
                    }
                }
                pngjBadCrcException.invalidate();
                return;
            }
            int i4 = pngjBadCrcException.PngjException;
            int i5 = i4 - 4;
            pngjBadCrcException.PngjException = i5;
            if (i5 < d2) {
                pngjBadCrcException.PngjBadSignature = true;
            } else if (i5 >= i) {
                pngjBadCrcException.PngjException = i4;
                if (i4 < 0) {
                    pngjBadCrcException.PngjException = i;
                    pngjBadCrcException.PngjBadSignature = true;
                }
            }
            pngjBadCrcException.invalidate();
        }
    }

    public PngjBadCrcException(Context context) {
        super(context);
        this.PngjExceptionInternal = new Paint();
        this.PngjException = 0;
        this.values = false;
        this.PngjBadCrcException = false;
        this.PngjBadSignature = true;
        this.PngjInputException = 8.0d;
        PngjBadSignature();
    }

    private void PngjBadSignature() {
        this.PngjExceptionInternal.setColor(getResources().getColor(R.color.id_scanning_bar));
        this.PngjExceptionInternal.setStrokeWidth(6.0f);
        this.PngjOutputException = new Handler();
        this.PngjPrematureEnding = new PngjException();
    }

    private static void a(short s, int i, int i2, Object[] objArr) {
        int i3 = s + 4;
        byte[] bArr = $$a;
        int i4 = 99 - (i2 * 19);
        byte[] bArr2 = new byte[44 - i];
        int i5 = 43 - i;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i4 + i5) - 13;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3++;
                i4 = (i4 + bArr[i3]) - 13;
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.PngjUnsupportedException = canvas.getHeight();
        this.valueOf = canvas.getWidth();
        int i = this.PngjException;
        if (this.PngjBadCrcException) {
            canvas.drawLine(i, (float) (canvas.getHeight() / this.onErrorResponse), this.PngjException, (float) (canvas.getHeight() - (canvas.getHeight() / this.e1)), this.PngjExceptionInternal);
        }
        if (this.values) {
            this.PngjOutputException.postDelayed(this.PngjPrematureEnding, 10L);
        }
    }

    public final void PngjBadSignature(Hand hand, double d, double d2, double d3) {
        this.PngjInputException = d;
        this.onErrorResponse = d2;
        this.e1 = d3;
        this.values = true;
        this.PngjBadCrcException = true;
        if (hand.equals(Hand.LEFT)) {
            double d4 = this.valueOf;
            this.PngjException = (int) (d4 - (d4 / this.PngjInputException));
            this.PngjBadSignature = false;
        } else {
            this.PngjException = (int) (this.valueOf / this.PngjInputException);
            this.PngjBadSignature = true;
        }
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r12v31, types: [boolean, int] */
    public PngjBadCrcException(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = defpackage.a.a();
                    int c = defpackage.a.c((~(a | 267287048)) | (~((-231602232) | a)) | 98359, 407, (((~(231602231 | a)) | (~((~a) | (-267287049))) | 98359) * 407) + (((35783176 | 0) * (-814)) - 1930086891), -2068837805);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4947;
                    Fpnative.valueOf = objArr;
                    this.PngjExceptionInternal = new Paint();
                    this.PngjException = 0;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(1461096440 * i3);
                    int i6 = ((((i4 | i5) << 1) - (i4 ^ i5)) - (~(-(i3 * (-849330270))))) - 1;
                    int i7 = (i6 & (-694904279)) + ((-694904279) | i6);
                    int i8 = i7 >> 28;
                    int i9 = ((i8 ^ (-31)) + ((i8 & (-31)) << 1)) / 16;
                    int i10 = i9 ^ 1;
                    int i11 = ((i9 | 1) << 1) - i10;
                    int i12 = -((((i7 | i11) << 1) - (i11 ^ i7)) ^ (i10 + ((i9 & 1) << 1)));
                    int i13 = ((i12 | 5) << 1) - (i12 ^ 5);
                    int i14 = i13 >> 18;
                    int e = IdentyB.e((i14 | (-32767)) << 1, i14 ^ (-32767), 16384, -1);
                    this.values = (0 / (((-((e ^ 1) + ((e & 1) << 1))) & i13) * 555)) != 0;
                    this.PngjBadCrcException = false;
                    this.PngjBadSignature = true;
                    this.PngjInputException = 8.0d;
                    PngjBadSignature();
                }
            }
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[77]);
            byte b2 = bArr[1];
            Object[] objArr3 = new Object[1];
            a(b, b2, b2, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[88], bArr[4], bArr[77], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2068837805);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4947;
            Fpnative.valueOf = objArr;
            this.PngjExceptionInternal = new Paint();
            this.PngjException = 0;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(1461096440 * i32);
            int i62 = ((((i42 | i52) << 1) - (i42 ^ i52)) - (~(-(i32 * (-849330270))))) - 1;
            int i72 = (i62 & (-694904279)) + ((-694904279) | i62);
            int i82 = i72 >> 28;
            int i92 = ((i82 ^ (-31)) + ((i82 & (-31)) << 1)) / 16;
            int i102 = i92 ^ 1;
            int i112 = ((i92 | 1) << 1) - i102;
            int i122 = -((((i72 | i112) << 1) - (i112 ^ i72)) ^ (i102 + ((i92 & 1) << 1)));
            int i132 = ((i122 | 5) << 1) - (i122 ^ 5);
            int i142 = i132 >> 18;
            int e2 = IdentyB.e((i142 | (-32767)) << 1, i142 ^ (-32767), 16384, -1);
            this.values = (0 / (((-((e2 ^ 1) + ((e2 & 1) << 1))) & i132) * 555)) != 0;
            this.PngjBadCrcException = false;
            this.PngjBadSignature = true;
            this.PngjInputException = 8.0d;
            PngjBadSignature();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw new RuntimeException(cause);
            }
            throw new RuntimeException(th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r11v29, types: [boolean, int] */
    public PngjBadCrcException(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
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
                    int c = defpackage.a.c(myPid | (-537692161), 591, (((~((~myPid) | (-537692161))) | 38802880) * (-591)) + 1905042126, 469323715);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4897;
                    Fpnative.valueOf = objArr;
                    this.PngjExceptionInternal = new Paint();
                    this.PngjException = 0;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = ((i4 * i4) - (~(-(1149407274 * i4)))) - 1;
                    int i6 = -(i4 * 974695366);
                    int i7 = (((i5 | i6) << 1) - (i6 ^ i5)) - (-2024415296);
                    int i8 = i7 >> 29;
                    int i9 = -(((i7 - (~IdentyB.e(i7 >> 20, 8191, ConstantsKt.DEFAULT_BLOCK_SIZE, -1))) - 1) ^ IdentyB.e((i8 | (-15)) << 1, i8 ^ (-15), 8, -1));
                    int i10 = (i9 ^ 1) + ((i9 & 1) << 1);
                    int i11 = i10 >> 16;
                    int i12 = (((i11 | (-131071)) << 1) - (i11 ^ (-131071))) / 65536;
                    this.values = (0 / (((-((((i12 | 1) << 1) - (i12 ^ 1)) - (-1))) & i10) * 661)) != 0;
                    this.PngjBadCrcException = false;
                    this.PngjBadSignature = true;
                    this.PngjInputException = 8.0d;
                    PngjBadSignature();
                }
            }
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[54], bArr[59], bArr[1], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((byte) 88, (byte) 28, bArr[77], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 469323715);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4897;
            Fpnative.valueOf = objArr;
            this.PngjExceptionInternal = new Paint();
            this.PngjException = 0;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = ((i42 * i42) - (~(-(1149407274 * i42)))) - 1;
            int i62 = -(i42 * 974695366);
            int i72 = (((i52 | i62) << 1) - (i62 ^ i52)) - (-2024415296);
            int i82 = i72 >> 29;
            int i92 = -(((i72 - (~IdentyB.e(i72 >> 20, 8191, ConstantsKt.DEFAULT_BLOCK_SIZE, -1))) - 1) ^ IdentyB.e((i82 | (-15)) << 1, i82 ^ (-15), 8, -1));
            int i102 = (i92 ^ 1) + ((i92 & 1) << 1);
            int i112 = i102 >> 16;
            int i122 = (((i112 | (-131071)) << 1) - (i112 ^ (-131071))) / 65536;
            this.values = (0 / (((-((((i122 | 1) << 1) - (i122 ^ 1)) - (-1))) & i102) * 661)) != 0;
            this.PngjBadCrcException = false;
            this.PngjBadSignature = true;
            this.PngjInputException = 8.0d;
            PngjBadSignature();
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }
}
