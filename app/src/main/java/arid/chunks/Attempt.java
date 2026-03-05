package arid.chunks;

/* loaded from: classes.dex */
public final class Attempt {
    public final arid.chunks.PngjException PngjBadSignature;
    public final boolean valueOf = false;

    public class PngjException implements PngjBadCrcException {
        public static int PngjBadCrcException;
        public static int valueOf;
        private /* synthetic */ PngjInputException PngjException;

        public PngjException(PngjInputException pngjInputException) {
            this.PngjException = pngjInputException;
        }

        public static int valueOf() {
            int i = PngjBadCrcException;
            int i2 = i % 5286205;
            PngjBadCrcException = i + 1;
            if (i2 != 0) {
                return valueOf;
            }
            int i3 = (int) Runtime.getRuntime().totalMemory();
            valueOf = i3;
            return i3;
        }

        @Override // arid.chunks.PngjBadCrcException
        public final boolean PngjBadCrcException(PngjInputException pngjInputException) {
            return valueOf.values(this.PngjException, pngjInputException);
        }
    }

    public Attempt(arid.chunks.PngjException pngjException) {
        this.PngjBadSignature = pngjException;
    }
}
