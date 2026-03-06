package com.getkeepsafe.relinker.elf;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class Elf$Header {
    public boolean bigEndian;
    public int phentsize;
    public int phnum;
    public long phoff;
    public int shentsize;
    public int shnum;
    public long shoff;
    public int shstrndx;
    public int type;

    public abstract Elf$DynamicStructure getDynamicStructure(long j, int i) throws IOException;

    public abstract Elf$ProgramHeader getProgramHeader(long j) throws IOException;

    public abstract Elf$SectionHeader getSectionHeader(int i) throws IOException;
}
