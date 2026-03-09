package org.camera;

import android.os.SystemClock;
import android.widget.Toast;

/* loaded from: classes2.dex */
public final class valueOf {
    public static int valueOf;
    public static int values;
    public Toast PngjException;

    public static int valueOf() {
        int i = values;
        int i2 = i % 7902574;
        values = i + 1;
        if (i2 != 0) {
            return valueOf;
        }
        int uptimeMillis = (int) SystemClock.uptimeMillis();
        valueOf = uptimeMillis;
        return uptimeMillis;
    }
}
