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
        return Enum.valueOf(PngjInputException.values.class, "NA");
    }

    @Override // arid.chunks.PngjInputException
    public final PngjBadSignature values() {
        return new PngjBadSignature(0, arid.chunks.valueOf.valueOf, false);
    }
}
