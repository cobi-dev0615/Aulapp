package com.identy;

/* loaded from: classes2.dex */
public class getScore {
    private int Action;
    public long PngjBadCrcException;
    public int PngjBadSignature;
    public float PngjException;
    public double PngjExceptionInternal;
    public double PngjInputException;
    public float PngjOutputException;
    public java.lang.Object PngjPrematureEnding;
    public java.lang.Object PngjUnsupportedException;
    private final java.lang.Object[] getPadSub3;
    private int onErrorResponse;
    public int valueOf;
    public long values;
    private final int[] e1 = new int[28];
    private final long[] a = new long[28];
    private final float[] PngBadCharsetException = new float[28];
    private final double[] getAsHighestSecurityLevelReached = new double[28];

    public getScore(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = new java.lang.Object[28];
        this.getPadSub3 = objArr;
        objArr[15] = obj;
        objArr[16] = obj2;
        this.onErrorResponse = 0;
        this.Action = -1;
    }

    public int PngjBadCrcException(int i) {
        switch (i) {
            case 1:
                java.lang.Object[] objArr = this.getPadSub3;
                int i2 = this.onErrorResponse;
                this.onErrorResponse = i2 + 1;
                objArr[i2] = objArr[15];
                return 0;
            case 2:
                int i3 = this.onErrorResponse - this.valueOf;
                this.onErrorResponse = i3;
                this.Action = i3;
                return 0;
            case 3:
                java.lang.Object[] objArr2 = this.getPadSub3;
                int i4 = this.Action;
                this.Action = i4 + 1;
                java.lang.Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.PngjUnsupportedException = obj;
                return 0;
            case 4:
                java.lang.Object[] objArr3 = this.getPadSub3;
                int i5 = this.onErrorResponse;
                this.onErrorResponse = i5 + 1;
                objArr3[i5] = objArr3[16];
                return 0;
            case 5:
                int[] iArr = this.e1;
                int i6 = this.onErrorResponse;
                int i7 = i6 + 1;
                this.onErrorResponse = i7;
                iArr[i6] = 2;
                this.onErrorResponse = i6 + 2;
                iArr[i7] = 2;
                return 0;
            case 6:
                int i8 = this.onErrorResponse;
                int i9 = i8 - 1;
                this.onErrorResponse = i9;
                int[] iArr2 = this.e1;
                iArr2[i8 - 2] = iArr2[i8 - 2] % iArr2[i9];
                return 0;
            case 7:
                int i10 = this.onErrorResponse - 1;
                this.onErrorResponse = i10;
                this.getPadSub3[i10] = null;
                return 0;
            case 9:
                int[] iArr3 = this.e1;
                int i11 = this.onErrorResponse;
                this.onErrorResponse = i11 + 1;
                iArr3[i11] = this.valueOf;
            case 8:
                return 0;
            case 10:
                int[] iArr4 = this.e1;
                int i12 = this.onErrorResponse;
                this.onErrorResponse = i12 + 1;
                iArr4[i12] = 103;
                this.onErrorResponse = i12;
                iArr4[i12 - 1] = iArr4[i12 - 1] + iArr4[i12];
                this.onErrorResponse = i12 + 1;
                iArr4[i12] = iArr4[i12 - 1];
                return 0;
            case 11:
                int[] iArr5 = this.e1;
                int i13 = this.onErrorResponse;
                this.onErrorResponse = i13 + 1;
                iArr5[i13] = 128;
                return 0;
            case 12:
                int[] iArr6 = this.e1;
                int i14 = this.Action;
                this.Action = i14 + 1;
                this.PngjBadSignature = iArr6[i14];
                return 0;
            case 13:
                int i15 = this.onErrorResponse - 1;
                this.onErrorResponse = i15;
                this.PngjBadSignature = this.e1[i15] != 0 ? 0 : 1;
                return 0;
            case 14:
                int[] iArr7 = this.e1;
                int i16 = this.onErrorResponse;
                this.onErrorResponse = i16 + 1;
                iArr7[i16] = 2;
                this.onErrorResponse = i16;
                iArr7[i16 - 1] = iArr7[i16 - 1] % iArr7[i16];
                return 0;
            case 15:
                java.lang.Object[] objArr4 = this.getPadSub3;
                int i17 = this.onErrorResponse;
                java.lang.Object obj2 = objArr4[i17 - 1];
                objArr4[i17 - 1] = null;
                this.PngjUnsupportedException = obj2;
                return 0;
            case 16:
                java.lang.Object[] objArr5 = this.getPadSub3;
                int i18 = this.onErrorResponse;
                this.onErrorResponse = i18 + 1;
                objArr5[i18] = null;
                int[] iArr8 = this.e1;
                java.lang.Object obj3 = objArr5[i18];
                objArr5[i18] = null;
                iArr8[i18] = ((int[]) obj3).length;
                this.onErrorResponse = i18;
                objArr5[i18] = null;
                return 0;
            case 17:
                int[] iArr9 = this.e1;
                int i19 = this.onErrorResponse;
                this.onErrorResponse = i19 + 1;
                iArr9[i19] = 81;
                this.onErrorResponse = i19;
                iArr9[i19 - 1] = iArr9[i19 - 1] + iArr9[i19];
                return 0;
            case 18:
                int[] iArr10 = this.e1;
                int i20 = this.onErrorResponse;
                int i21 = i20 + 1;
                this.onErrorResponse = i21;
                iArr10[i20] = iArr10[i20 - 1];
                this.onErrorResponse = i20 + 2;
                iArr10[i21] = 128;
                int i22 = i20 + 1;
                this.onErrorResponse = i22;
                iArr10[i20] = iArr10[i20] % iArr10[i22];
                return 0;
            case 19:
                int[] iArr11 = this.e1;
                int i23 = this.onErrorResponse;
                this.onErrorResponse = i23 + 1;
                iArr11[i23] = 2;
                return 0;
            case 20:
                int i24 = this.onErrorResponse - 1;
                this.onErrorResponse = i24;
                this.PngjBadSignature = this.e1[i24] == 0 ? 0 : 1;
                return 0;
            case 21:
                int[] iArr12 = this.e1;
                int i25 = this.onErrorResponse - 1;
                this.onErrorResponse = i25;
                this.PngjBadSignature = iArr12[i25];
                return 0;
            case 22:
                int[] iArr13 = this.e1;
                int i26 = this.onErrorResponse;
                this.onErrorResponse = i26 + 1;
                iArr13[i26] = 97;
                return 0;
            case 23:
                int[] iArr14 = this.e1;
                int i27 = this.onErrorResponse;
                this.onErrorResponse = i27 + 1;
                iArr14[i27] = 51;
                return 0;
            case 24:
                for (int i28 = this.onErrorResponse - 1; i28 >= 0; i28--) {
                    this.getPadSub3[i28] = null;
                }
                java.lang.Object[] objArr6 = this.getPadSub3;
                this.onErrorResponse = 1;
                objArr6[0] = this.PngjPrematureEnding;
                return 0;
            case 25:
                java.lang.Object[] objArr7 = this.getPadSub3;
                int i29 = this.onErrorResponse;
                this.onErrorResponse = i29 + 1;
                objArr7[i29] = objArr7[i29 - 1];
                return 0;
            case 26:
                java.lang.Object[] objArr8 = this.getPadSub3;
                int i30 = this.onErrorResponse;
                this.onErrorResponse = i30 + 1;
                objArr8[i30] = this.PngjPrematureEnding;
                return 0;
            case 27:
                java.lang.Object[] objArr9 = this.getPadSub3;
                int i31 = this.onErrorResponse;
                int i32 = i31 + 1;
                this.onErrorResponse = i32;
                objArr9[i31] = objArr9[i31 - 1];
                this.onErrorResponse = i31 + 3;
                objArr9[i31 + 2] = objArr9[i31];
                objArr9[i32] = objArr9[i31 - 1];
                return 0;
            case 28:
                int i33 = this.onErrorResponse - 1;
                this.onErrorResponse = i33;
                java.lang.Object[] objArr10 = this.getPadSub3;
                java.lang.Object obj4 = objArr10[i33];
                objArr10[i33] = null;
                objArr10[16] = obj4;
                return 0;
            case 29:
                int i34 = this.onErrorResponse - 1;
                this.onErrorResponse = i34;
                java.lang.Object[] objArr11 = this.getPadSub3;
                java.lang.Object obj5 = objArr11[i34];
                objArr11[i34] = null;
                objArr11[17] = obj5;
                return 0;
            case 30:
                int i35 = this.onErrorResponse - 1;
                this.onErrorResponse = i35;
                int[] iArr15 = this.e1;
                iArr15[18] = iArr15[i35];
                return 0;
            case 31:
                int i36 = this.onErrorResponse - 1;
                this.onErrorResponse = i36;
                int[] iArr16 = this.e1;
                iArr16[19] = iArr16[i36];
                return 0;
            case 32:
                java.lang.Object[] objArr12 = this.getPadSub3;
                int i37 = this.onErrorResponse;
                int i38 = i37 + 1;
                this.onErrorResponse = i38;
                objArr12[i37] = objArr12[15];
                int i39 = i37 + 2;
                this.onErrorResponse = i39;
                objArr12[i38] = objArr12[16];
                this.onErrorResponse = i37 + 3;
                objArr12[i39] = objArr12[17];
                return 0;
            case 33:
                int[] iArr17 = this.e1;
                int i40 = this.onErrorResponse;
                this.onErrorResponse = i40 + 1;
                iArr17[i40] = iArr17[18];
                return 0;
            case 34:
                int[] iArr18 = this.e1;
                int i41 = this.onErrorResponse;
                this.onErrorResponse = i41 + 1;
                iArr18[i41] = iArr18[19];
                return 0;
            case 35:
                int[] iArr19 = this.e1;
                int i42 = this.onErrorResponse;
                this.onErrorResponse = i42 + 1;
                iArr19[i42] = 59;
                return 0;
            case 36:
                int i43 = this.onErrorResponse;
                int i44 = i43 - 1;
                this.onErrorResponse = i44;
                int[] iArr20 = this.e1;
                iArr20[i43 - 2] = iArr20[i43 - 2] + iArr20[i44];
                return 0;
            case 37:
                int[] iArr21 = this.e1;
                int i45 = this.onErrorResponse;
                this.onErrorResponse = i45 + 1;
                iArr21[i45] = iArr21[i45 - 1];
                return 0;
            case 38:
                int[] iArr22 = this.e1;
                int i46 = this.onErrorResponse;
                int i47 = i46 + 1;
                this.onErrorResponse = i47;
                iArr22[i46] = 7;
                this.onErrorResponse = i46 + 2;
                iArr22[i47] = 0;
                return 0;
            case 39:
                int i48 = this.onErrorResponse;
                int i49 = i48 - 1;
                this.onErrorResponse = i49;
                int[] iArr23 = this.e1;
                iArr23[i48 - 2] = iArr23[i48 - 2] / iArr23[i49];
                return 0;
            case 40:
                int[] iArr24 = this.e1;
                int i50 = this.onErrorResponse;
                this.onErrorResponse = i50 + 1;
                iArr24[i50] = 1;
                return 0;
            case 41:
                int[] iArr25 = this.e1;
                int i51 = this.onErrorResponse;
                this.onErrorResponse = i51 + 1;
                iArr25[i51] = 0;
                return 0;
            default:
                return i;
        }
    }
}
