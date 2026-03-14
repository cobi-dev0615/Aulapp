package com.nimbusds.jose.shaded.ow2asm;


/* loaded from: classes2.dex */
class Frame {
    private int initializationCount;
    private int[] initializations;
    private int[] inputLocals;
    private int[] inputStack;
    private int[] outputLocals;
    private int[] outputStack;
    private short outputStackStart;
    private short outputStackTop;
    Label owner;

    public Frame(Label label) {
        this.owner = label;
    }

    private void addInitializedType(int i) {
        if (this.initializations == null) {
            this.initializations = new int[2];
        }
        int length = this.initializations.length;
        int i2 = this.initializationCount;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.initializations, 0, iArr, 0, length);
            this.initializations = iArr;
        }
        int[] iArr2 = this.initializations;
        int i3 = this.initializationCount;
        this.initializationCount = i3 + 1;
        iArr2[i3] = i;
    }

    public static int getAbstractTypeFromApiFormat(SymbolTable symbolTable, Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() | 4194304 : obj instanceof String ? getAbstractTypeFromDescriptor(symbolTable, Type.getObjectType((String) obj).getDescriptor(), 0) : symbolTable.addUninitializedType("", ((Label) obj).bytecodeOffset) | 12582912;
    }

    private static int getAbstractTypeFromDescriptor(SymbolTable symbolTable, String str, int i) {
        char charAt = str.charAt(i);
        int i2 = 4194306;
        if (charAt == 'F') {
            return 4194306;
        }
        if (charAt == 'L') {
            return symbolTable.addType(str.substring(i + 1, str.length() - 1)) | 8388608;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return 0;
            }
            if (charAt != 'I') {
                if (charAt == 'J') {
                    return 4194308;
                }
                if (charAt != 'Z') {
                    if (charAt == '[') {
                        int i3 = i + 1;
                        while (str.charAt(i3) == '[') {
                            i3++;
                        }
                        char charAt2 = str.charAt(i3);
                        if (charAt2 != 'F') {
                            if (charAt2 == 'L') {
                                i2 = symbolTable.addType(str.substring(i3 + 1, str.length() - 1)) | 8388608;
                            } else if (charAt2 == 'S') {
                                i2 = 4194316;
                            } else if (charAt2 == 'Z') {
                                i2 = 4194313;
                            } else if (charAt2 == 'I') {
                                i2 = 4194305;
                            } else if (charAt2 != 'J') {
                                switch (charAt2) {
                                    case 'B':
                                        i2 = 4194314;
                                        break;
                                    case 'C':
                                        i2 = 4194315;
                                        break;
                                    case 'D':
                                        i2 = 4194307;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                i2 = 4194308;
                            }
                        }
                        return ((i3 - i) << 26) | i2;
                    }
                    switch (charAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 4194307;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        return 4194305;
    }

    public static int getAbstractTypeFromInternalName(SymbolTable symbolTable, String str) {
        return symbolTable.addType(str) | 8388608;
    }

    private int getConcreteOutputType(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 16777216) {
            int i5 = i3 + this.inputLocals[i & 1048575];
            if ((i & 1048576) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 20971520) {
            return i;
        }
        int i6 = i3 + this.inputStack[i2 - (i & 1048575)];
        if ((i & 1048576) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
            return i6;
        }
        return 4194304;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[LOOP:0: B:8:0x000d->B:15:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getInitializedType(SymbolTable symbolTable, int i) {
        int i2;
        if (i == 4194310 || ((-4194304) & i) == 12582912) {
            for (int i3 = 0; i3 < this.initializationCount; i3++) {
                int i4 = this.initializations[i3];
                int i5 = (-67108864) & i4;
                int i6 = 62914560 & i4;
                int i7 = i4 & 1048575;
                if (i6 == 16777216) {
                    i2 = this.inputLocals[i7];
                } else if (i6 == 20971520) {
                    int[] iArr = this.inputStack;
                    i2 = iArr[iArr.length - i7];
                } else {
                    if (i != i4) {
                        return (i == 4194310 ? symbolTable.addType(symbolTable.getClassName()) : symbolTable.addType(symbolTable.getType(i & 1048575).value)) | 8388608;
                    }
                    continue;
                }
                i4 = i2 + i5;
                if (i != i4) {
                }
            }
        }
        return i;
    }

    private int getLocal(int i) {
        int[] iArr = this.outputLocals;
        if (iArr == null || i >= iArr.length) {
            return i | 16777216;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = 16777216 | i;
        iArr[i] = i3;
        return i3;
    }

    private int pop() {
        short s = this.outputStackTop;
        if (s <= 0) {
            short s2 = (short) (this.outputStackStart - 1);
            this.outputStackStart = s2;
            return (-s2) | 20971520;
        }
        int[] iArr = this.outputStack;
        short s3 = (short) (s - 1);
        this.outputStackTop = s3;
        return iArr[s3];
    }

    private void push(int i) {
        if (this.outputStack == null) {
            this.outputStack = new int[10];
        }
        int length = this.outputStack.length;
        short s = this.outputStackTop;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.outputStack, 0, iArr, 0, length);
            this.outputStack = iArr;
        }
        int[] iArr2 = this.outputStack;
        short s2 = this.outputStackTop;
        short s3 = (short) (s2 + 1);
        this.outputStackTop = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.outputStackStart + s3);
        Label label = this.owner;
        if (s4 > label.outputStackMax) {
            label.outputStackMax = s4;
        }
    }

    public static void putAbstractType(SymbolTable symbolTable, int i, ByteVector byteVector) {
        int i2 = ((-67108864) & i) >> 26;
        if (i2 == 0) {
            int i3 = i & 1048575;
            int i4 = i & 62914560;
            if (i4 == 4194304) {
                byteVector.putByte(i3);
                return;
            } else if (i4 == 8388608) {
                byteVector.putByte(7).putShort(symbolTable.addConstantClass(symbolTable.getType(i3).value).index);
                return;
            } else {
                if (i4 != 12582912) {
                    throw new AssertionError();
                }
                byteVector.putByte(8).putShort((int) symbolTable.getType(i3).data);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            sb.append('[');
            i2 = i5;
        }
        if ((i & 62914560) == 8388608) {
            sb.append('L');
            sb.append(symbolTable.getType(i & 1048575).value);
            sb.append(';');
        } else {
            int i6 = i & 1048575;
            if (i6 == 1) {
                sb.append('I');
            } else if (i6 == 2) {
                sb.append('F');
            } else if (i6 == 3) {
                sb.append('D');
            } else if (i6 != 4) {
                switch (i6) {
                    case 9:
                        sb.append('Z');
                        break;
                    case 10:
                        sb.append('B');
                        break;
                    case 11:
                        sb.append('C');
                        break;
                    case 12:
                        sb.append('S');
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                sb.append('J');
            }
        }
        byteVector.putByte(7).putShort(symbolTable.addConstantClass(sb.toString()).index);
    }

    private void setLocal(int i, int i2) {
        if (this.outputLocals == null) {
            this.outputLocals = new int[10];
        }
        int length = this.outputLocals.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.outputLocals, 0, iArr, 0, length);
            this.outputLocals = iArr;
        }
        this.outputLocals[i] = i2;
    }

    public final void accept(MethodWriter methodWriter) {
        int[] iArr = this.inputLocals;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != 4194308 && i6 != 4194307) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 4194304) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.inputStack;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
            i8++;
        }
        int visitFrameStart = methodWriter.visitFrameStart(this.owner.bytecodeOffset, i3, i8);
        int i10 = 0;
        while (true) {
            int i11 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i12 = iArr[i10];
            i10 += (i12 == 4194308 || i12 == 4194307) ? 2 : 1;
            methodWriter.visitAbstractType(visitFrameStart, i12);
            i3 = i11;
            visitFrameStart++;
        }
        while (true) {
            int i13 = i8 - 1;
            if (i8 <= 0) {
                methodWriter.visitFrameEnd();
                return;
            }
            int i14 = iArr2[i];
            i += (i14 == 4194308 || i14 == 4194307) ? 2 : 1;
            methodWriter.visitAbstractType(visitFrameStart, i14);
            visitFrameStart++;
            i8 = i13;
        }
    }

    public final void copyFrom(Frame frame) {
        this.inputLocals = frame.inputLocals;
        this.inputStack = frame.inputStack;
        this.outputStackStart = (short) 0;
        this.outputLocals = frame.outputLocals;
        this.outputStack = frame.outputStack;
        this.outputStackTop = frame.outputStackTop;
        this.initializationCount = frame.initializationCount;
        this.initializations = frame.initializations;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0316  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(int i, int i2, Symbol symbol, SymbolTable symbolTable) {
        switch (i) {
            case 0:
                return;
            case 1:
                push(4194309);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                push(4194305);
                return;
            case 9:
            case 10:
                push(4194308);
                push(4194304);
                return;
            case 11:
            case 12:
            case 13:
                push(4194306);
                return;
            case 14:
            case 15:
                push(4194307);
                push(4194304);
                return;
            case 18:
                int i3 = symbol.tag;
                switch (i3) {
                    case 3:
                        push(4194305);
                        return;
                    case 4:
                        push(4194306);
                        return;
                    case 5:
                        push(4194308);
                        push(4194304);
                        return;
                    case 6:
                        push(4194307);
                        push(4194304);
                        return;
                    case 7:
                        push(symbolTable.addType("java/lang/Class") | 8388608);
                        return;
                    case 8:
                        push(symbolTable.addType("java/lang/String") | 8388608);
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                push(symbolTable.addType("java/lang/invoke/MethodHandle") | 8388608);
                                return;
                            case 16:
                                push(symbolTable.addType("java/lang/invoke/MethodType") | 8388608);
                                return;
                            case 17:
                                push(symbolTable, symbol.value);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case 21:
                        break;
                    case 22:
                        break;
                    case 23:
                        break;
                    case 24:
                        break;
                    case 25:
                        push(getLocal(i2));
                        return;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                pop(2);
                                push(4194305);
                                return;
                            case 47:
                                pop(2);
                                push(4194308);
                                push(4194304);
                                return;
                            case 48:
                                pop(2);
                                push(4194306);
                                return;
                            case 49:
                                pop(2);
                                push(4194307);
                                push(4194304);
                                return;
                            case 50:
                                pop(1);
                                int pop = pop();
                                if (pop != 4194309) {
                                    pop -= 67108864;
                                }
                                push(pop);
                                return;
                            case 54:
                            case 56:
                            case 58:
                                setLocal(i2, pop());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int local = getLocal(i4);
                                    if (local == 4194308 || local == 4194307) {
                                        setLocal(i4, 4194304);
                                        return;
                                    }
                                    int i5 = local & 62914560;
                                    if (i5 == 16777216 || i5 == 20971520) {
                                        setLocal(i4, local | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 55:
                            case 57:
                                pop(1);
                                setLocal(i2, pop());
                                setLocal(i2 + 1, 4194304);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int local2 = getLocal(i6);
                                    if (local2 == 4194308 || local2 == 4194307) {
                                        setLocal(i6, 4194304);
                                        return;
                                    }
                                    int i7 = local2 & 62914560;
                                    if (i7 == 16777216 || i7 == 20971520) {
                                        setLocal(i6, local2 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        pop(3);
                                        return;
                                    case 80:
                                    case 82:
                                        pop(4);
                                        return;
                                    case 87:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 170:
                                    case 171:
                                    case 172:
                                    case 174:
                                    case 176:
                                    case 191:
                                    case 194:
                                    case 195:
                                        break;
                                    case 88:
                                    case 159:
                                    case 160:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 173:
                                    case 175:
                                        pop(2);
                                        return;
                                    case 89:
                                        int pop2 = pop();
                                        push(pop2);
                                        push(pop2);
                                        return;
                                    case 90:
                                        int pop3 = pop();
                                        int pop4 = pop();
                                        push(pop3);
                                        push(pop4);
                                        push(pop3);
                                        return;
                                    case 91:
                                        int pop5 = pop();
                                        int pop6 = pop();
                                        int pop7 = pop();
                                        push(pop5);
                                        push(pop7);
                                        push(pop6);
                                        push(pop5);
                                        return;
                                    case 92:
                                        int pop8 = pop();
                                        int pop9 = pop();
                                        push(pop9);
                                        push(pop8);
                                        push(pop9);
                                        push(pop8);
                                        return;
                                    case 93:
                                        int pop10 = pop();
                                        int pop11 = pop();
                                        int pop12 = pop();
                                        push(pop11);
                                        push(pop10);
                                        push(pop12);
                                        push(pop11);
                                        push(pop10);
                                        return;
                                    case 94:
                                        int pop13 = pop();
                                        int pop14 = pop();
                                        int pop15 = pop();
                                        int pop16 = pop();
                                        push(pop14);
                                        push(pop13);
                                        push(pop16);
                                        push(pop15);
                                        push(pop14);
                                        push(pop13);
                                        return;
                                    case 95:
                                        int pop17 = pop();
                                        int pop18 = pop();
                                        push(pop17);
                                        push(pop18);
                                        return;
                                    case 96:
                                    case 100:
                                    case 104:
                                    case 108:
                                    case 112:
                                    case 120:
                                    case 122:
                                    case 124:
                                    case 126:
                                    case 128 /* 128 */:
                                    case 130:
                                    case 136:
                                    case 142:
                                    case 149:
                                    case 150:
                                        break;
                                    case 97:
                                    case 101:
                                    case 105:
                                    case 109:
                                    case 113:
                                    case 127:
                                    case 129:
                                    case 131:
                                        pop(4);
                                        push(4194308);
                                        push(4194304);
                                        return;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case 110:
                                    case 114:
                                    case 137:
                                    case 144:
                                        break;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case 111:
                                    case 115:
                                        pop(4);
                                        push(4194307);
                                        push(4194304);
                                        return;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 167:
                                    case 177:
                                        return;
                                    case 121:
                                    case 123:
                                    case 125:
                                        pop(3);
                                        push(4194308);
                                        push(4194304);
                                        return;
                                    case 132:
                                        setLocal(i2, 4194305);
                                        return;
                                    case 133:
                                    case 140:
                                        pop(1);
                                        push(4194308);
                                        push(4194304);
                                        return;
                                    case 134:
                                        pop(1);
                                        push(4194306);
                                        return;
                                    case 135:
                                    case 141:
                                        pop(1);
                                        push(4194307);
                                        push(4194304);
                                        return;
                                    case 138:
                                        break;
                                    case 139:
                                    case 190:
                                    case 193:
                                        pop(1);
                                        push(4194305);
                                        return;
                                    case 143:
                                        break;
                                    case 148:
                                    case 151:
                                    case 152:
                                        pop(4);
                                        push(4194305);
                                        return;
                                    case 168:
                                    case 169:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case 178:
                                        push(symbolTable, symbol.value);
                                        return;
                                    case 179:
                                        pop(symbol.value);
                                        return;
                                    case 180:
                                        pop(1);
                                        push(symbolTable, symbol.value);
                                        return;
                                    case 181:
                                        pop(symbol.value);
                                        pop();
                                        return;
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                        pop(symbol.value);
                                        if (i != 184) {
                                            int pop19 = pop();
                                            if (i == 183 && symbol.name.charAt(0) == '<') {
                                                addInitializedType(pop19);
                                            }
                                        }
                                        push(symbolTable, symbol.value);
                                        return;
                                    case 186:
                                        pop(symbol.value);
                                        push(symbolTable, symbol.value);
                                        return;
                                    case 187:
                                        push(symbolTable.addUninitializedType(symbol.value, i2) | 12582912);
                                        return;
                                    case 188:
                                        pop();
                                        switch (i2) {
                                            case 4:
                                                push(71303177);
                                                return;
                                            case 5:
                                                push(71303179);
                                                return;
                                            case 6:
                                                push(71303170);
                                                return;
                                            case 7:
                                                push(71303171);
                                                return;
                                            case 8:
                                                push(71303178);
                                                return;
                                            case 9:
                                                push(71303180);
                                                return;
                                            case 10:
                                                push(71303169);
                                                return;
                                            case 11:
                                                push(71303172);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case 189:
                                        String str = symbol.value;
                                        pop();
                                        if (str.charAt(0) == '[') {
                                            push(symbolTable, "[".concat(str));
                                            return;
                                        } else {
                                            push(symbolTable.addType(str) | 75497472);
                                            return;
                                        }
                                    case 192:
                                        String str2 = symbol.value;
                                        pop();
                                        if (str2.charAt(0) == '[') {
                                            push(symbolTable, str2);
                                            return;
                                        } else {
                                            push(symbolTable.addType(str2) | 8388608);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case 197:
                                                pop(i2);
                                                push(symbolTable, symbol.value);
                                                return;
                                            case 198:
                                            case 199:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                }
                                pop(1);
                                return;
                        }
                }
        }
    }

    public final int getInputStackSize() {
        return this.inputStack.length;
    }

    public final boolean merge(SymbolTable symbolTable, Frame frame, int i) {
        boolean z;
        int i2;
        int length = this.inputLocals.length;
        int length2 = this.inputStack.length;
        boolean z2 = true;
        if (frame.inputLocals == null) {
            frame.inputLocals = new int[length];
            z = true;
        } else {
            z = false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int[] iArr = this.outputLocals;
            if (iArr == null || i3 >= iArr.length) {
                i2 = this.inputLocals[i3];
            } else {
                int i4 = iArr[i3];
                i2 = i4 == 0 ? this.inputLocals[i3] : getConcreteOutputType(i4, length2);
            }
            if (this.initializations != null) {
                i2 = getInitializedType(symbolTable, i2);
            }
            z |= merge(symbolTable, i2, frame.inputLocals, i3);
        }
        if (i > 0) {
            for (int i5 = 0; i5 < length; i5++) {
                z |= merge(symbolTable, this.inputLocals[i5], frame.inputLocals, i5);
            }
            if (frame.inputStack == null) {
                frame.inputStack = new int[1];
            } else {
                z2 = z;
            }
            return merge(symbolTable, i, frame.inputStack, 0) | z2;
        }
        int length3 = this.inputStack.length + this.outputStackStart;
        if (frame.inputStack == null) {
            frame.inputStack = new int[this.outputStackTop + length3];
        } else {
            z2 = z;
        }
        for (int i6 = 0; i6 < length3; i6++) {
            int i7 = this.inputStack[i6];
            if (this.initializations != null) {
                i7 = getInitializedType(symbolTable, i7);
            }
            z2 |= merge(symbolTable, i7, frame.inputStack, i6);
        }
        for (int i8 = 0; i8 < this.outputStackTop; i8++) {
            int concreteOutputType = getConcreteOutputType(this.outputStack[i8], length2);
            if (this.initializations != null) {
                concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
            }
            z2 |= merge(symbolTable, concreteOutputType, frame.inputStack, length3 + i8);
        }
        return z2;
    }

    public final void setInputFrameFromApiFormat(SymbolTable symbolTable, int i, Object[] objArr, int i2, Object[] objArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.inputLocals[i3] = getAbstractTypeFromApiFormat(symbolTable, objArr[i4]);
            Object obj = objArr[i4];
            if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                i3 += 2;
                this.inputLocals[i5] = 4194304;
            } else {
                i3 = i5;
            }
        }
        while (true) {
            int[] iArr = this.inputLocals;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = 4194304;
            i3++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            Object obj2 = objArr2[i7];
            if (obj2 == Opcodes.LONG || obj2 == Opcodes.DOUBLE) {
                i6++;
            }
        }
        this.inputStack = new int[i6 + i2];
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i8 + 1;
            this.inputStack[i8] = getAbstractTypeFromApiFormat(symbolTable, objArr2[i9]);
            Object obj3 = objArr2[i9];
            if (obj3 == Opcodes.LONG || obj3 == Opcodes.DOUBLE) {
                i8 += 2;
                this.inputStack[i10] = 4194304;
            } else {
                i8 = i10;
            }
        }
        this.outputStackTop = (short) 0;
        this.initializationCount = 0;
    }

    public final void setInputFrameFromDescriptor(SymbolTable symbolTable, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.inputLocals = iArr;
        this.inputStack = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 262144) == 0) {
                iArr[0] = symbolTable.addType(symbolTable.getClassName()) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i3 = 0;
        }
        for (Type type : Type.getArgumentTypes(str)) {
            int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, type.getDescriptor(), 0);
            int[] iArr2 = this.inputLocals;
            int i4 = i3 + 1;
            iArr2[i3] = abstractTypeFromDescriptor;
            if (abstractTypeFromDescriptor == 4194308 || abstractTypeFromDescriptor == 4194307) {
                i3 += 2;
                iArr2[i4] = 4194304;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.inputLocals[i3] = 4194304;
            i3++;
        }
    }

    private void pop(int i) {
        short s = this.outputStackTop;
        if (s >= i) {
            this.outputStackTop = (short) (s - i);
        } else {
            this.outputStackStart = (short) (this.outputStackStart - (i - s));
            this.outputStackTop = (short) 0;
        }
    }

    private void pop(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            pop((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (charAt != 'J' && charAt != 'D') {
            pop(1);
        } else {
            pop(2);
        }
    }

    private void push(SymbolTable symbolTable, String str) {
        int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, str, str.charAt(0) == '(' ? Type.getReturnTypeOffset(str) : 0);
        if (abstractTypeFromDescriptor != 0) {
            push(abstractTypeFromDescriptor);
            if (abstractTypeFromDescriptor == 4194308 || abstractTypeFromDescriptor == 4194307) {
                push(4194304);
            }
        }
    }

    private static boolean merge(SymbolTable symbolTable, int i, int[] iArr, int i2) {
        int min;
        int addType;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((67108863 & i) == 4194309) {
            if (i3 == 4194309) {
                return false;
            }
            i = 4194309;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & (-67108864);
        int i5 = 4194304;
        if (i4 != 0 || (i3 & 62914560) == 8388608) {
            if (i == 4194309) {
                return false;
            }
            if ((i & (-4194304)) != ((-4194304) & i3)) {
                int i6 = i & (-67108864);
                if (i6 != 0 || (i & 62914560) == 8388608) {
                    if (i6 != 0 && (i & 62914560) != 8388608) {
                        i6 -= 67108864;
                    }
                    if (i4 != 0 && (i3 & 62914560) != 8388608) {
                        i4 -= 67108864;
                    }
                    min = Math.min(i6, i4) | 8388608;
                    addType = symbolTable.addType("java/lang/Object");
                    i5 = min | addType;
                }
            } else if ((i3 & 62914560) == 8388608) {
                i5 = (i & (-67108864)) | 8388608 | symbolTable.addMergedType(i & 1048575, 1048575 & i3);
            } else {
                min = ((i & (-67108864)) - 67108864) | 8388608;
                addType = symbolTable.addType("java/lang/Object");
                i5 = min | addType;
            }
        } else if (i3 == 4194309) {
            if ((i & (-67108864)) == 0 && (i & 62914560) != 8388608) {
                i = 4194304;
            }
            i5 = i;
        }
        if (i5 == i3) {
            return false;
        }
        iArr[i2] = i5;
        return true;
    }
}
