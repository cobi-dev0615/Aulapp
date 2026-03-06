package arid.chunks;

import arid.Action;
import arid.AridA;
import arid.chunks.PngjInputException;

/* loaded from: classes.dex */
public final class PngjOutputException extends e1 {
    private int PngBadCharsetException;
    private int PngjExceptionInternal;
    private int PngjInputException;
    private int PngjOutputException;
    private int PngjUnsupportedException;
    private int a;
    private int e1;

    public PngjOutputException(Action action) {
        super("IHDR", action);
        if (action != null) {
            Action action2 = this.values;
            this.PngjInputException = action2.values;
            this.PngjOutputException = action2.valueOf;
            this.PngjUnsupportedException = action2.PngjBadCrcException;
            boolean z = action2.PngjException;
            this.PngjExceptionInternal = !action2.PngjBadSignature ? 2 : 0;
            this.PngBadCharsetException = 0;
            this.a = 0;
            this.e1 = 0;
        }
    }

    @Override // arid.chunks.PngjInputException
    public final PngjInputException.values PngjBadCrcException() {
        return Enum.valueOf(PngjInputException.values.class, "NA");
    }

    @Override // arid.chunks.PngjInputException
    public final PngjBadSignature values() {
        PngjBadSignature pngjBadSignature = new PngjBadSignature(13, arid.chunks.valueOf.PngjBadSignature, true);
        AridA.PngjBadSignature(this.PngjInputException, pngjBadSignature.valueOf, 0);
        AridA.PngjBadSignature(this.PngjOutputException, pngjBadSignature.valueOf, 4);
        byte[] bArr = pngjBadSignature.valueOf;
        bArr[8] = (byte) this.PngjUnsupportedException;
        bArr[9] = (byte) this.PngjExceptionInternal;
        bArr[10] = 0;
        bArr[11] = 0;
        bArr[12] = 0;
        return pngjBadSignature;
    }
}
