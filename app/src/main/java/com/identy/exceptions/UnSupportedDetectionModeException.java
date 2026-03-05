package com.identy.exceptions;

/* loaded from: classes2.dex */
public class UnSupportedDetectionModeException extends Exception {
    public static int PngjBadCrcException;
    public static int PngjBadSignature;

    public UnSupportedDetectionModeException() {
        super("unsupported detection mode ");
    }

    public static int values() {
        int i = PngjBadSignature;
        int i2 = i % 5574649;
        PngjBadSignature = i + 1;
        if (i2 != 0) {
            return PngjBadCrcException;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        PngjBadCrcException = freeMemory;
        return freeMemory;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }
}
