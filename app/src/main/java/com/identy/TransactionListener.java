package com.identy;

import com.identy.ex.FingerData;
import java.util.HashMap;

/* loaded from: classes2.dex */
public interface TransactionListener {
    void onError(byte[] bArr, String str);

    void onSuccess(byte[] bArr, String str, HashMap<Integer, FingerData> hashMap);
}
