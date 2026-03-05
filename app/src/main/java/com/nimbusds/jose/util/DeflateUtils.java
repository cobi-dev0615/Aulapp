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
        Deflater deflater;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            deflater = new Deflater(8, true);
            try {
                DeflaterOutputStream deflaterOutputStream2 = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                try {
                    deflaterOutputStream2.write(bArr);
                    deflaterOutputStream2.close();
                    deflater.end();
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    deflaterOutputStream = deflaterOutputStream2;
                    if (deflaterOutputStream != null) {
                        deflaterOutputStream.close();
                    }
                    if (deflater != null) {
                        deflater.end();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            deflater = null;
        }
    }

    public static byte[] decompress(byte[] bArr) {
        Inflater inflater;
        InflaterInputStream inflaterInputStream;
        InflaterInputStream inflaterInputStream2 = null;
        try {
            inflater = new Inflater(true);
            try {
                inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr), inflater);
            } catch (Throwable th) {
                th = th;
            }
            try {
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
            } catch (Throwable th2) {
                th = th2;
                inflaterInputStream2 = inflaterInputStream;
                if (inflaterInputStream2 != null) {
                    inflaterInputStream2.close();
                }
                if (inflater != null) {
                    inflater.end();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inflater = null;
        }
    }
}
