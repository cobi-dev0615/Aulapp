package com.touchlessid;

import com.identy.InitializationListener;
import defpackage.a;

/* loaded from: classes2.dex */
public abstract class VerxidSDK$PngjBadSignature implements InitializationListener {
    public static int valueOf;
    public static int values;

    public static int valueOf() {
        int i = valueOf;
        int i2 = i % 8033765;
        valueOf = i + 1;
        if (i2 != 0) {
            return values;
        }
        int b = a.b(1607736528);
        values = b;
        return b;
    }
}
