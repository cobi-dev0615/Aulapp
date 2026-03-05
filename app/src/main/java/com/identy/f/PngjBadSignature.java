package com.identy.f;

import android.app.Activity;
import android.util.Pair;
import com.identy.PngjExceptionInternal;
import com.identy.app.users.IdentyUser;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class PngjBadSignature {
    public static HashMap<Pair<Hand, Finger>, PngjExceptionInternal> PngjException(Activity activity, FingerDetectionMode[] fingerDetectionModeArr, IdentyUser identyUser) {
        HashMap<Pair<Hand, Finger>, PngjExceptionInternal> hashMap = new HashMap<>();
        for (FingerDetectionMode fingerDetectionMode : fingerDetectionModeArr) {
            if (fingerDetectionMode == FingerDetectionMode.L4F) {
                Hand hand = Hand.LEFT;
                Finger finger = Finger.INDEX;
                hashMap.put(new Pair<>(hand, finger), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger, identyUser));
                Finger finger2 = Finger.MIDDLE;
                hashMap.put(new Pair<>(hand, finger2), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger2, identyUser));
                Finger finger3 = Finger.RING;
                hashMap.put(new Pair<>(hand, finger3), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger3, identyUser));
                Finger finger4 = Finger.LITTLE;
                hashMap.put(new Pair<>(hand, finger4), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger4, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.LEFT_RIGHT_INDEX) {
                Hand hand2 = Hand.LEFT;
                Finger finger5 = Finger.INDEX;
                hashMap.put(new Pair<>(hand2, finger5), new PngjExceptionInternal(activity, hand2, finger5, identyUser));
                Hand hand3 = Hand.RIGHT;
                hashMap.put(new Pair<>(hand3, finger5), new PngjExceptionInternal(activity, hand3, finger5, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.TWO_THUMB) {
                Hand hand4 = Hand.LEFT;
                Finger finger6 = Finger.THUMB;
                hashMap.put(new Pair<>(hand4, finger6), new PngjExceptionInternal(activity, hand4, finger6, identyUser));
                Hand hand5 = Hand.RIGHT;
                hashMap.put(new Pair<>(hand5, finger6), new PngjExceptionInternal(activity, hand5, finger6, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.LEFT_THUMB) {
                Hand hand6 = Hand.LEFT;
                Finger finger7 = Finger.THUMB;
                hashMap.put(new Pair<>(hand6, finger7), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger7, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.R4F) {
                Hand hand7 = Hand.RIGHT;
                Finger finger8 = Finger.INDEX;
                hashMap.put(new Pair<>(hand7, finger8), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger8, identyUser));
                Finger finger9 = Finger.MIDDLE;
                hashMap.put(new Pair<>(hand7, finger9), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger9, identyUser));
                Finger finger10 = Finger.RING;
                hashMap.put(new Pair<>(hand7, finger10), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger10, identyUser));
                Finger finger11 = Finger.LITTLE;
                hashMap.put(new Pair<>(hand7, finger11), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger11, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.RIGHT_THUMB) {
                Hand hand8 = Hand.RIGHT;
                Finger finger12 = Finger.THUMB;
                hashMap.put(new Pair<>(hand8, finger12), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger12, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.RIGHT_INDEX) {
                Hand hand9 = Hand.RIGHT;
                Finger finger13 = Finger.INDEX;
                hashMap.put(new Pair<>(hand9, finger13), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger13, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.RIGHT_MIDDLE) {
                Hand hand10 = Hand.RIGHT;
                Finger finger14 = Finger.MIDDLE;
                hashMap.put(new Pair<>(hand10, finger14), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger14, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.RIGHT_RING) {
                Hand hand11 = Hand.RIGHT;
                Finger finger15 = Finger.RING;
                hashMap.put(new Pair<>(hand11, finger15), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger15, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.RIGHT_LITTLE) {
                Hand hand12 = Hand.RIGHT;
                Finger finger16 = Finger.LITTLE;
                hashMap.put(new Pair<>(hand12, finger16), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger16, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.LEFT_INDEX) {
                Hand hand13 = Hand.LEFT;
                Finger finger17 = Finger.INDEX;
                hashMap.put(new Pair<>(hand13, finger17), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger17, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.LEFT_MIDDLE) {
                Hand hand14 = Hand.LEFT;
                Finger finger18 = Finger.MIDDLE;
                hashMap.put(new Pair<>(hand14, finger18), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger18, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.LEFT_RING) {
                Hand hand15 = Hand.LEFT;
                Finger finger19 = Finger.RING;
                hashMap.put(new Pair<>(hand15, finger19), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger19, identyUser));
            } else if (fingerDetectionMode == FingerDetectionMode.LEFT_LITTLE) {
                Hand hand16 = Hand.LEFT;
                Finger finger20 = Finger.LITTLE;
                hashMap.put(new Pair<>(hand16, finger20), new PngjExceptionInternal(activity, fingerDetectionMode.getHand(), finger20, identyUser));
            }
        }
        return hashMap;
    }
}
