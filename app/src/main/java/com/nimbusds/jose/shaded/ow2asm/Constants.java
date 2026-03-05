package com.nimbusds.jose.shaded.ow2asm;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
abstract class Constants {
    public static void checkAsmExperimental(Object obj) {
        Class<?> cls = obj.getClass();
        String replace = cls.getName().replace('.', '/');
        if (isWhitelisted(replace)) {
            return;
        }
        checkIsPreview(cls.getClassLoader().getResourceAsStream(replace + ".class"));
    }

    public static void checkIsPreview(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Bytecode not available, can't check class version");
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            try {
                dataInputStream.readInt();
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                dataInputStream.close();
                if (readUnsignedShort != 65535) {
                    throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
                }
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e) {
            throw new IllegalStateException("I/O error, can't check class version", e);
        }
    }

    public static boolean isWhitelisted(String str) {
        if (str.startsWith("com/nimbusds/jose/shaded/ow2asm/")) {
            return str.contains("Test$") || Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?", str) || Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Check(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Adapter(\\$.*)?", str);
        }
        return false;
    }
}
