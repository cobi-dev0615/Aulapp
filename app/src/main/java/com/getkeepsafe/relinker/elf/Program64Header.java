package com.getkeepsafe.relinker.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class Program64Header extends Elf$ProgramHeader {
    public Program64Header(ElfParser elfParser, Elf$Header elf$Header, long j) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(elf$Header.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * elf$Header.phentsize) + elf$Header.phoff;
        this.type = elfParser.readWord(allocate, j2);
        this.offset = elfParser.readLong(allocate, 8 + j2);
        this.vaddr = elfParser.readLong(allocate, 16 + j2);
        this.memsz = elfParser.readLong(allocate, j2 + 40);
    }
}
