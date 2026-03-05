package com.getkeepsafe.relinker.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class Program32Header extends Elf$ProgramHeader {
    public Program32Header(ElfParser elfParser, Elf$Header elf$Header, long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(elf$Header.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * elf$Header.phentsize) + elf$Header.phoff;
        this.type = elfParser.readWord(allocate, j2);
        this.offset = elfParser.readWord(allocate, 4 + j2);
        this.vaddr = elfParser.readWord(allocate, 8 + j2);
        this.memsz = elfParser.readWord(allocate, j2 + 20);
    }
}
