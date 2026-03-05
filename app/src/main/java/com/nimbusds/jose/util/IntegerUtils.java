package com.nimbusds.jose.util;

import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public abstract class IntegerUtils {
    public static byte[] toBytes(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE)};
    }
}
