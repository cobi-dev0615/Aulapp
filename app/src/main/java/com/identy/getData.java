package com.identy;

/* loaded from: classes2.dex */
public class getData {
    public long PngjBadCrcException;
    public float PngjBadSignature;
    public int PngjException;
    public double PngjExceptionInternal;
    public Object PngjInputException;
    public float PngjOutputException;
    public Object PngjPrematureEnding;
    public double PngjUnsupportedException;
    private int a;
    private int e1;
    private final Object[] getPadSub3;
    public int valueOf;
    public long values;
    private final int[] Action = new int[28];
    private final long[] onErrorResponse = new long[28];
    private final float[] PngBadCharsetException = new float[28];
    private final double[] getAsHighestSecurityLevelReached = new double[28];

    public getData(Object obj, Object obj2) {
        Object[] objArr = new Object[28];
        this.getPadSub3 = objArr;
        objArr[15] = obj;
        objArr[16] = obj2;
        this.e1 = 0;
        this.a = -1;
    }

    public int PngjException(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.getPadSub3;
                int i2 = this.e1;
                this.e1 = i2 + 1;
                objArr[i2] = objArr[15];
                return 0;
            case 2:
                int i3 = this.e1 - this.valueOf;
                this.e1 = i3;
                this.a = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.getPadSub3;
                int i4 = this.a;
                this.a = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.PngjInputException = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.getPadSub3;
                int i5 = this.e1;
                this.e1 = i5 + 1;
                objArr3[i5] = objArr3[16];
                return 0;
            case 5:
                int[] iArr = this.Action;
                int i6 = this.e1;
                this.e1 = i6 + 1;
                iArr[i6] = 2;
                return 0;
            case 6:
                int i7 = this.e1;
                int i8 = i7 - 1;
                this.e1 = i8;
                int[] iArr2 = this.Action;
                iArr2[i7 - 2] = iArr2[i7 - 2] % iArr2[i8];
                int i9 = i7 - 2;
                this.e1 = i9;
                this.getPadSub3[i9] = null;
                return 0;
            case 8:
                int[] iArr3 = this.Action;
                int i10 = this.e1;
                this.e1 = i10 + 1;
                iArr3[i10] = this.valueOf;
            case 7:
                return 0;
            case 9:
                int[] iArr4 = this.Action;
                int i11 = this.e1;
                this.e1 = i11 + 1;
                iArr4[i11] = 13;
                this.e1 = i11;
                iArr4[i11 - 1] = iArr4[i11 - 1] + iArr4[i11];
                return 0;
            case 10:
                int[] iArr5 = this.Action;
                int i12 = this.e1;
                this.e1 = i12 + 1;
                iArr5[i12] = iArr5[i12 - 1];
                return 0;
            case 11:
                int[] iArr6 = this.Action;
                int i13 = this.e1;
                this.e1 = i13 + 1;
                iArr6[i13] = 128;
                return 0;
            case 12:
                int i14 = this.e1;
                int i15 = i14 - 1;
                this.e1 = i15;
                int[] iArr7 = this.Action;
                iArr7[i14 - 2] = iArr7[i14 - 2] % iArr7[i15];
                return 0;
            case 13:
                int[] iArr8 = this.Action;
                int i16 = this.a;
                this.a = i16 + 1;
                this.PngjException = iArr8[i16];
                return 0;
            case 14:
                int i17 = this.e1 - 1;
                this.e1 = i17;
                this.PngjException = this.Action[i17] == 0 ? 0 : 1;
                return 0;
            case 15:
                Object[] objArr4 = this.getPadSub3;
                int i18 = this.e1;
                Object obj2 = objArr4[i18 - 1];
                objArr4[i18 - 1] = null;
                this.PngjInputException = obj2;
                return 0;
            case 16:
                int[] iArr9 = this.Action;
                int i19 = this.e1;
                this.e1 = i19 + 1;
                iArr9[i19] = 80;
                return 0;
            case 17:
                int[] iArr10 = this.Action;
                int i20 = this.e1;
                this.e1 = i20 + 1;
                iArr10[i20] = 0;
                this.e1 = i20;
                iArr10[i20 - 1] = iArr10[i20 - 1] / iArr10[i20];
                int i21 = i20 - 1;
                this.e1 = i21;
                this.getPadSub3[i21] = null;
                return 0;
            case 18:
                int[] iArr11 = this.Action;
                int i22 = this.e1;
                this.e1 = i22 + 1;
                iArr11[i22] = 5;
                this.e1 = i22;
                iArr11[i22 - 1] = iArr11[i22 - 1] + iArr11[i22];
                return 0;
            case 19:
                int[] iArr12 = this.Action;
                int i23 = this.e1;
                this.e1 = i23 + 1;
                iArr12[i23] = 2;
                this.e1 = i23;
                iArr12[i23 - 1] = iArr12[i23 - 1] % iArr12[i23];
                return 0;
            case 20:
                int[] iArr13 = this.Action;
                int i24 = this.e1 - 1;
                this.e1 = i24;
                this.PngjException = iArr13[i24];
                return 0;
            case 21:
                int[] iArr14 = this.Action;
                int i25 = this.e1;
                this.e1 = i25 + 1;
                iArr14[i25] = 32;
                return 0;
            case 22:
                int[] iArr15 = this.Action;
                int i26 = this.e1;
                this.e1 = i26 + 1;
                iArr15[i26] = 86;
                return 0;
            case 23:
                for (int i27 = this.e1 - 1; i27 >= 0; i27--) {
                    this.getPadSub3[i27] = null;
                }
                Object[] objArr5 = this.getPadSub3;
                this.e1 = 1;
                objArr5[0] = this.PngjPrematureEnding;
                return 0;
            case 24:
                Object[] objArr6 = this.getPadSub3;
                int i28 = this.e1;
                this.e1 = i28 + 1;
                objArr6[i28] = objArr6[i28 - 1];
                return 0;
            case 25:
                Object[] objArr7 = this.getPadSub3;
                int i29 = this.e1;
                int i30 = i29 + 1;
                this.e1 = i30;
                objArr7[i29] = objArr7[15];
                int i31 = i29 + 2;
                this.e1 = i31;
                objArr7[i30] = objArr7[i29];
                this.e1 = i29 + 3;
                objArr7[i31] = objArr7[i29 + 1];
                return 0;
            case 26:
                Object[] objArr8 = this.getPadSub3;
                int i32 = this.e1;
                this.e1 = i32 + 1;
                objArr8[i32] = this.PngjPrematureEnding;
                return 0;
            case 27:
                int i33 = this.e1 - 1;
                this.e1 = i33;
                Object[] objArr9 = this.getPadSub3;
                Object obj3 = objArr9[i33];
                objArr9[i33] = null;
                objArr9[16] = obj3;
                return 0;
            case 28:
                int i34 = this.e1 - 1;
                this.e1 = i34;
                int[] iArr16 = this.Action;
                iArr16[17] = iArr16[i34];
                return 0;
            case 29:
                int i35 = this.e1 - 1;
                this.e1 = i35;
                int[] iArr17 = this.Action;
                iArr17[18] = iArr17[i35];
                return 0;
            case 30:
                Object[] objArr10 = this.getPadSub3;
                int i36 = this.e1;
                int i37 = i36 + 1;
                this.e1 = i37;
                objArr10[i36] = objArr10[16];
                int[] iArr18 = this.Action;
                int i38 = i36 + 2;
                this.e1 = i38;
                iArr18[i37] = iArr18[17];
                this.e1 = i36 + 3;
                iArr18[i38] = iArr18[18];
                return 0;
            case 31:
                int[] iArr19 = this.Action;
                int i39 = this.e1;
                this.e1 = i39 + 1;
                iArr19[i39] = 1;
                return 0;
            case 32:
                int i40 = this.e1 - 1;
                this.e1 = i40;
                this.getPadSub3[i40] = null;
                return 0;
            case 33:
                int[] iArr20 = this.Action;
                int i41 = this.e1;
                this.e1 = i41 + 1;
                iArr20[i41] = 2;
                this.e1 = i41;
                iArr20[i41 - 1] = iArr20[i41 - 1] % iArr20[i41];
                int i42 = i41 - 1;
                this.e1 = i42;
                this.getPadSub3[i42] = null;
                return 0;
            case 34:
                int[] iArr21 = this.Action;
                int i43 = this.e1;
                this.e1 = i43 + 1;
                iArr21[i43] = 5;
                return 0;
            case 35:
                int i44 = this.e1;
                int i45 = i44 - 1;
                this.e1 = i45;
                int[] iArr22 = this.Action;
                iArr22[i44 - 2] = iArr22[i44 - 2] + iArr22[i45];
                return 0;
            case 36:
                int[] iArr23 = this.Action;
                int i46 = this.e1;
                this.e1 = i46 + 1;
                iArr23[i46] = 128;
                this.e1 = i46;
                iArr23[i46 - 1] = iArr23[i46 - 1] % iArr23[i46];
                return 0;
            case 37:
                int i47 = this.e1 - 1;
                this.e1 = i47;
                this.PngjException = this.Action[i47] != 0 ? 0 : 1;
                return 0;
            case 38:
                Object[] objArr11 = this.getPadSub3;
                int i48 = this.e1;
                this.e1 = i48 + 1;
                objArr11[i48] = null;
                return 0;
            case 39:
                int[] iArr24 = this.Action;
                int i49 = this.e1;
                this.e1 = i49 + 1;
                iArr24[i49] = 0;
                return 0;
            default:
                return i;
        }
    }
}
