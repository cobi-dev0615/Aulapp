package arid.chunks;

import arid.Action;

/* loaded from: classes.dex */
public abstract class e1 extends PngjInputException {
    public e1(String str, Action action) {
        super(str, action);
    }

    @Override // arid.chunks.PngjInputException
    public final boolean PngjBadSignature() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e1 e1Var = (e1) obj;
        String str = this.PngjBadSignature;
        return str == null ? e1Var.PngjBadSignature == null : str.equals(e1Var.PngjBadSignature);
    }

    public int hashCode() {
        String str = this.PngjBadSignature;
        return (str == null ? 0 : str.hashCode()) + 31;
    }
}
