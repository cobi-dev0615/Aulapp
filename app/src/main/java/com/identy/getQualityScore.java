package com.identy;

/* loaded from: classes2.dex */
public class getQualityScore {
    private int Action;
    public long PngjBadCrcException;
    public int PngjBadSignature;
    public int PngjException;
    public float PngjExceptionInternal;
    public double PngjInputException;
    public double PngjOutputException;
    public Object PngjPrematureEnding;
    public Object PngjUnsupportedException;
    private int e1;
    private final Object[] getPadSub3;
    public float valueOf;
    public long values;
    private final int[] a = new int[27];
    private final long[] PngBadCharsetException = new long[27];
    private final float[] onErrorResponse = new float[27];
    private final double[] getPadSub1 = new double[27];

    public getQualityScore(Object obj, Object obj2) {
        Object[] objArr = new Object[27];
        this.getPadSub3 = objArr;
        objArr[15] = obj;
        objArr[16] = obj2;
        this.e1 = 0;
        this.Action = -1;
    }

    public int PngjBadSignature(int i) {
        switch (i) {
            case 1:
                int i2 = this.e1 - this.PngjException;
                this.e1 = i2;
                this.Action = i2;
                return 0;
            case 2:
                Object[] objArr = this.getPadSub3;
                int i3 = this.Action;
                this.Action = i3 + 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.PngjUnsupportedException = obj;
                return 0;
            case 3:
                Object[] objArr2 = this.getPadSub3;
                int i4 = this.e1;
                int i5 = i4 + 1;
                this.e1 = i5;
                objArr2[i4] = objArr2[15];
                this.e1 = i4 + 2;
                objArr2[i5] = objArr2[16];
                return 0;
            case 4:
                int[] iArr = this.a;
                int i6 = this.e1;
                int i7 = i6 + 1;
                this.e1 = i7;
                iArr[i6] = 2;
                this.e1 = i6 + 2;
                iArr[i7] = 2;
                return 0;
            case 5:
                int i8 = this.e1;
                int i9 = i8 - 1;
                this.e1 = i9;
                int[] iArr2 = this.a;
                iArr2[i8 - 2] = iArr2[i8 - 2] % iArr2[i9];
                return 0;
            case 6:
                int i10 = this.e1 - 1;
                this.e1 = i10;
                this.getPadSub3[i10] = null;
                return 0;
            case 8:
                int[] iArr3 = this.a;
                int i11 = this.e1;
                this.e1 = i11 + 1;
                iArr3[i11] = this.PngjException;
            case 7:
                return 0;
            case 9:
                int[] iArr4 = this.a;
                int i12 = this.e1;
                this.e1 = i12 + 1;
                iArr4[i12] = 37;
                this.e1 = i12;
                iArr4[i12 - 1] = iArr4[i12 - 1] + iArr4[i12];
                this.e1 = i12 + 1;
                iArr4[i12] = iArr4[i12 - 1];
                return 0;
            case 10:
                int[] iArr5 = this.a;
                int i13 = this.e1;
                this.e1 = i13 + 1;
                iArr5[i13] = 128;
                this.e1 = i13;
                iArr5[i13 - 1] = iArr5[i13 - 1] % iArr5[i13];
                return 0;
            case 11:
                int[] iArr6 = this.a;
                int i14 = this.Action;
                this.Action = i14 + 1;
                this.PngjBadSignature = iArr6[i14];
                return 0;
            case 12:
                int[] iArr7 = this.a;
                int i15 = this.e1;
                this.e1 = i15 + 1;
                iArr7[i15] = 2;
                this.e1 = i15;
                iArr7[i15 - 1] = iArr7[i15 - 1] % iArr7[i15];
                return 0;
            case 13:
                int i16 = this.e1 - 1;
                this.e1 = i16;
                this.PngjBadSignature = this.a[i16] != 0 ? 0 : 1;
                return 0;
            case 14:
                int[] iArr8 = this.a;
                int i17 = this.e1;
                this.e1 = i17 + 1;
                iArr8[i17] = 111;
                this.e1 = i17;
                iArr8[i17 - 1] = iArr8[i17 - 1] + iArr8[i17];
                return 0;
            case 15:
                int[] iArr9 = this.a;
                int i18 = this.e1;
                int i19 = i18 + 1;
                this.e1 = i19;
                iArr9[i18] = iArr9[i18 - 1];
                this.e1 = i18 + 2;
                iArr9[i19] = 128;
                return 0;
            case 16:
                int i20 = this.e1 - 1;
                this.e1 = i20;
                this.PngjBadSignature = this.a[i20] == 0 ? 0 : 1;
                return 0;
            case 17:
                Object[] objArr3 = this.getPadSub3;
                int i21 = this.e1;
                Object obj2 = objArr3[i21 - 1];
                objArr3[i21 - 1] = null;
                this.PngjUnsupportedException = obj2;
                return 0;
            case 18:
                Object[] objArr4 = this.getPadSub3;
                int i22 = this.e1;
                this.e1 = i22 + 1;
                objArr4[i22] = null;
                int[] iArr10 = this.a;
                Object obj3 = objArr4[i22];
                objArr4[i22] = null;
                iArr10[i22] = ((int[]) obj3).length;
                this.e1 = i22;
                objArr4[i22] = null;
                return 0;
            case 19:
                int[] iArr11 = this.a;
                int i23 = this.e1 - 1;
                this.e1 = i23;
                this.PngjBadSignature = iArr11[i23];
                return 0;
            case 20:
                int[] iArr12 = this.a;
                int i24 = this.e1;
                this.e1 = i24 + 1;
                iArr12[i24] = 0;
                return 0;
            case 21:
                int[] iArr13 = this.a;
                int i25 = this.e1;
                this.e1 = i25 + 1;
                iArr13[i25] = 1;
                return 0;
            case 22:
                for (int i26 = this.e1 - 1; i26 >= 0; i26--) {
                    this.getPadSub3[i26] = null;
                }
                Object[] objArr5 = this.getPadSub3;
                this.e1 = 1;
                objArr5[0] = this.PngjPrematureEnding;
                return 0;
            case 23:
                Object[] objArr6 = this.getPadSub3;
                int i27 = this.e1;
                int i28 = i27 + 1;
                this.e1 = i28;
                objArr6[i27] = objArr6[15];
                this.e1 = i27 + 2;
                objArr6[i28] = objArr6[i27];
                return 0;
            case 24:
                Object[] objArr7 = this.getPadSub3;
                int i29 = this.e1;
                this.e1 = i29 + 1;
                objArr7[i29] = objArr7[16];
                return 0;
            case 25:
                Object[] objArr8 = this.getPadSub3;
                int i30 = this.e1;
                int i31 = i30 + 1;
                this.e1 = i31;
                objArr8[i30] = objArr8[15];
                int i32 = i30 + 2;
                this.e1 = i32;
                objArr8[i31] = objArr8[i30];
                this.e1 = i30 + 3;
                objArr8[i32] = objArr8[i30 + 1];
                return 0;
            case 26:
                Object[] objArr9 = this.getPadSub3;
                int i33 = this.e1;
                this.e1 = i33 + 1;
                objArr9[i33] = this.PngjPrematureEnding;
                return 0;
            case 27:
                int i34 = this.e1 - 1;
                this.e1 = i34;
                Object[] objArr10 = this.getPadSub3;
                Object obj4 = objArr10[i34];
                objArr10[i34] = null;
                objArr10[16] = obj4;
                return 0;
            case 28:
                int i35 = this.e1 - 1;
                this.e1 = i35;
                int[] iArr14 = this.a;
                iArr14[17] = iArr14[i35];
                return 0;
            case 29:
                int i36 = this.e1 - 1;
                this.e1 = i36;
                int[] iArr15 = this.a;
                iArr15[18] = iArr15[i36];
                return 0;
            case 30:
                Object[] objArr11 = this.getPadSub3;
                int i37 = this.e1;
                this.e1 = i37 + 1;
                objArr11[i37] = objArr11[15];
                return 0;
            case 31:
                int[] iArr16 = this.a;
                int i38 = this.e1;
                this.e1 = i38 + 1;
                iArr16[i38] = iArr16[17];
                return 0;
            case 32:
                int[] iArr17 = this.a;
                int i39 = this.e1;
                this.e1 = i39 + 1;
                iArr17[i39] = iArr17[18];
                return 0;
            case 33:
                int[] iArr18 = this.a;
                int i40 = this.e1;
                this.e1 = i40 + 1;
                iArr18[i40] = 2;
                return 0;
            case 34:
                int[] iArr19 = this.a;
                int i41 = this.e1;
                this.e1 = i41 + 1;
                iArr19[i41] = 45;
                this.e1 = i41;
                iArr19[i41 - 1] = iArr19[i41 - 1] + iArr19[i41];
                this.e1 = i41 + 1;
                iArr19[i41] = iArr19[i41 - 1];
                return 0;
            case 35:
                int[] iArr20 = this.a;
                int i42 = this.e1;
                this.e1 = i42 + 1;
                iArr20[i42] = 128;
                return 0;
            default:
                return i;
        }
    }
}
