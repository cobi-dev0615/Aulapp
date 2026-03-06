package arid.chunks;

import android.os.SystemClock;
import arid.Action;
import arid.chunks.PngjInputException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class values extends PngjException {
    public static int PngjBadCrcException;
    public static int PngjBadSignature;
    private final HashMap PngjOutputException;
    public final List values;

    public values(Action action) {
        super(action);
        this.values = new ArrayList();
        this.PngjOutputException = new HashMap();
    }

    public static int valueOf() {
        int i = PngjBadCrcException;
        int i2 = i % 7769089;
        PngjBadCrcException = i + 1;
        if (i2 != 0) {
            return PngjBadSignature;
        }
        int uptimeMillis = (int) SystemClock.uptimeMillis();
        PngjBadSignature = uptimeMillis;
        return uptimeMillis;
    }

    public final int PngjException(OutputStream outputStream, int i) {
        int i2;
        int i3;
        boolean z;
        Iterator it = this.values.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            PngjInputException pngjInputException = (PngjInputException) it.next();
            if (i == 2) {
                z = pngjInputException.PngjBadSignature.equals("PLTE");
            } else {
                if (i % 2 == 0) {
                    throw new arid.PngjOutputException("bad chunk group?");
                }
                PngjInputException.values PngjBadCrcException2 = pngjInputException.PngjBadCrcException();
                PngjInputException.values valuesVar = Enum.valueOf(PngjInputException.values.class, "BEFORE_PLTE_AND_IDAT");
                if (PngjBadCrcException2 == valuesVar) {
                    i2 = 1;
                } else {
                    PngjInputException.values PngjBadCrcException3 = pngjInputException.PngjBadCrcException();
                    if (PngjBadCrcException3 == Enum.valueOf(PngjInputException.values.class, "BEFORE_IDAT") || PngjBadCrcException3 == valuesVar || PngjBadCrcException3 == Enum.valueOf(PngjInputException.values.class, "AFTER_PLTE_BEFORE_IDAT")) {
                        if (pngjInputException.PngjBadCrcException() != Enum.valueOf(PngjInputException.values.class, "AFTER_PLTE_BEFORE_IDAT")) {
                            PngjInputException.values valuesVar2 = Enum.valueOf(PngjInputException.values.class, "AFTER_PLTE_BEFORE_IDAT_PLTE_REQUIRED");
                        }
                        i2 = 3;
                    } else {
                        i2 = 5;
                    }
                }
                if (!arid.chunks.valueOf.PngjException(pngjInputException) || (i3 = pngjInputException.PngjPrematureEnding) <= 0) {
                    i3 = i2;
                }
                z = i == i3 || (i > i3 && i <= i2);
            }
            if (z) {
                if (arid.chunks.valueOf.valueOf(pngjInputException.PngjBadSignature) && !pngjInputException.PngjBadSignature.equals("PLTE")) {
                    throw new arid.PngjOutputException("bad chunk queued: ".concat(String.valueOf(pngjInputException)));
                }
                if (this.PngjOutputException.containsKey(pngjInputException.PngjBadSignature) && !pngjInputException.PngjBadSignature()) {
                    throw new arid.PngjOutputException("duplicated chunk does not allow multiple: ".concat(String.valueOf(pngjInputException)));
                }
                try {
                    pngjInputException.valueOf(outputStream);
                } catch (Throwable t) {
                    throw new RuntimeException(t);
                }
                this.valueOf.add(pngjInputException);
                HashMap hashMap = this.PngjOutputException;
                String str = pngjInputException.PngjBadSignature;
                hashMap.put(str, Integer.valueOf(hashMap.containsKey(str) ? 1 + ((Integer) this.PngjOutputException.get(pngjInputException.PngjBadSignature)).intValue() : 1));
                pngjInputException.PngjPrematureEnding = i;
                it.remove();
                i4++;
            }
        }
        return i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChunkList: written: ");
        sb.append(this.valueOf.size());
        sb.append(" queue: ");
        sb.append(this.values.size());
        return sb.toString();
    }
}
