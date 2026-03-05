package arid;

/* loaded from: classes.dex */
public final class PngBadCharsetException implements values {
    private Action PngjBadCrcException;
    private int PngjBadSignature;
    private byte[] PngjException;
    private valueOf valueOf;
    public final byte[] values;

    public PngBadCharsetException(Action action) {
        this(action, (byte) 0);
    }

    @Override // arid.values
    public final void PngjBadSignature(byte[] bArr) {
        bArr[0] = (byte) this.valueOf.Action;
        int i = this.PngjBadCrcException.PngjBadCrcException;
        int i2 = 1;
        if (i == 8) {
            System.arraycopy(this.values, 0, bArr, 1, this.PngjBadSignature);
            return;
        }
        if (i == 16) {
            for (int i3 = 0; i3 < this.PngjBadSignature; i3++) {
                int i4 = i2 + 1;
                bArr[i2] = this.values[i3];
                i2 += 2;
                bArr[i4] = this.PngjException[i3];
            }
            return;
        }
        int i5 = 8 - i;
        int i6 = 0;
        int i7 = 0;
        int i8 = i5;
        while (true) {
            int i9 = this.PngjBadSignature;
            if (i6 >= i9) {
                return;
            }
            i7 |= this.values[i6] << i8;
            i8 -= i;
            if (i8 < 0 || i6 == i9 - 1) {
                bArr[i2] = (byte) i7;
                i7 = 0;
                i2++;
                i8 = i5;
            }
            i6++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" cols=");
        sb.append(this.PngjBadCrcException.values);
        sb.append(" bpc=");
        sb.append(this.PngjBadCrcException.PngjBadCrcException);
        sb.append(" size=");
        sb.append(this.values.length);
        return sb.toString();
    }

    private PngBadCharsetException(Action action, byte b) {
        this.PngjBadCrcException = action;
        this.valueOf = valueOf.FILTER_UNKNOWN;
        int i = action.PngjUnsupportedException;
        this.PngjBadSignature = i;
        this.values = new byte[i];
        this.PngjException = action.PngjBadCrcException == 16 ? new byte[i] : null;
    }
}
