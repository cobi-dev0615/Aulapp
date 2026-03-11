package com.identy;

// Imports resolve types, not fields — bypasses field name shadowing
import com.identy.FingerActivity.PngjUnsupportedException;
import com.identy.isAuthSucess.PngjException;

/**
 * Bridge class to access inner class static methods that are shadowed by
 * field names in their parent classes (decompiler artifact).
 */
public class InnerClassBridge {

    public static Object[] callPngjUnsupportedException_PngjBadSignature(int a, Object b, int c) {
        return PngjUnsupportedException.PngjBadSignature$1eba2e16(a, b, c);
    }

    public static Object[] callPngjException_PngjException(int a, Object b, int c) {
        return PngjException.AnimationAnimationListenerC0024PngjException.RunnableC0025PngjException.PngjException$1eba2e16(a, b, c);
    }
}
