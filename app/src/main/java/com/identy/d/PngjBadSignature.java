package com.identy.d;

import android.graphics.Bitmap;
import android.util.Pair;
import com.identy.IdentyA;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public interface PngjBadSignature {
    void PngjBadSignature(int i, boolean z);

    void PngjBadSignature(List<HashMap<Pair<Hand, Finger>, IdentyA>> list, boolean z, boolean z2, HashMap<Pair<Hand, Finger>, Float> hashMap);

    void PngjException(int i, boolean z);

    void PngjException(HashMap<Pair<Hand, Finger>, IdentyA> hashMap, HashMap<Pair<Hand, Finger>, IdentyA> hashMap2, Bitmap bitmap, boolean z, boolean z2);

    void a();

    void getAsHighestSecurityLevelReached();

    void getData();

    void getNfiq1Score();

    void getScore();

    void valueOf(Pair<Hand, Finger>[] pairArr);

    void values(int i);
}
