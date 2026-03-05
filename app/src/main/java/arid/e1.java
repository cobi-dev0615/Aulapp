package arid;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class e1 {
    private final int PngjBadCrcException;
    private final OutputStream PngjBadSignature;
    public int PngjException;
    public byte[] valueOf;
    public int values = 0;
    private long PngjInputException = 0;
    private int PngjExceptionInternal = 0;

    public e1(OutputStream outputStream, int i) {
        this.PngjBadSignature = outputStream;
        i = i <= 0 ? 32768 : i;
        this.PngjBadCrcException = i;
        this.valueOf = new byte[i];
        this.PngjException = i;
    }

    public final void PngjBadCrcException(int i) {
        this.values += i;
        int i2 = this.PngjException - i;
        this.PngjException = i2;
        if (i2 < 0) {
            throw new PngjOutputException("Anomalous situation");
        }
        if (i2 == 0) {
            PngjException();
        }
    }

    public void PngjException() {
        int i = this.values;
        if (i <= 0 || i <= 0) {
            return;
        }
        arid.chunks.PngjBadSignature pngjBadSignature = new arid.chunks.PngjBadSignature(this.values, arid.chunks.valueOf.PngjException, false);
        pngjBadSignature.valueOf = this.valueOf;
        pngjBadSignature.PngjBadCrcException(this.PngjBadSignature);
        this.PngjInputException += pngjBadSignature.PngjException + 12;
        this.PngjExceptionInternal++;
        this.values = 0;
        this.PngjException = this.PngjBadCrcException;
    }
}
