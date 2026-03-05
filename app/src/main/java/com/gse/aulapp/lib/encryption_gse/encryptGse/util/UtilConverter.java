package com.gse.aulapp.lib.encryption_gse.encryptGse.util;

import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public abstract class UtilConverter {
    public static byte[] getBytesByStringNew(String str) {
        if (str != null) {
            return str.getBytes(StandardCharsets.ISO_8859_1);
        }
        return null;
    }

    public static String getStringByByteNew(byte[] bArr) {
        return new String(bArr, StandardCharsets.ISO_8859_1);
    }
}
