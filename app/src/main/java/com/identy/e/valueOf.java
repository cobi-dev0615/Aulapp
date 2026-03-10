package com.identy.e;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes2.dex */
public final class valueOf {
    public static byte[] PngjException(String str) {
        try {
            File file = new File(str);
            int length = (int) file.length();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            byte[] bArr = new byte[length];
            bufferedInputStream.read(bArr, 0, length);
            bufferedInputStream.close();
            return bArr;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
