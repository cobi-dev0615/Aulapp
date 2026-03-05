package arid.a;

import arid.PngjOutputException;
import arid.e1;
import java.util.zip.Deflater;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public final class PngjBadSignature extends valueOf {
    private boolean PngjInputException;
    private Deflater PngjOutputException;
    private byte[] PngjUnsupportedException;

    private PngjBadSignature(e1 e1Var, int i, long j, Deflater deflater) {
        super(e1Var, i, j);
        this.PngjOutputException = deflater;
        this.PngjInputException = false;
    }

    private void PngjException() {
        byte[] bArr;
        int length;
        int i;
        e1 e1Var = this.valueOf;
        if (e1Var != null) {
            bArr = e1Var.valueOf;
            i = e1Var.values;
            length = e1Var.PngjException;
        } else {
            if (this.PngjUnsupportedException == null) {
                this.PngjUnsupportedException = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
            }
            bArr = this.PngjUnsupportedException;
            length = bArr.length;
            i = 0;
        }
        int deflate = this.PngjOutputException.deflate(bArr, i, length);
        if (deflate > 0) {
            e1 e1Var2 = this.valueOf;
            if (e1Var2 != null) {
                e1Var2.PngjBadCrcException(deflate);
            }
            this.PngjBadSignature += deflate;
        }
    }

    @Override // arid.a.valueOf
    public final void PngjBadCrcException(byte[] bArr, int i, int i2) {
        if (this.PngjOutputException.finished() || this.values || this.PngjException) {
            throw new PngjOutputException("write beyond end of stream");
        }
        this.PngjOutputException.setInput(bArr, i, i2);
        this.PngjBadCrcException += i2;
        while (!this.PngjOutputException.needsInput()) {
            PngjException();
        }
    }

    @Override // arid.a.valueOf
    public final void PngjBadSignature() {
        if (this.values) {
            return;
        }
        if (!this.PngjOutputException.finished()) {
            this.PngjOutputException.finish();
            while (!this.PngjOutputException.finished()) {
                PngjException();
            }
        }
        this.values = true;
        e1 e1Var = this.valueOf;
        if (e1Var != null) {
            e1Var.PngjException();
            e1Var.values = 0;
            e1Var.valueOf = null;
        }
    }

    @Override // arid.a.valueOf, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        PngjBadSignature();
        try {
            if (this.PngjInputException) {
                this.PngjOutputException.end();
            }
        } catch (Exception unused) {
        }
        super.close();
    }

    public PngjBadSignature(e1 e1Var, int i, long j, int i2, int i3) {
        this(e1Var, i, j, new Deflater(i2));
        this.PngjInputException = true;
        this.PngjOutputException.setStrategy(0);
    }
}
