package com.getkeepsafe.relinker.elf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class Section32Header extends Elf$SectionHeader {
    public Section32Header(ElfParser elfParser, Elf$Header elf$Header, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(elf$Header.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.info = elfParser.readWord(allocate, elf$Header.shoff + (i * elf$Header.shentsize) + 28);
    }
}
