package com.identy.a;

import android.os.SystemClock;
import com.identy.enums.valueOf;

/* loaded from: classes2.dex */
public final class PngjException {
    public static int PngjBadCrcException;
    public static int values;
    public final valueOf valueOf;

    public static int values() {
        int i = values;
        int i2 = i % 9820748;
        values = i + 1;
        if (i2 != 0) {
            return PngjBadCrcException;
        }
        int uptimeMillis = (int) SystemClock.uptimeMillis();
        PngjBadCrcException = uptimeMillis;
        return uptimeMillis;
    }
}
