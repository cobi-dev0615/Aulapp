package com.getkeepsafe.relinker.elf;

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

    public abstract Elf$DynamicStructure getDynamicStructure(long j, int i);

    public abstract Elf$ProgramHeader getProgramHeader(long j);

    public abstract Elf$SectionHeader getSectionHeader(int i);
}
