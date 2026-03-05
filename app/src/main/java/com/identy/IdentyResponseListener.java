package com.identy;

import com.identy.enums.Finger;
import com.identy.enums.Hand;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes2.dex */
public interface IdentyResponseListener {
    void onAttempt(Hand hand, int i, Map<Finger, Attempt> map);

    void onErrorResponse(IdentyError identyError, HashSet<String> hashSet);

    void onResponse(IdentyResponse identyResponse, HashSet<String> hashSet);
}
