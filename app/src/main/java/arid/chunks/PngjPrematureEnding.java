package arid.chunks;

import arid.Action;
import arid.AridA;
import arid.chunks.PngjInputException;

/* loaded from: classes.dex */
public final class PngjPrematureEnding extends e1 {
    public int PngjExceptionInternal;
    public long PngjInputException;
    public long PngjUnsupportedException;

    public PngjPrematureEnding(Action action) {
        super("pHYs", action);
    }

    @Override // arid.chunks.PngjInputException
    public final PngjInputException.values PngjBadCrcException() {
        return PngjInputException.values.BEFORE_IDAT;
    }

    @Override // arid.chunks.PngjInputException
    public final PngjBadSignature values() {
        PngjBadSignature pngjBadSignature = new PngjBadSignature(9, valueOf.PngjBadSignature(this.PngjBadSignature), true);
        AridA.PngjBadSignature((int) this.PngjInputException, pngjBadSignature.valueOf, 0);
        AridA.PngjBadSignature((int) this.PngjUnsupportedException, pngjBadSignature.valueOf, 4);
        pngjBadSignature.valueOf[8] = (byte) this.PngjExceptionInternal;
        return pngjBadSignature;
    }
}
