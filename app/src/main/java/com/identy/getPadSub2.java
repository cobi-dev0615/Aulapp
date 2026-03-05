package com.identy;

/* loaded from: classes2.dex */
public final class getPadSub2 {
    public static int PngjBadSignature;
    public static int PngjException;

    public static void PngjBadSignature(String str, Throwable th) {
        try {
            if (LibSettings.isSaveCaptured()) {
                th.getMessage();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void PngjException(String str, String str2) {
        try {
            LibSettings.isSaveCaptured();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int values() {
        int i = PngjBadSignature;
        int i2 = i % 8461020;
        PngjBadSignature = i + 1;
        if (i2 != 0) {
            return PngjException;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        PngjException = freeMemory;
        return freeMemory;
    }
}
