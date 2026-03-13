package com.nimbusds.jose.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* loaded from: classes2.dex */
public abstract class DeflateUtils {
    public static byte[] compress(byte[] bArr) {
        Deflater deflater = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            deflater = new Deflater(8, true);
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            if (deflaterOutputStream != null) {
                try { deflaterOutputStream.close(); } catch (Exception ignored) {}
            }
            if (deflater != null) {
                deflater.end();
            }
            throw th;
        }
    }

    public static byte[] decompress(byte[] bArr) {
        Inflater inflater = null;
        InflaterInputStream inflaterInputStream = null;
        try {
            inflater = new Inflater(true);
            inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr), inflater);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = inflaterInputStream.read(bArr2);
                if (read <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inflaterInputStream.close();
                    inflater.end();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (Throwable th) {
            if (inflaterInputStream != null) {
                try { inflaterInputStream.close(); } catch (Exception ignored) {}
            }
            if (inflater != null) {
                inflater.end();
            }
            throw th;
        }
    }
}
