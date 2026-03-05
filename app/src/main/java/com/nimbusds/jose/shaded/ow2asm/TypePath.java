package com.nimbusds.jose.shaded.ow2asm;

import defpackage.a;

/* loaded from: classes2.dex */
public final class TypePath {
    private final byte[] typePathContainer;
    private final int typePathOffset;

    public TypePath(byte[] bArr, int i) {
        this.typePathContainer = bArr;
        this.typePathOffset = i;
    }

    public static void put(TypePath typePath, ByteVector byteVector) {
        if (typePath == null) {
            byteVector.putByte(0);
            return;
        }
        byte[] bArr = typePath.typePathContainer;
        int i = typePath.typePathOffset;
        byteVector.putByteArray(bArr, i, (bArr[i] * 2) + 1);
    }

    public int getLength() {
        return this.typePathContainer[this.typePathOffset];
    }

    public int getStep(int i) {
        return this.typePathContainer[a.c(i, 2, this.typePathOffset, 1)];
    }

    public int getStepArgument(int i) {
        return this.typePathContainer[a.c(i, 2, this.typePathOffset, 2)];
    }

    public String toString() {
        int length = getLength();
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            int step = getStep(i);
            if (step == 0) {
                sb.append('[');
            } else if (step == 1) {
                sb.append('.');
            } else if (step == 2) {
                sb.append('*');
            } else {
                if (step != 3) {
                    throw new AssertionError();
                }
                sb.append(getStepArgument(i));
                sb.append(';');
            }
        }
        return sb.toString();
    }
}
