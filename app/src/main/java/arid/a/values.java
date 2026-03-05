package arid.a;

import arid.Action;
import arid.PngjExceptionInternal;
import arid.PngjOutputException;
import arid.a;
import arid.a.PngjBadCrcException;
import java.util.Arrays;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.uuid.Uuid;

/* loaded from: classes.dex */
public final class values extends PngjException {
    private arid.valueOf Action;
    private double Attempt;
    private byte[] PngBadCharsetException;
    private byte[] PngjOutputException;
    private byte[] PngjUnsupportedException;
    private int a;
    private PngjBadCrcException e1;
    private int getPadSub1;
    private int onErrorResponse;

    public values(Action action) {
        super(action);
        this.getPadSub1 = 0;
        this.e1 = new PngjBadCrcException(action);
    }

    @Override // arid.a.PngjException
    public final void PngjBadCrcException() {
        super.PngjBadCrcException();
    }

    @Override // arid.a.PngjException
    public final void PngjBadSignature() {
        super.PngjBadSignature();
        byte[] bArr = this.PngjOutputException;
        if (bArr == null || bArr.length < this.PngjBadSignature) {
            this.PngjOutputException = new byte[this.PngjBadSignature];
        }
        byte[] bArr2 = this.PngBadCharsetException;
        if (bArr2 == null || bArr2.length < this.PngjBadSignature) {
            this.PngBadCharsetException = new byte[this.PngjBadSignature];
        }
        byte[] bArr3 = this.PngjUnsupportedException;
        if (bArr3 == null || bArr3.length < this.PngjBadSignature) {
            this.PngjUnsupportedException = new byte[this.PngjBadSignature];
        } else {
            Arrays.fill(bArr3, (byte) 0);
        }
        if (this.valueOf.values < 3 && !arid.valueOf.PngjBadCrcException(this.PngjBadCrcException)) {
            this.PngjBadCrcException = arid.valueOf.FILTER_DEFAULT;
        }
        if (this.valueOf.valueOf < 3 && !arid.valueOf.PngjBadCrcException(this.PngjBadCrcException)) {
            this.PngjBadCrcException = arid.valueOf.FILTER_DEFAULT;
        }
        Action action = this.valueOf;
        if (action.PngjOutputException < 0) {
            action.PngjOutputException = action.values * action.valueOf;
        }
        if (action.PngjOutputException <= 1024 && !arid.valueOf.PngjBadCrcException(this.PngjBadCrcException)) {
            this.PngjBadCrcException = PngjPrematureEnding();
        }
        if (arid.valueOf.valueOf(this.PngjBadCrcException)) {
            this.getPadSub1 = 0;
            arid.valueOf valueof = this.PngjBadCrcException;
            if (valueof == arid.valueOf.FILTER_ADAPTIVE_FAST) {
                this.a = 200;
                this.onErrorResponse = 3;
                this.Attempt = 0.25d;
            } else if (valueof == arid.valueOf.FILTER_ADAPTIVE_MEDIUM) {
                this.a = 8;
                this.onErrorResponse = 32;
                this.Attempt = 0.0125d;
            } else {
                if (valueof != arid.valueOf.FILTER_ADAPTIVE_FULL) {
                    StringBuilder sb = new StringBuilder("bad filter ");
                    sb.append(this.PngjBadCrcException);
                    throw new PngjOutputException(sb.toString());
                }
                this.a = 0;
                this.onErrorResponse = Uuid.SIZE_BITS;
                this.Attempt = 0.008333333333333333d;
            }
        }
    }

    @Override // arid.a.PngjException
    public final byte[] values() {
        if (!this.PngjException) {
            PngjException();
        }
        return this.PngjOutputException;
    }

