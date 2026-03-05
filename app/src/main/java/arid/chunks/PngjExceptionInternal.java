package arid.chunks;

import arid.Action;
import arid.chunks.PngjInputException;

/* loaded from: classes.dex */
public final class PngjExceptionInternal extends e1 {
    public PngjExceptionInternal(Action action) {
        super("IEND", action);
    }

    @Override // arid.chunks.PngjInputException
    public final PngjInputException.values PngjBadCrcException() {
        return PngjInputException.values.NA;
    }

    @Override // arid.chunks.PngjInputException
    public final PngjBadSignature values() {
        return new PngjBadSignature(0, valueOf.valueOf, false);
    }
}
