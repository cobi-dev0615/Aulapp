package arid.chunks;

import arid.a;
import java.io.OutputStream;
import java.util.logging.Logger;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public class PngjBadSignature {
    private byte[] PngjBadCrcException;
    private String PngjBadSignature;
    public final int PngjException;
    private byte[] PngjInputException;
    private CRC32 PngjUnsupportedException;
    public byte[] valueOf;
    long values;

    static {
        Logger.getLogger(PngjBadSignature.class.getName());
    }

    private PngjBadSignature(int i, String str, boolean z) {
        this.valueOf = null;
        this.values = 0L;
        this.PngjInputException = new byte[4];
        this.PngjException = i;
        this.PngjBadSignature = str;
        this.PngjBadCrcException = valueOf.PngjBadSignature(str);
        for (int i2 = 0; i2 < 4; i2++) {
            byte b = this.PngjBadCrcException[i2];
            if (b < 65 || b > 122 || (b > 90 && b < 97)) {
                throw new arid.PngjException("Bad id chunk: must be ascii letters ".concat(String.valueOf(str)));
            }
        }
        if (z) {
            byte[] bArr = this.valueOf;
            if (bArr == null || bArr.length < this.PngjException) {
                this.valueOf = new byte[this.PngjException];
            }
        }
    }

    private void PngjException() {
        CRC32 crc32 = new CRC32();
        this.PngjUnsupportedException = crc32;
        crc32.update(this.PngjBadCrcException, 0, 4);
        int i = this.PngjException;
        if (i > 0) {
            this.PngjUnsupportedException.update(this.valueOf, 0, i);
        }
        a.PngjBadSignature((int) this.PngjUnsupportedException.getValue(), this.PngjInputException, 0);
    }

    private void valueOf(OutputStream outputStream) {
        if (this.PngjBadCrcException.length == 4) {
            a.PngjException(outputStream, this.PngjException);
            a.PngjBadCrcException(outputStream, this.PngjBadCrcException);
        } else {
            StringBuilder sb = new StringBuilder("bad chunkid [");
            sb.append(this.PngjBadSignature);
            sb.append("]");
            throw new arid.PngjOutputException(sb.toString());
        }
    }

    public final void PngjBadCrcException(OutputStream outputStream) {
        valueOf(outputStream);
        int i = this.PngjException;
        if (i > 0) {
            byte[] bArr = this.valueOf;
            if (bArr == null) {
                StringBuilder sb = new StringBuilder("cannot write chunk, raw chunk data is null [");
                sb.append(this.PngjBadSignature);
                sb.append("]");
                throw new arid.PngjOutputException(sb.toString());
            }
            a.PngjBadCrcException(outputStream, bArr, i);
        }
        PngjException();
        a.PngjBadCrcException(outputStream, this.PngjInputException, 4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PngjBadSignature pngjBadSignature = (PngjBadSignature) obj;
        String str = this.PngjBadSignature;
        if (str == null) {
            if (pngjBadSignature.PngjBadSignature != null) {
                return false;
            }
        } else if (!str.equals(pngjBadSignature.PngjBadSignature)) {
            return false;
        }
        return this.values == pngjBadSignature.values;
    }

    public int hashCode() {
        String str = this.PngjBadSignature;
        return ((str == null ? 0 : str.hashCode()) + 31) * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("chunkid=");
        sb.append(valueOf.values(this.PngjBadCrcException));
        sb.append(" len=");
        sb.append(this.PngjException);
        return sb.toString();
    }

    public PngjBadSignature(int i, byte[] bArr, boolean z) {
        this(i, valueOf.values(bArr), z);
    }
}
