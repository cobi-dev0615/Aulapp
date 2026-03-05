package com.getkeepsafe.relinker.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class Section64Header extends Elf$SectionHeader {
    public Section64Header(ElfParser elfParser, Elf$Header elf$Header, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(elf$Header.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.info = elfParser.readWord(allocate, elf$Header.shoff + (i * elf$Header.shentsize) + 44);
    }
}
