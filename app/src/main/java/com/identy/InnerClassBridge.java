package com.identy;

/**
 * Bridge class to access inner class static methods that are shadowed by
 * field names in their parent classes (decompiler artifact).
 * This class has no inheritance from e1/FingerActivity, so field shadowing
 * does not apply here.
 */
public class InnerClassBridge {

    public static Object[] callPngjUnsupportedException_PngjBadSignature(int a, Object b, int c) {
        return FingerActivity.PngjUnsupportedException.PngjBadSignature$1eba2e16(a, b, c);
    }

    public static Object[] callPngjException_PngjException(int a, Object b, int c) {
        return isAuthSucess.PngjException.AnimationAnimationListenerC0024PngjException.RunnableC0025PngjException.PngjException$1eba2e16(a, b, c);
    }
}
