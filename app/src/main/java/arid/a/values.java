package arid.a;

import arid.Action;
import arid.PngjExceptionInternal;
import arid.PngjOutputException;
import arid.AridA;
import arid.a.PngjBadCrcException;
import java.util.Arrays;
import kotlin.KotlinVersion;
import kotlin.UByte;

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
                this.onErrorResponse = 128;
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
        throw new UnsupportedOperationException("Method not decompiled: arid.a.values.PngjBadSignature(byte[]):void");
    }
}
