package arid;

import android.os.Process;

/* loaded from: classes.dex */
public class PngjException extends RuntimeException {
    public static int PngjBadCrcException;
    public static int PngjException;

    public PngjException(String str) {
        super(str);
    }

    public static int PngjBadSignature() {
        int i = PngjException;
        int i2 = i % 7114127;
        PngjException = i + 1;
        if (i2 != 0) {
            return PngjBadCrcException;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        PngjBadCrcException = elapsedCpuTime;
        return elapsedCpuTime;
    }

    public PngjException(Throwable th) {
        super(th);
    }
}