    @Override // arid.a.PngjException
    public final void PngjBadSignature(byte[] bArr) {
        double pow;
        int i;
        double d;
        double d2;
        int i2;
        arid.valueOf[] valueofArr;
        int i3;
        int i4;
        int i5;
        int i6;
        arid.valueOf valueof;
        arid.valueOf valueof2;
        if (bArr == this.PngjOutputException) {
            if (arid.valueOf.PngjBadCrcException(valueOf())) {
                this.Action = valueOf();
            } else {
                int i7 = 0;
                if (valueOf() == arid.valueOf.FILTER_PRESERVE) {
                    this.Action = arid.valueOf.valueOf(this.PngjOutputException[0]);
                } else {
                    int i8 = 5;
                    if (valueOf() == arid.valueOf.FILTER_CYCLIC) {
                        this.Action = arid.valueOf.valueOf(this.PngjPrematureEnding % 5);
                    } else if (valueOf() == arid.valueOf.FILTER_DEFAULT) {
                        valueOf(PngjPrematureEnding());
                        this.Action = valueOf();
                    } else if (arid.valueOf.valueOf(valueOf())) {
                        if (this.PngjPrematureEnding == this.getPadSub1) {
                            arid.valueOf[] PngjBadCrcException = arid.valueOf.PngjBadCrcException();
                            int length = PngjBadCrcException.length;
                            int i9 = 0;
                            while (true) {
                                double d3 = 1.0d;
                                int i10 = 1;
                                if (i9 < i8) {
                                    arid.valueOf valueof3 = PngjBadCrcException[i9];
                                    PngjBadCrcException pngjBadCrcException = this.e1;
                                    byte[] bArr2 = this.PngjOutputException;
                                    byte[] bArr3 = this.PngjUnsupportedException;
                                    int i11 = this.PngjPrematureEnding;
                                    if (pngjBadCrcException.onErrorResponse) {
                                        i = i7;
                                        d = 0.0d;
                                    } else {
                                        double[] dArr = pngjBadCrcException.Action;
                                        if (dArr[i7] < 0.0d) {
                                            d = 0.0d;
                                            System.arraycopy(PngjBadCrcException.values, i7, dArr, i7, i8);
                                            double[] dArr2 = pngjBadCrcException.Action;
                                            double d4 = dArr2[i7];
                                            int i12 = pngjBadCrcException.valueOf.PngjBadCrcException;
                                            i = i7;
                                            if (i12 == 16) {
                                                d4 = 1.2d;
                                            } else if (i12 < 8) {
                                                d4 = 0.4d;
                                            }
                                            dArr2[i] = d4 / pngjBadCrcException.a;
                                        } else {
                                            i = i7;
                                            d = 0.0d;
                                        }
                                        Arrays.fill(pngjBadCrcException.PngjUnsupportedException, 1.0d);
                                        pngjBadCrcException.onErrorResponse = true;
                                    }
                                    if (i11 != pngjBadCrcException.PngjBadSignature) {
                                        Arrays.fill(pngjBadCrcException.PngjOutputException, Double.NaN);
                                        Arrays.fill(pngjBadCrcException.PngjExceptionInternal, Double.NaN);
                                    }
                                    pngjBadCrcException.PngjBadSignature = i11;
                                    Arrays.fill(pngjBadCrcException.PngjPrematureEnding, i);
                                    int i13 = pngjBadCrcException.valueOf.PngjPrematureEnding;
                                    int i14 = PngjBadCrcException.PngjException.PngjBadCrcException[valueof3.ordinal()];
                                    if (i14 == 1) {
                                        d2 = 1.0d;
                                        i2 = 1;
                                        for (int i15 = 1; i15 <= i13; i15++) {
                                            int[] iArr = pngjBadCrcException.PngjPrematureEnding;
                                            int i16 = bArr2[i15] & UByte.MAX_VALUE;
                                            iArr[i16] = iArr[i16] + 1;
                                        }
                                    } else if (i14 == 2) {
                                        d2 = 1.0d;
                                        i2 = 1;
                                        for (int i17 = 1; i17 <= i13; i17++) {
                                            int[] iArr2 = pngjBadCrcException.PngjPrematureEnding;
                                            int PngjBadCrcException2 = a.PngjBadCrcException(bArr2[i17], 0, bArr3[i17] & UByte.MAX_VALUE, 0);
                                            iArr2[PngjBadCrcException2] = iArr2[PngjBadCrcException2] + 1;
                                        }
                                        int i18 = pngjBadCrcException.valueOf.PngjInputException + 1;
                                        int i19 = 1;
                                        while (i18 <= i13) {
                                            int[] iArr3 = pngjBadCrcException.PngjPrematureEnding;
                                            int PngjBadCrcException3 = a.PngjBadCrcException(bArr2[i18], bArr2[i19] & UByte.MAX_VALUE, bArr3[i18] & UByte.MAX_VALUE, bArr3[i19] & UByte.MAX_VALUE);
                                            iArr3[PngjBadCrcException3] = iArr3[PngjBadCrcException3] + 1;
                                            i18++;
                                            i19++;
                                        }
                                    } else if (i14 == 3) {
                                        d2 = 1.0d;
                                        i2 = 1;
                                        int i20 = 1;
                                        while (true) {
                                            i5 = pngjBadCrcException.valueOf.PngjInputException;
                                            if (i20 > i5) {
                                                break;
                                            }
                                            int[] iArr4 = pngjBadCrcException.PngjPrematureEnding;
                                            int i21 = bArr2[i20] & UByte.MAX_VALUE;
                                            iArr4[i21] = iArr4[i21] + 1;
                                            i20++;
                                        }
                                        int i22 = i5 + 1;
                                        int i23 = 1;
                                        while (i22 <= i13) {
                                            int[] iArr5 = pngjBadCrcException.PngjPrematureEnding;
                                            int i24 = (bArr2[i22] - bArr2[i23]) & KotlinVersion.MAX_COMPONENT_VALUE;
                                            iArr5[i24] = iArr5[i24] + 1;
                                            i22++;
                                            i23++;
                                        }
                                    } else if (i14 == 4) {
                                        d2 = 1.0d;
                                        i2 = 1;
                                        for (int i25 = 1; i25 <= pngjBadCrcException.valueOf.PngjPrematureEnding; i25++) {
                                            int[] iArr6 = pngjBadCrcException.PngjPrematureEnding;
                                            int i26 = (bArr2[i25] - bArr3[i25]) & KotlinVersion.MAX_COMPONENT_VALUE;
                                            iArr6[i26] = iArr6[i26] + 1;
                                        }
                                    } else {
                                        if (i14 != 5) {
                                            throw new PngjExceptionInternal("Bad filter:".concat(String.valueOf(valueof3)));
                                        }
                                        int i27 = 1;
                                        while (true) {
                                            i6 = pngjBadCrcException.valueOf.PngjInputException;
                                            if (i27 > i6) {
                                                break;
                                            }
                                            int[] iArr7 = pngjBadCrcException.PngjPrematureEnding;
                                            double d5 = d3;
                                            int i28 = ((bArr2[i27] & UByte.MAX_VALUE) - ((bArr3[i27] & UByte.MAX_VALUE) / 2)) & KotlinVersion.MAX_COMPONENT_VALUE;
                                            iArr7[i28] = iArr7[i28] + 1;
                                            i27++;
                                            d3 = d5;
                                        }
                                        d2 = d3;
                                        int i29 = i6 + 1;
                                        int i30 = 1;
                                        while (i29 <= i13) {
                                            int[] iArr8 = pngjBadCrcException.PngjPrematureEnding;
                                            int i31 = ((bArr2[i29] & UByte.MAX_VALUE) - (((bArr3[i29] & UByte.MAX_VALUE) + (bArr2[i30] & UByte.MAX_VALUE)) / 2)) & KotlinVersion.MAX_COMPONENT_VALUE;
                                            iArr8[i31] = iArr8[i31] + 1;
                                            i29++;
                                            i30++;
                                            i10 = i10;
                                        }
                                        i2 = i10;
                                    }
                                    if (valueof3 == arid.valueOf.FILTER_NONE) {
                                        double[] dArr3 = pngjBadCrcException.PngjExceptionInternal;
                                        int i32 = valueof3.Action;
                                        double d6 = d2 / pngjBadCrcException.valueOf.PngjPrematureEnding;
                                        double log = Math.log(d6);
                                        int[] iArr9 = pngjBadCrcException.PngjPrematureEnding;
                                        int length2 = iArr9.length;
                                        double d7 = d;
                                        int i33 = 0;
                                        while (i33 < length2) {
                                            int i34 = iArr9[i33];
                                            arid.valueOf[] valueofArr2 = PngjBadCrcException;
                                            int i35 = i9;
                                            if (i34 > 0) {
                                                double d8 = i34;
                                                d7 += (Math.log(d8) + log) * d8;
                                            }
                                            i33++;
                                            PngjBadCrcException = valueofArr2;
                                            i9 = i35;
                                        }
                                        valueofArr = PngjBadCrcException;
                                        i3 = i9;
                                        double d9 = d6 * PngjBadCrcException.PngjBadCrcException * d7;
                                        dArr3[i32] = d9 < d ? d : d9;
                                    } else {
                                        valueofArr = PngjBadCrcException;
                                        i3 = i9;
                                        double[] dArr4 = pngjBadCrcException.PngjOutputException;
                                        int i36 = valueof3.Action;
                                        int i37 = i2;
                                        int i38 = 0;
                                        while (true) {
                                            if (i37 >= 128) {
                                                break;
                                            }
                                            i38 += pngjBadCrcException.PngjPrematureEnding[i37] * i37;
                                            i37++;
                                        }
                                        int i39 = 128;
                                        for (i4 = Uuid.SIZE_BITS; i4 > 0; i4--) {
                                            i38 += pngjBadCrcException.PngjPrematureEnding[i39] * i4;
                                            i39++;
                                        }
                                        dArr4[i36] = i38 / pngjBadCrcException.valueOf.PngjPrematureEnding;
                                    }
                                    i9 = i3 + 1;
                                    PngjBadCrcException = valueofArr;
                                    i7 = 0;
                                    i8 = 5;
                                } else {
                                    PngjBadCrcException pngjBadCrcException2 = this.e1;
                                    double d10 = Double.MAX_VALUE;
                                    int i40 = 0;
                                    for (int i41 = 0; i41 < 5; i41++) {
                                        if (!Double.isNaN(pngjBadCrcException2.PngjOutputException[i41])) {
                                            pow = pngjBadCrcException2.PngjOutputException[i41];
                                        } else if (!Double.isNaN(pngjBadCrcException2.PngjExceptionInternal[i41])) {
                                            pow = (Math.pow(2.0d, pngjBadCrcException2.PngjExceptionInternal[i41]) - 1.0d) * 0.5d;
                                        }
                                        double d11 = pow * pngjBadCrcException2.Action[i41];
                                        double[] dArr5 = pngjBadCrcException2.PngjUnsupportedException;
                                        double d12 = dArr5[i41];
                                        double d13 = pngjBadCrcException2.PngjException;
                                        double d14 = ((1.0d - d13) * d11) + (d12 * d13);
                                        dArr5[i41] = d14;
                                        if (d14 < d10) {
                                            i40 = i41;
                                            d10 = d14;
                                        }
                                    }
                                    pngjBadCrcException2.PngjInputException = i40;
                                    this.Action = arid.valueOf.valueOf(i40);
                                    int round = this.PngjPrematureEnding >= this.onErrorResponse ? (int) Math.round((r2 - r3) * this.Attempt) : 0;
                                    int i42 = this.a;
                                    if (round > i42) {
                                        round = i42;
                                    }
                                    int i43 = this.PngjPrematureEnding;
                                    this.getPadSub1 = i43 + 1 + (i43 == 0 ? 0 : round);
                                }
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("not implemented filter: ");
                        sb.append(valueOf());
                        throw new PngjOutputException(sb.toString());
                    }
                }
            }
            if (this.PngjPrematureEnding == 0 && (valueof = this.Action) != arid.valueOf.FILTER_NONE && valueof != (valueof2 = arid.valueOf.FILTER_SUB)) {
                this.Action = valueof2;
            }
            PngjException(PngjBadCrcException(this.Action, bArr, this.PngjUnsupportedException, this.PngBadCharsetException));
            byte[] bArr4 = this.PngjOutputException;
            this.PngjOutputException = this.PngjUnsupportedException;
            this.PngjUnsupportedException = bArr4;
            return;
        }
        throw new RuntimeException("??");
    }
}
