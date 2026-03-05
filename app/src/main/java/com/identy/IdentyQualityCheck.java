package com.identy;

import android.util.Pair;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import java.util.HashMap;

/* loaded from: classes2.dex */
public interface IdentyQualityCheck {
    boolean decide(HashMap<Pair<Hand, Finger>, Integer> hashMap);
}
