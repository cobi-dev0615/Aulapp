package com.identy;

import com.identy.enums.Finger;
import com.identy.enums.Hand;
import java.util.HashMap;

/* loaded from: classes2.dex */
public interface IdentyMatcher {
    valueOf decide(Hand hand, HashMap<Finger, Integer> hashMap);
}
