package com.identy;

import android.util.Pair;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static int a(int i, int i2, int i3, int i4) {
        return ((i + i2) / i3) - i4;
    }

    public static Object b(Hand hand, Finger finger, HashMap hashMap) {
        return hashMap.get(new Pair(hand, finger));
    }

    public static String c(int i, int i2, int i3, String str) {
        return str.substring(i3 / (i * i2));
    }

    public static String d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static int e(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) - i4;
    }
}
