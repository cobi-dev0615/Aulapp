package com.getkeepsafe.relinker.elf;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;
import kotlin.UShort;

/* loaded from: classes.dex */
public class ElfParser implements Closeable, AutoCloseable {
    private final int MAGIC = 1179403647;
    private final FileChannel channel;

    public ElfParser(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.channel = new FileInputStream(file).getChannel();
    }

    private long offsetFromVma(Elf$Header elf$Header, long j, long j2) {
        for (long j3 = 0; j3 < j; j3++) {
            Elf$ProgramHeader programHeader = elf$Header.getProgramHeader(j3);
            if (programHeader.type == 1) {
                long j4 = programHeader.vaddr;
                if (j4 <= j2 && j2 <= programHeader.memsz + j4) {
                    return (j2 - j4) + programHeader.offset;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.channel.close();
    }

    public Elf$Header parseHeader() {
        this.channel.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (readWord(allocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short readByte = readByte(allocate, 4L);
        boolean z = readByte(allocate, 5L) == 2;
        if (readByte == 1) {
            return new Elf32Header(z, this);
        }
        if (readByte == 2) {
            return new Elf64Header(z, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List<String> parseNeededDependencies() {
        long j;
        this.channel.position(0L);
        ArrayList arrayList = new ArrayList();
        Elf$Header parseHeader = parseHeader();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(parseHeader.bigEndian ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = parseHeader.phnum;
        if (j2 == 65535) {
            j2 = parseHeader.getSectionHeader(0).info;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            Elf$ProgramHeader programHeader = parseHeader.getProgramHeader(j3);
            if (programHeader.type == 2) {
                j = programHeader.offset;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j4 = 0;
        int i = 0;
        while (true) {
            Elf$DynamicStructure dynamicStructure = parseHeader.getDynamicStructure(j, i);
            long j5 = j;
            long j6 = dynamicStructure.tag;
            if (j6 == 1) {
                arrayList2.add(Long.valueOf(dynamicStructure.val));
            } else if (j6 == 5) {
                j4 = dynamicStructure.val;
            }
            i++;
            if (dynamicStructure.tag == 0) {
                break;
            }
            j = j5;
            j2 = j2;
        }
        if (j4 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long offsetFromVma = offsetFromVma(parseHeader, j2, j4);
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(readString(allocate, ((Long) obj).longValue() + offsetFromVma));
        }
        return arrayList;
    }

    public void read(ByteBuffer byteBuffer, long j, int i) {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int read = this.channel.read(byteBuffer, j + j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 += read;
        }
        byteBuffer.position(0);
    }

    public short readByte(ByteBuffer byteBuffer, long j) {
        read(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & UByte.MAX_VALUE);
    }

    public int readHalf(ByteBuffer byteBuffer, long j) {
        read(byteBuffer, j, 2);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    public long readLong(ByteBuffer byteBuffer, long j) {
        read(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    public String readString(ByteBuffer byteBuffer, long j) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short readByte = readByte(byteBuffer, j);
            if (readByte == 0) {
                return sb.toString();
            }
            sb.append((char) readByte);
            j = j2;
        }
    }

    public long readWord(ByteBuffer byteBuffer, long j) {
        read(byteBuffer, j, 4);
        return byteBuffer.getInt() & 4294967295L;
    }
}
