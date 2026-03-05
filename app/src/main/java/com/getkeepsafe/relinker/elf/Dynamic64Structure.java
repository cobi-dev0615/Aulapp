package com.getkeepsafe.relinker.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class Dynamic64Structure extends Elf$DynamicStructure {
    public Dynamic64Structure(ElfParser elfParser, Elf$Header elf$Header, long j, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(elf$Header.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + (i * 16);
        this.tag = elfParser.readLong(allocate, j2);
        this.val = elfParser.readLong(allocate, j2 + 8);
    }
}
