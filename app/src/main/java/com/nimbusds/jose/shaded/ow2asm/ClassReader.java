package com.nimbusds.jose.shaded.ow2asm;

import defpackage.a;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes2.dex */
public class ClassReader {

    @Deprecated
    public final byte[] b;
    private final int[] bootstrapMethodOffsets;
    final byte[] classFileBuffer;
    private final ConstantDynamic[] constantDynamicValues;
    private final String[] constantUtf8Values;
    private final int[] cpInfoOffsets;
    public final int header;
    private final int maxStringLength;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ClassReader(byte[] bArr, int i, boolean z) {
        this.classFileBuffer = bArr;
        this.b = bArr;
        if (z) {
            int i2 = i + 6;
            if (readShort(i2) > 61) {
                throw new IllegalArgumentException("Unsupported class file major version " + ((int) readShort(i2)));
            }
        }
        int readUnsignedShort = readUnsignedShort(i + 8);
        this.cpInfoOffsets = new int[readUnsignedShort];
        this.constantUtf8Values = new String[readUnsignedShort];
        int i3 = i + 10;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = 1;
        while (i5 < readUnsignedShort) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            this.cpInfoOffsets[i5] = i7;
            int i8 = 3;
            switch (bArr[i3]) {
                case 1:
                    i8 = 3 + readUnsignedShort(i7);
                    if (i8 > i4) {
                        i5 = i6;
                        i4 = i8;
                        i3 += i8;
                    }
                    i5 = i6;
                    i3 += i8;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i5 = i6;
                    i8 = 5;
                    i3 += i8;
                case 5:
                case 6:
                    i5 += 2;
                    i8 = 9;
                    i3 += i8;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i5 = i6;
                    i3 += i8;
                case 15:
                    i8 = 4;
                    i5 = i6;
                    i3 += i8;
                case 17:
                    z2 = true;
                    z3 = true;
                    i5 = i6;
                    i8 = 5;
                    i3 += i8;
                case 18:
                    z3 = true;
                    i5 = i6;
                    i8 = 5;
                    i3 += i8;
            }
        }
        this.maxStringLength = i4;
        this.header = i3;
        this.constantDynamicValues = z2 ? new ConstantDynamic[readUnsignedShort] : null;
        this.bootstrapMethodOffsets = z3 ? readBootstrapMethodsAttribute(i4) : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0051, code lost:
    
        r11.currentFrameLocalCount = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0053, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void computeImplicitFrame(Context context) {
        int i;
        String str = context.currentMethodDescriptor;
        Object[] objArr = context.currentFrameLocalTypes;
        int i2 = 0;
        if ((context.currentMethodAccessFlags & 8) == 0) {
            if ("<init>".equals(context.currentMethodName)) {
                objArr[0] = Opcodes.UNINITIALIZED_THIS;
            } else {
                objArr[0] = readClass(this.header + 2, context.charBuffer);
            }
            i2 = 1;
        }
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt == 'F') {
                i = i2 + 1;
                objArr[i2] = Opcodes.FLOAT;
            } else if (charAt != 'L') {
                if (charAt != 'S' && charAt != 'I') {
                    if (charAt == 'J') {
                        i = i2 + 1;
                        objArr[i2] = Opcodes.LONG;
                    } else if (charAt != 'Z') {
                        if (charAt != '[') {
                            switch (charAt) {
                                case 'D':
                                    i = i2 + 1;
                                    objArr[i2] = Opcodes.DOUBLE;
                                    break;
                            }
                        } else {
                            while (str.charAt(i4) == '[') {
                                i4++;
                            }
                            if (str.charAt(i4) == 'L') {
                                do {
                                    i4++;
                                } while (str.charAt(i4) != ';');
                            }
                            int i5 = i4 + 1;
                            objArr[i2] = str.substring(i3, i5);
                            i3 = i5;
                            i2++;
                        }
                    }
                }
                i = i2 + 1;
                objArr[i2] = Opcodes.INTEGER;
            } else {
                int i6 = i4;
                while (str.charAt(i6) != ';') {
                    i6++;
                }
                objArr[i2] = str.substring(i4, i6);
                i2++;
                i3 = i6 + 1;
            }
            i2 = i;
            i3 = i4;
        }
    }

    private void createDebugLabel(int i, Label[] labelArr) {
        if (labelArr[i] == null) {
            Label readLabel = readLabel(i, labelArr);
            readLabel.flags = (short) (readLabel.flags | 1);
        }
    }

    private Label createLabel(int i, Label[] labelArr) {
        Label readLabel = readLabel(i, labelArr);
        readLabel.flags = (short) (readLabel.flags & (-2));
        return readLabel;
    }

    private int getTypeAnnotationBytecodeOffset(int[] iArr, int i) {
        if (iArr == null || i >= iArr.length || readByte(iArr[i]) < 67) {
            return -1;
        }
        return readUnsignedShort(iArr[i] + 1);
    }

    private Attribute readAttribute(Attribute[] attributeArr, String str, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        for (Attribute attribute : attributeArr) {
            if (attribute.type.equals(str)) {
                return attribute.read(this, i, i2, cArr, i3, labelArr);
            }
        }
        return new Attribute(str).read(this, i, i2, null, -1, null);
    }

    private int[] readBootstrapMethodsAttribute(int i) {
        char[] cArr = new char[i];
        int firstAttributeOffset = getFirstAttributeOffset();
        for (int readUnsignedShort = readUnsignedShort(firstAttributeOffset - 2); readUnsignedShort > 0; readUnsignedShort--) {
            String readUTF8 = readUTF8(firstAttributeOffset, cArr);
            int readInt = readInt(firstAttributeOffset + 2);
            int i2 = firstAttributeOffset + 6;
            if ("BootstrapMethods".equals(readUTF8)) {
                int readUnsignedShort2 = readUnsignedShort(i2);
                int[] iArr = new int[readUnsignedShort2];
                int i3 = firstAttributeOffset + 8;
                for (int i4 = 0; i4 < readUnsignedShort2; i4++) {
                    iArr[i4] = i3;
                    i3 += (readUnsignedShort(i3 + 2) * 2) + 4;
                }
                return iArr;
            }
            firstAttributeOffset = i2 + readInt;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void readCode(MethodVisitor methodVisitor, Context context, int i) {
        int i2;
        char[] cArr;
        Attribute attribute;
        byte[] bArr;
        int i3;
        int i4;
        Label[] labelArr;
        boolean z;
        int i5;
        MethodVisitor methodVisitor2;
        int i6;
        int[] iArr;
        int i7;
        String str;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        int i10;
        String str2;
        boolean z4;
        char c;
        int i11;
        int i12;
        boolean z5;
        int i13;
        int i14;
        int i15;
        int[] iArr2;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr3;
        int i20;
        boolean z6;
        int i21;
        int[] iArr4;
        int i22;
        int i23;
        int i24;
        byte b;
        int readUnsignedShort;
        byte b2;
        ClassReader classReader;
        Label[] labelArr2;
        int[] iArr5;
        int i25;
        ClassReader classReader2 = this;
        MethodVisitor methodVisitor3 = methodVisitor;
        byte[] bArr2 = classReader2.classFileBuffer;
        char[] cArr2 = context.charBuffer;
        int readUnsignedShort2 = classReader2.readUnsignedShort(i);
        int readUnsignedShort3 = classReader2.readUnsignedShort(i + 2);
        int readInt = classReader2.readInt(i + 4);
        int i26 = i + 8;
        if (readInt > classReader2.classFileBuffer.length - i26) {
            throw new IllegalArgumentException();
        }
        int i27 = i26 + readInt;
        Label[] labelArr3 = new Label[readInt + 1];
        context.currentMethodLabels = labelArr3;
        int i28 = i26;
        while (i28 < i27) {
            int i29 = i28 - i26;
            switch (bArr2[i28] & UByte.MAX_VALUE) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 121:
                case 122:
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128 /* 128 */:
                case 129:
                case 130:
                case 131:
                case 133:
                case 134:
                case 135:
                case 136:
                case 137:
                case 138:
                case 139:
                case 140:
                case 141:
                case 142:
                case 143:
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 172:
                case 173:
                case 174:
                case 175:
                case 176:
                case 177:
                case 190:
                case 191:
                case 194:
                case 195:
                    i28++;
                case 16:
                case 18:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 169:
                case 188:
                    i28 += 2;
                case 17:
                case 19:
                case 20:
                case 132:
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 187:
                case 189:
                case 192:
                case 193:
                    i28 += 3;
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 198:
                case 199:
                    classReader2.createLabel(classReader2.readShort(i28 + 1) + i29, labelArr3);
                    i28 += 3;
                case 170:
                    int i30 = (4 - (i29 & 3)) + i28;
                    classReader2.createLabel(classReader2.readInt(i30) + i29, labelArr3);
                    int readInt2 = (classReader2.readInt(i30 + 8) - classReader2.readInt(i30 + 4)) + 1;
                    i25 = i30 + 12;
                    while (true) {
                        int i31 = readInt2 - 1;
                        if (readInt2 > 0) {
                            classReader2.createLabel(classReader2.readInt(i25) + i29, labelArr3);
                            i25 += 4;
                            readInt2 = i31;
                        } else {
                            i28 = i25;
                        }
                    }
                case 171:
                    int i32 = (4 - (i29 & 3)) + i28;
                    classReader2.createLabel(classReader2.readInt(i32) + i29, labelArr3);
                    int readInt3 = classReader2.readInt(i32 + 4);
                    i25 = i32 + 8;
                    while (true) {
                        int i33 = readInt3 - 1;
                        if (readInt3 > 0) {
                            classReader2.createLabel(classReader2.readInt(i25 + 4) + i29, labelArr3);
                            i25 += 8;
                            readInt3 = i33;
                        } else {
                            i28 = i25;
                        }
                    }
                case 185:
                case 186:
                    i28 += 5;
                case 196:
                    int i34 = bArr2[i28 + 1] & UByte.MAX_VALUE;
                    if (i34 != 132) {
                        if (i34 != 169) {
                            switch (i34) {
                                default:
                                    switch (i34) {
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                            break;
                                        default:
                                            throw new IllegalArgumentException();
                                    }
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    i28 += 4;
                            }
                        }
                        i28 += 4;
                    } else {
                        i28 += 6;
                    }
                case 197:
                    i28 += 4;
                case 200:
                case 201:
                case 220:
                    classReader2.createLabel(classReader2.readInt(i28 + 1) + i29, labelArr3);
                    i28 += 5;
                case 202:
                case 203:
                case 204:
                case 205:
                case 206:
                case 207:
                case 208:
                case 209:
                case 210:
                case 211:
                case 212:
                case 213:
                case 214:
                case 215:
                case 216:
                case 217:
                case 218:
                case 219:
                    classReader2.createLabel(classReader2.readUnsignedShort(i28 + 1) + i29, labelArr3);
                    i28 += 3;
                default:
                    throw new IllegalArgumentException();
            }
        }
        byte b3 = 8;
        int readUnsignedShort4 = classReader2.readUnsignedShort(i28);
        int i35 = i28 + 2;
        while (true) {
            int i36 = readUnsignedShort4 - 1;
            if (readUnsignedShort4 > 0) {
                Label createLabel = classReader2.createLabel(classReader2.readUnsignedShort(i35), labelArr3);
                Label createLabel2 = classReader2.createLabel(classReader2.readUnsignedShort(i35 + 2), labelArr3);
                Label createLabel3 = classReader2.createLabel(classReader2.readUnsignedShort(i35 + 4), labelArr3);
                String readUTF8 = classReader2.readUTF8(classReader2.cpInfoOffsets[classReader2.readUnsignedShort(i35 + 6)], cArr2);
                i35 += 8;
                methodVisitor3.visitTryCatchBlock(createLabel, createLabel2, createLabel3, readUTF8);
                readUnsignedShort4 = i36;
            } else {
                int readUnsignedShort5 = classReader2.readUnsignedShort(i35);
                int i37 = i35 + 2;
                int[] iArr6 = null;
                int i38 = 0;
                int[] iArr7 = null;
                int i39 = 0;
                Attribute attribute2 = null;
                boolean z7 = true;
                int i40 = 0;
                int i41 = 0;
                while (true) {
                    int i42 = readUnsignedShort5 - 1;
                    if (readUnsignedShort5 <= 0) {
                        int[] iArr8 = iArr6;
                        byte b4 = b3;
                        boolean z8 = true;
                        ClassReader classReader3 = classReader2;
                        Label[] labelArr4 = labelArr3;
                        Attribute attribute3 = attribute2;
                        boolean z9 = (context.parsingOptions & b4) != 0;
                        if (i38 != 0) {
                            context.currentFrameOffset = -1;
                            context.currentFrameType = 0;
                            context.currentFrameLocalCount = 0;
                            context.currentFrameLocalCountDelta = 0;
                            context.currentFrameLocalTypes = new Object[readUnsignedShort3];
                            context.currentFrameStackCount = 0;
                            context.currentFrameStackTypes = new Object[readUnsignedShort2];
                            if (z9) {
                                classReader3.computeImplicitFrame(context);
                            }
                            int i43 = i38;
                            while (true) {
                                i2 = i39;
                                if (i43 < i2 - 2) {
                                    if (bArr2[i43] != b4 || (readUnsignedShort = classReader3.readUnsignedShort(i43 + 1)) < 0 || readUnsignedShort >= readInt) {
                                        i24 = i43;
                                        b = b4;
                                    } else {
                                        b = b4;
                                        i24 = i43;
                                        if ((bArr2[i26 + readUnsignedShort] & UByte.MAX_VALUE) == 187) {
                                            classReader3.createLabel(readUnsignedShort, labelArr4);
                                        }
                                    }
                                    i43 = i24 + 1;
                                    i39 = i2;
                                    b4 = b;
                                }
                            }
                        } else {
                            i2 = i39;
                        }
                        if (!z9 || (context.parsingOptions & 256) == 0) {
                            cArr = cArr2;
                            attribute = attribute3;
                            bArr = bArr2;
                            i3 = readUnsignedShort3;
                            i4 = readInt;
                            labelArr = labelArr4;
                            z = z9;
                            i5 = i2;
                            methodVisitor2 = methodVisitor;
                        } else {
                            attribute = attribute3;
                            bArr = bArr2;
                            i5 = i2;
                            z = z9;
                            i4 = readInt;
                            cArr = cArr2;
                            i3 = readUnsignedShort3;
                            labelArr = labelArr4;
                            methodVisitor2 = methodVisitor;
                            methodVisitor2.visitFrame(-1, i3, null, 0, null);
                        }
                        int[] iArr9 = iArr8;
                        int typeAnnotationBytecodeOffset = classReader3.getTypeAnnotationBytecodeOffset(iArr9, 0);
                        int[] iArr10 = iArr7;
                        int typeAnnotationBytecodeOffset2 = classReader3.getTypeAnnotationBytecodeOffset(iArr10, 0);
                        int i44 = (context.parsingOptions & 256) == 0 ? 33 : 0;
                        int i45 = i38;
                        int i46 = typeAnnotationBytecodeOffset;
                        int i47 = i45;
                        int i48 = i26;
                        int i49 = typeAnnotationBytecodeOffset2;
                        boolean z10 = false;
                        int i50 = 0;
                        int i51 = 0;
                        while (i48 < i27) {
                            int i52 = i48;
                            int i53 = i52 - i26;
                            int[] iArr11 = iArr9;
                            Label label = labelArr[i53];
                            int i54 = i3;
                            if (label != null) {
                                label.accept(methodVisitor2, (context.parsingOptions & 2) == 0 ? z8 : false);
                            }
                            while (i47 != 0) {
                                int i55 = context.currentFrameOffset;
                                if (i55 == i53 || i55 == -1) {
                                    if (i55 != -1) {
                                        if (!z7 || z) {
                                            iArr3 = iArr10;
                                            i20 = i26;
                                            z6 = z7;
                                            i21 = i27;
                                            iArr4 = iArr11;
                                            i22 = readUnsignedShort2;
                                            i23 = i47;
                                            methodVisitor.visitFrame(-1, context.currentFrameLocalCount, context.currentFrameLocalTypes, context.currentFrameStackCount, context.currentFrameStackTypes);
                                        } else {
                                            iArr3 = iArr10;
                                            i20 = i26;
                                            z6 = z7;
                                            i21 = i27;
                                            iArr4 = iArr11;
                                            i22 = readUnsignedShort2;
                                            i23 = i47;
                                            methodVisitor2.visitFrame(context.currentFrameType, context.currentFrameLocalCountDelta, context.currentFrameLocalTypes, context.currentFrameStackCount, context.currentFrameStackTypes);
                                        }
                                        z10 = false;
                                    } else {
                                        iArr3 = iArr10;
                                        i20 = i26;
                                        z6 = z7;
                                        i21 = i27;
                                        iArr4 = iArr11;
                                        i22 = readUnsignedShort2;
                                        i23 = i47;
                                    }
                                    if (i23 < i5) {
                                        i47 = classReader3.readStackMapFrame(i23, z6, z, context);
                                        methodVisitor2 = methodVisitor;
                                        readUnsignedShort2 = i22;
                                        iArr10 = iArr3;
                                    } else {
                                        methodVisitor2 = methodVisitor;
                                        readUnsignedShort2 = i22;
                                        iArr10 = iArr3;
                                        i47 = 0;
                                    }
                                    iArr11 = iArr4;
                                    i27 = i21;
                                    z7 = z6;
                                    i26 = i20;
                                } else {
                                    int[] iArr12 = iArr10;
                                    int i56 = i26;
                                    boolean z11 = z7;
                                    int i57 = i27;
                                    int[] iArr13 = iArr11;
                                    int i58 = readUnsignedShort2;
                                    int i59 = i47;
                                    if (z10) {
                                        methodVisitor2 = methodVisitor;
                                        z2 = z10;
                                    } else {
                                        if ((context.parsingOptions & 8) != 0) {
                                            methodVisitor2 = methodVisitor;
                                            methodVisitor2.visitFrame(256, 0, null, 0, null);
                                        } else {
                                            methodVisitor2 = methodVisitor;
                                        }
                                        z2 = false;
                                    }
                                    i8 = bArr[i52] & UByte.MAX_VALUE;
                                    switch (i8) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128 /* 128 */:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                        case 140:
                                        case 141:
                                        case 142:
                                        case 143:
                                        case 144:
                                        case 145:
                                        case 146:
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        case 151:
                                        case 152:
                                        case 172:
                                        case 173:
                                        case 174:
                                        case 175:
                                        case 176:
                                        case 177:
                                        case 190:
                                        case 191:
                                        case 194:
                                        case 195:
                                            i9 = i5;
                                            z3 = z;
                                            methodVisitor2.visitInsn(i8);
                                            i10 = i52 + 1;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null && i12 < iArr13.length && i11 <= i53) {
                                                if (i11 != i53) {
                                                    int readTypeAnnotationTarget = classReader3.readTypeAnnotationTarget(context, iArr13[i12]);
                                                    i19 = i10;
                                                    boolean z12 = z8;
                                                    classReader3.readElementValues(methodVisitor2.visitInsnAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader3.readUTF8(readTypeAnnotationTarget, cArr), z12), readTypeAnnotationTarget + 2, z12, cArr);
                                                } else {
                                                    i19 = i10;
                                                }
                                                i12++;
                                                i11 = classReader3.getTypeAnnotationBytecodeOffset(iArr13, i12);
                                                i10 = i19;
                                                z8 = true;
                                            }
                                            int i60 = i10;
                                            int i61 = i51;
                                            int i62 = i49;
                                            while (iArr12 != null) {
                                                iArr2 = iArr12;
                                                if (i61 >= iArr2.length || i62 > i53) {
                                                    i13 = i61;
                                                    i14 = i11;
                                                    i15 = i59;
                                                    i5 = i9;
                                                    i49 = i62;
                                                    iArr10 = iArr2;
                                                    iArr9 = iArr13;
                                                    i48 = i60;
                                                    i27 = i57;
                                                    i46 = i14;
                                                    readUnsignedShort2 = i58;
                                                    i3 = i54;
                                                    z = z3;
                                                    z8 = true;
                                                    z7 = z11;
                                                    i51 = i13;
                                                    i26 = i56;
                                                    i50 = i12;
                                                    i47 = i15;
                                                } else {
                                                    if (i62 == i53) {
                                                        int readTypeAnnotationTarget2 = classReader3.readTypeAnnotationTarget(context, iArr2[i61]);
                                                        i16 = i61;
                                                        i17 = i11;
                                                        i18 = i59;
                                                        classReader3.readElementValues(methodVisitor2.visitInsnAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader3.readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                                                    } else {
                                                        i16 = i61;
                                                        i17 = i11;
                                                        i18 = i59;
                                                    }
                                                    i61 = i16 + 1;
                                                    i62 = classReader3.getTypeAnnotationBytecodeOffset(iArr2, i61);
                                                    iArr12 = iArr2;
                                                    i11 = i17;
                                                    i59 = i18;
                                                }
                                            }
                                            i13 = i61;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i62;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i60;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                            break;
                                        case 16:
                                        case 188:
                                            i9 = i5;
                                            z3 = z;
                                            methodVisitor2.visitIntInsn(i8, bArr[i52 + 1]);
                                            i10 = i52 + 2;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                                if (i11 != i53) {
                                                }
                                                i12++;
                                                i11 = classReader3.getTypeAnnotationBytecodeOffset(iArr13, i12);
                                                i10 = i19;
                                                z8 = true;
                                                break;
                                            }
                                            int i602 = i10;
                                            int i612 = i51;
                                            int i622 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i612;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i622;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i602;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                            break;
                                        case 17:
                                            i9 = i5;
                                            z3 = z;
                                            methodVisitor2.visitIntInsn(i8, classReader3.readShort(i52 + 1));
                                            i10 = i52 + 3;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i6022 = i10;
                                            int i6122 = i51;
                                            int i6222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i6122;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i6222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i6022;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 18:
                                            i9 = i5;
                                            z3 = z;
                                            methodVisitor2.visitLdcInsn(classReader3.readConst(bArr[i52 + 1] & UByte.MAX_VALUE, cArr));
                                            i10 = i52 + 2;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i60222 = i10;
                                            int i61222 = i51;
                                            int i62222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i61222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i62222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i60222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 19:
                                        case 20:
                                            i9 = i5;
                                            z3 = z;
                                            methodVisitor2.visitLdcInsn(classReader3.readConst(classReader3.readUnsignedShort(i52 + 1), cArr));
                                            i10 = i52 + 3;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i602222 = i10;
                                            int i612222 = i51;
                                            int i622222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i612222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i622222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i602222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 169:
                                            i9 = i5;
                                            z3 = z;
                                            methodVisitor2.visitVarInsn(i8, bArr[i52 + 1] & UByte.MAX_VALUE);
                                            i10 = i52 + 2;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i6022222 = i10;
                                            int i6122222 = i51;
                                            int i6222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i6122222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i6222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i6022222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                            i9 = i5;
                                            z3 = z;
                                            int i63 = i8 - 26;
                                            methodVisitor2.visitVarInsn((i63 >> 2) + 21, i63 & 3);
                                            i10 = i52 + 1;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i60222222 = i10;
                                            int i61222222 = i51;
                                            int i62222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i61222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i62222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i60222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                            i9 = i5;
                                            z3 = z;
                                            int i64 = i8 - 59;
                                            methodVisitor2.visitVarInsn((i64 >> 2) + 54, i64 & 3);
                                            i10 = i52 + 1;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i602222222 = i10;
                                            int i612222222 = i51;
                                            int i622222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i612222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i622222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i602222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 132:
                                            i9 = i5;
                                            z3 = z;
                                            methodVisitor2.visitIincInsn(bArr[i52 + 1] & UByte.MAX_VALUE, bArr[i52 + 2]);
                                            i10 = i52 + 3;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i6022222222 = i10;
                                            int i6122222222 = i51;
                                            int i6222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i6122222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i6222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i6022222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                        case 160:
                                        case 161:
                                        case 162:
                                        case 163:
                                        case 164:
                                        case 165:
                                        case 166:
                                        case 167:
                                        case 168:
                                        case 198:
                                        case 199:
                                            i9 = i5;
                                            z3 = z;
                                            methodVisitor2.visitJumpInsn(i8, labelArr[classReader3.readShort(i52 + 1) + i53]);
                                            i10 = i52 + 3;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i60222222222 = i10;
                                            int i61222222222 = i51;
                                            int i62222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i61222222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i62222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i60222222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 170:
                                            i9 = i5;
                                            z3 = z;
                                            int i65 = (4 - (i53 & 3)) + i52;
                                            Label label2 = labelArr[classReader3.readInt(i65) + i53];
                                            int readInt4 = classReader3.readInt(i65 + 4);
                                            int readInt5 = classReader3.readInt(i65 + 8);
                                            i10 = i65 + 12;
                                            int i66 = (readInt5 - readInt4) + 1;
                                            Label[] labelArr5 = new Label[i66];
                                            for (int i67 = 0; i67 < i66; i67++) {
                                                labelArr5[i67] = labelArr[classReader3.readInt(i10) + i53];
                                                i10 += 4;
                                            }
                                            methodVisitor2.visitTableSwitchInsn(readInt4, readInt5, label2, labelArr5);
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i602222222222 = i10;
                                            int i612222222222 = i51;
                                            int i622222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i612222222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i622222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i602222222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 171:
                                            i9 = i5;
                                            z3 = z;
                                            int i68 = (4 - (i53 & 3)) + i52;
                                            Label label3 = labelArr[classReader3.readInt(i68) + i53];
                                            int readInt6 = classReader3.readInt(i68 + 4);
                                            i10 = i68 + 8;
                                            int[] iArr14 = new int[readInt6];
                                            Label[] labelArr6 = new Label[readInt6];
                                            for (int i69 = 0; i69 < readInt6; i69++) {
                                                iArr14[i69] = classReader3.readInt(i10);
                                                labelArr6[i69] = labelArr[classReader3.readInt(i10 + 4) + i53];
                                                i10 += 8;
                                            }
                                            methodVisitor2.visitLookupSwitchInsn(label3, iArr14, labelArr6);
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i6022222222222 = i10;
                                            int i6122222222222 = i51;
                                            int i6222222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i6122222222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i6222222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i6022222222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 178:
                                        case 179:
                                        case 180:
                                        case 181:
                                        case 182:
                                        case 183:
                                        case 184:
                                        case 185:
                                            i9 = i5;
                                            z3 = z;
                                            int i70 = classReader3.cpInfoOffsets[classReader3.readUnsignedShort(i52 + 1)];
                                            int i71 = classReader3.cpInfoOffsets[classReader3.readUnsignedShort(i70 + 2)];
                                            String readClass = classReader3.readClass(i70, cArr);
                                            String readUTF82 = classReader3.readUTF8(i71, cArr);
                                            String readUTF83 = classReader3.readUTF8(i71 + 2, cArr);
                                            if (i8 < 182) {
                                                methodVisitor2.visitFieldInsn(i8, readClass, readUTF82, readUTF83);
                                            } else {
                                                if (bArr[i70 - 1] == 11) {
                                                    str2 = readUTF83;
                                                    z4 = z8;
                                                } else {
                                                    str2 = readUTF83;
                                                    z4 = false;
                                                }
                                                methodVisitor2.visitMethodInsn(i8, readClass, readUTF82, str2, z4);
                                            }
                                            if (i8 == 185) {
                                                i10 = i52 + 5;
                                                i11 = i46;
                                                i12 = i50;
                                                z10 = z2;
                                                while (iArr13 != null) {
                                                }
                                                int i60222222222222 = i10;
                                                int i61222222222222 = i51;
                                                int i62222222222222 = i49;
                                                while (iArr12 != null) {
                                                }
                                                i13 = i61222222222222;
                                                i14 = i11;
                                                i15 = i59;
                                                iArr2 = iArr12;
                                                i5 = i9;
                                                i49 = i62222222222222;
                                                iArr10 = iArr2;
                                                iArr9 = iArr13;
                                                i48 = i60222222222222;
                                                i27 = i57;
                                                i46 = i14;
                                                readUnsignedShort2 = i58;
                                                i3 = i54;
                                                z = z3;
                                                z8 = true;
                                                z7 = z11;
                                                i51 = i13;
                                                i26 = i56;
                                                i50 = i12;
                                                i47 = i15;
                                            }
                                            i10 = i52 + 3;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i602222222222222 = i10;
                                            int i612222222222222 = i51;
                                            int i622222222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i612222222222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i622222222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i602222222222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 186:
                                            int i72 = classReader3.cpInfoOffsets[classReader3.readUnsignedShort(i52 + 1)];
                                            int i73 = classReader3.cpInfoOffsets[classReader3.readUnsignedShort(i72 + 2)];
                                            String readUTF84 = classReader3.readUTF8(i73, cArr);
                                            String readUTF85 = classReader3.readUTF8(i73 + 2, cArr);
                                            int i74 = classReader3.bootstrapMethodOffsets[classReader3.readUnsignedShort(i72)];
                                            Handle handle = (Handle) classReader3.readConst(classReader3.readUnsignedShort(i74), cArr);
                                            int readUnsignedShort6 = classReader3.readUnsignedShort(i74 + 2);
                                            Object[] objArr = new Object[readUnsignedShort6];
                                            z3 = z;
                                            int i75 = i74 + 4;
                                            i9 = i5;
                                            int i76 = 0;
                                            while (i76 < readUnsignedShort6) {
                                                objArr[i76] = classReader3.readConst(classReader3.readUnsignedShort(i75), cArr);
                                                i75 += 2;
                                                i76++;
                                                readUnsignedShort6 = readUnsignedShort6;
                                            }
                                            methodVisitor2.visitInvokeDynamicInsn(readUTF84, readUTF85, handle, objArr);
                                            i10 = i52 + 5;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i6022222222222222 = i10;
                                            int i6122222222222222 = i51;
                                            int i6222222222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i6122222222222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i6222222222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i6022222222222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 187:
                                        case 189:
                                        case 192:
                                        case 193:
                                            c = 132;
                                            methodVisitor2.visitTypeInsn(i8, classReader3.readClass(i52 + 1, cArr));
                                            i10 = i52 + 3;
                                            i9 = i5;
                                            z3 = z;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i60222222222222222 = i10;
                                            int i61222222222222222 = i51;
                                            int i62222222222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i61222222222222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i62222222222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i60222222222222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 196:
                                            int i77 = bArr[i52 + 1] & UByte.MAX_VALUE;
                                            c = 132;
                                            if (i77 == 132) {
                                                methodVisitor2.visitIincInsn(classReader3.readUnsignedShort(i52 + 2), classReader3.readShort(i52 + 4));
                                                i10 = i52 + 6;
                                            } else {
                                                methodVisitor2.visitVarInsn(i77, classReader3.readUnsignedShort(i52 + 2));
                                                i10 = i52 + 4;
                                            }
                                            i9 = i5;
                                            z3 = z;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i602222222222222222 = i10;
                                            int i612222222222222222 = i51;
                                            int i622222222222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i612222222222222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i622222222222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i602222222222222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 197:
                                            methodVisitor2.visitMultiANewArrayInsn(classReader3.readClass(i52 + 1, cArr), bArr[i52 + 3] & UByte.MAX_VALUE);
                                            i10 = i52 + 4;
                                            i9 = i5;
                                            z3 = z;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i6022222222222222222 = i10;
                                            int i6122222222222222222 = i51;
                                            int i6222222222222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i6122222222222222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i6222222222222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i6022222222222222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 200:
                                        case 201:
                                            methodVisitor2.visitJumpInsn(i8 - i44, labelArr[classReader3.readInt(i52 + 1) + i53]);
                                            i10 = i52 + 5;
                                            i9 = i5;
                                            z3 = z;
                                            i11 = i46;
                                            i12 = i50;
                                            z10 = z2;
                                            while (iArr13 != null) {
                                            }
                                            int i60222222222222222222 = i10;
                                            int i61222222222222222222 = i51;
                                            int i62222222222222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i61222222222222222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i62222222222222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i60222222222222222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        case 202:
                                        case 203:
                                        case 204:
                                        case 205:
                                        case 206:
                                        case 207:
                                        case 208:
                                        case 209:
                                        case 210:
                                        case 211:
                                        case 212:
                                        case 213:
                                        case 214:
                                        case 215:
                                        case 216:
                                        case 217:
                                        case 218:
                                        case 219:
                                            int i78 = i8 < 218 ? i8 - 49 : i8 - 20;
                                            Label label4 = labelArr[classReader3.readUnsignedShort(i52 + 1) + i53];
                                            if (i78 == 167 || i78 == 168) {
                                                methodVisitor2.visitJumpInsn(i78 + 33, label4);
                                                z5 = z2;
                                            } else {
                                                methodVisitor2.visitJumpInsn(i78 < 167 ? ((i78 + 1) ^ 1) - 1 : i78 ^ 1, classReader3.createLabel(i53 + 3, labelArr));
                                                methodVisitor2.visitJumpInsn(200, label4);
                                                z5 = z8;
                                            }
                                            i10 = i52 + 3;
                                            z10 = z5;
                                            i9 = i5;
                                            z3 = z;
                                            i11 = i46;
                                            i12 = i50;
                                            while (iArr13 != null) {
                                            }
                                            int i602222222222222222222 = i10;
                                            int i612222222222222222222 = i51;
                                            int i622222222222222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i612222222222222222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i622222222222222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i602222222222222222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                            break;
                                        case 220:
                                            methodVisitor2.visitJumpInsn(200, labelArr[classReader3.readInt(i52 + 1) + i53]);
                                            i10 = i52 + 5;
                                            i9 = i5;
                                            z3 = z;
                                            i11 = i46;
                                            z10 = z8;
                                            i12 = i50;
                                            while (iArr13 != null) {
                                            }
                                            int i6022222222222222222222 = i10;
                                            int i6122222222222222222222 = i51;
                                            int i6222222222222222222222 = i49;
                                            while (iArr12 != null) {
                                            }
                                            i13 = i6122222222222222222222;
                                            i14 = i11;
                                            i15 = i59;
                                            iArr2 = iArr12;
                                            i5 = i9;
                                            i49 = i6222222222222222222222;
                                            iArr10 = iArr2;
                                            iArr9 = iArr13;
                                            i48 = i6022222222222222222222;
                                            i27 = i57;
                                            i46 = i14;
                                            readUnsignedShort2 = i58;
                                            i3 = i54;
                                            z = z3;
                                            z8 = true;
                                            z7 = z11;
                                            i51 = i13;
                                            i26 = i56;
                                            i50 = i12;
                                            i47 = i15;
                                        default:
                                            throw new AssertionError();
                                    }
                                }
                            }
                            int[] iArr122 = iArr10;
                            int i562 = i26;
                            boolean z112 = z7;
                            int i572 = i27;
                            int[] iArr132 = iArr11;
                            int i582 = readUnsignedShort2;
                            int i592 = i47;
                            if (z10) {
                            }
                            i8 = bArr[i52] & UByte.MAX_VALUE;
                            switch (i8) {
                            }
                        }
                        int[] iArr15 = iArr9;
                        int i79 = i3;
                        int[] iArr16 = iArr10;
                        int i80 = readUnsignedShort2;
                        int i81 = 0;
                        Label label5 = labelArr[i4];
                        if (label5 != null) {
                            methodVisitor2.visitLabel(label5);
                        }
                        int i82 = i40;
                        if (i82 != 0 && (context.parsingOptions & 2) == 0) {
                            int i83 = i41;
                            if (i83 != 0) {
                                int readUnsignedShort7 = classReader3.readUnsignedShort(i83) * 3;
                                int[] iArr17 = new int[readUnsignedShort7];
                                int i84 = i83 + 2;
                                while (readUnsignedShort7 > 0) {
                                    iArr17[readUnsignedShort7 - 1] = i84 + 6;
                                    iArr17[readUnsignedShort7 - 2] = classReader3.readUnsignedShort(i84 + 8);
                                    readUnsignedShort7 -= 3;
                                    iArr17[readUnsignedShort7] = classReader3.readUnsignedShort(i84);
                                    i84 += 10;
                                }
                                iArr = iArr17;
                            } else {
                                iArr = null;
                            }
                            int readUnsignedShort8 = classReader3.readUnsignedShort(i82);
                            int i85 = i82 + 2;
                            while (true) {
                                int i86 = readUnsignedShort8 - 1;
                                if (readUnsignedShort8 > 0) {
                                    int readUnsignedShort9 = classReader3.readUnsignedShort(i85);
                                    int readUnsignedShort10 = classReader3.readUnsignedShort(i85 + 2);
                                    String readUTF86 = classReader3.readUTF8(i85 + 4, cArr);
                                    String readUTF87 = classReader3.readUTF8(i85 + 6, cArr);
                                    int readUnsignedShort11 = classReader3.readUnsignedShort(i85 + 8);
                                    int i87 = i85 + 10;
                                    if (iArr != null) {
                                        for (int i88 = i81; i88 < iArr.length; i88 += 3) {
                                            if (iArr[i88] == readUnsignedShort9 && iArr[i88 + 1] == readUnsignedShort11) {
                                                str = classReader3.readUTF8(iArr[i88 + 2], cArr);
                                                i7 = readUnsignedShort10;
                                                methodVisitor2.visitLocalVariable(readUTF86, readUTF87, str, labelArr[readUnsignedShort9], labelArr[i7 + readUnsignedShort9], readUnsignedShort11);
                                                methodVisitor2 = methodVisitor;
                                                classReader3 = classReader3;
                                                readUnsignedShort8 = i86;
                                                i85 = i87;
                                                i81 = 0;
                                            }
                                        }
                                    }
                                    i7 = readUnsignedShort10;
                                    str = null;
                                    methodVisitor2.visitLocalVariable(readUTF86, readUTF87, str, labelArr[readUnsignedShort9], labelArr[i7 + readUnsignedShort9], readUnsignedShort11);
                                    methodVisitor2 = methodVisitor;
                                    classReader3 = classReader3;
                                    readUnsignedShort8 = i86;
                                    i85 = i87;
                                    i81 = 0;
                                }
                            }
                        }
                        ClassReader classReader4 = classReader3;
                        int i89 = 65;
                        int i90 = 64;
                        if (iArr15 != null) {
                            int length = iArr15.length;
                            int i91 = 0;
                            while (i91 < length) {
                                int i92 = iArr15[i91];
                                int readByte = classReader4.readByte(i92);
                                if (readByte == 64 || readByte == i89) {
                                    int readTypeAnnotationTarget3 = classReader4.readTypeAnnotationTarget(context, i92);
                                    i6 = i91;
                                    classReader4.readElementValues(methodVisitor.visitLocalVariableAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, context.currentLocalVariableAnnotationRangeStarts, context.currentLocalVariableAnnotationRangeEnds, context.currentLocalVariableAnnotationRangeIndices, classReader4.readUTF8(readTypeAnnotationTarget3, cArr), true), readTypeAnnotationTarget3 + 2, true, cArr);
                                } else {
                                    i6 = i91;
                                }
                                i91 = i6 + 1;
                                i89 = 65;
                            }
                        }
                        if (iArr16 != null) {
                            int length2 = iArr16.length;
                            int i93 = 0;
                            while (i93 < length2) {
                                int i94 = iArr16[i93];
                                int readByte2 = classReader4.readByte(i94);
                                if (readByte2 == i90 || readByte2 == 65) {
                                    int readTypeAnnotationTarget4 = classReader4.readTypeAnnotationTarget(context, i94);
                                    classReader4.readElementValues(methodVisitor.visitLocalVariableAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, context.currentLocalVariableAnnotationRangeStarts, context.currentLocalVariableAnnotationRangeEnds, context.currentLocalVariableAnnotationRangeIndices, classReader4.readUTF8(readTypeAnnotationTarget4, cArr), false), readTypeAnnotationTarget4 + 2, true, cArr);
                                }
                                i93++;
                                i90 = 64;
                            }
                        }
                        Attribute attribute4 = attribute;
                        while (attribute4 != null) {
                            Attribute attribute5 = attribute4.nextAttribute;
                            attribute4.nextAttribute = null;
                            methodVisitor.visitAttribute(attribute4);
                            attribute4 = attribute5;
                        }
                        methodVisitor.visitMaxs(i80, i79);
                        return;
                    }
                    String readUTF88 = classReader2.readUTF8(i37, cArr2);
                    int readInt7 = classReader2.readInt(i37 + 2);
                    int i95 = i37 + 6;
                    if ("LocalVariableTable".equals(readUTF88)) {
                        if ((context.parsingOptions & 2) == 0) {
                            int readUnsignedShort12 = classReader2.readUnsignedShort(i95);
                            int i96 = i37 + 8;
                            while (true) {
                                int i97 = readUnsignedShort12 - 1;
                                if (readUnsignedShort12 > 0) {
                                    int readUnsignedShort13 = classReader2.readUnsignedShort(i96);
                                    classReader2.createDebugLabel(readUnsignedShort13, labelArr3);
                                    int i98 = i96;
                                    classReader2.createDebugLabel(classReader2.readUnsignedShort(i98 + 2) + readUnsignedShort13, labelArr3);
                                    i96 = i98 + 10;
                                    readUnsignedShort12 = i97;
                                } else {
                                    i40 = i95;
                                }
                            }
                        }
                    } else if ("LocalVariableTypeTable".equals(readUTF88)) {
                        i41 = i95;
                    } else if (!"LineNumberTable".equals(readUTF88)) {
                        if ("RuntimeVisibleTypeAnnotations".equals(readUTF88)) {
                            iArr5 = classReader2.readTypeAnnotations(methodVisitor3, context, i95, true);
                            classReader = classReader2;
                            labelArr2 = labelArr3;
                            b2 = b3;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF88)) {
                            iArr7 = classReader2.readTypeAnnotations(methodVisitor3, context, i95, false);
                        } else if ("StackMapTable".equals(readUTF88)) {
                            if ((context.parsingOptions & 4) == 0) {
                                i38 = i37 + 8;
                                i39 = i95 + readInt7;
                            }
                        } else if (!"StackMap".equals(readUTF88)) {
                            int[] iArr18 = iArr6;
                            b2 = b3;
                            Attribute readAttribute = classReader2.readAttribute(context.attributePrototypes, readUTF88, i95, readInt7, cArr2, i, labelArr3);
                            classReader = classReader2;
                            labelArr2 = labelArr3;
                            readAttribute.nextAttribute = attribute2;
                            attribute2 = readAttribute;
                            iArr5 = iArr18;
                        } else if ((context.parsingOptions & 4) == 0) {
                            i38 = i37 + 8;
                            i39 = i95 + readInt7;
                            iArr5 = iArr6;
                            b2 = b3;
                            z7 = false;
                            classReader = classReader2;
                            labelArr2 = labelArr3;
                        }
                        labelArr3 = labelArr2;
                        classReader2 = classReader;
                        b3 = b2;
                        methodVisitor3 = methodVisitor;
                        iArr6 = iArr5;
                        i37 = i95 + readInt7;
                        readUnsignedShort5 = i42;
                    } else if ((context.parsingOptions & 2) == 0) {
                        int readUnsignedShort14 = classReader2.readUnsignedShort(i95);
                        int i99 = i37 + 8;
                        while (true) {
                            int i100 = readUnsignedShort14 - 1;
                            if (readUnsignedShort14 > 0) {
                                int readUnsignedShort15 = classReader2.readUnsignedShort(i99);
                                int i101 = i99;
                                int readUnsignedShort16 = classReader2.readUnsignedShort(i101 + 2);
                                classReader2.createDebugLabel(readUnsignedShort15, labelArr3);
                                labelArr3[readUnsignedShort15].addLineNumber(readUnsignedShort16);
                                readUnsignedShort14 = i100;
                                i99 = i101 + 4;
                            }
                        }
                    }
                    iArr5 = iArr6;
                    b2 = b3;
                    classReader = classReader2;
                    labelArr2 = labelArr3;
                    labelArr3 = labelArr2;
                    classReader2 = classReader;
                    b3 = b2;
                    methodVisitor3 = methodVisitor;
                    iArr6 = iArr5;
                    i37 = i95 + readInt7;
                    readUnsignedShort5 = i42;
                }
            }
        }
    }

    private ConstantDynamic readConstantDynamic(int i, char[] cArr) {
        ConstantDynamic constantDynamic = this.constantDynamicValues[i];
        if (constantDynamic != null) {
            return constantDynamic;
        }
        int[] iArr = this.cpInfoOffsets;
        int i2 = iArr[i];
        int i3 = iArr[readUnsignedShort(i2 + 2)];
        String readUTF8 = readUTF8(i3, cArr);
        String readUTF82 = readUTF8(i3 + 2, cArr);
        int i4 = this.bootstrapMethodOffsets[readUnsignedShort(i2)];
        Handle handle = (Handle) readConst(readUnsignedShort(i4), cArr);
        int readUnsignedShort = readUnsignedShort(i4 + 2);
        Object[] objArr = new Object[readUnsignedShort];
        int i5 = i4 + 4;
        for (int i6 = 0; i6 < readUnsignedShort; i6++) {
            objArr[i6] = readConst(readUnsignedShort(i5), cArr);
            i5 += 2;
        }
        ConstantDynamic[] constantDynamicArr = this.constantDynamicValues;
        ConstantDynamic constantDynamic2 = new ConstantDynamic(readUTF8, readUTF82, handle, objArr);
        constantDynamicArr[i] = constantDynamic2;
        return constantDynamic2;
    }

    private int readElementValue(AnnotationVisitor annotationVisitor, int i, String str, char[] cArr) {
        int i2 = 0;
        if (annotationVisitor == null) {
            int i3 = this.classFileBuffer[i] & UByte.MAX_VALUE;
            return i3 != 64 ? i3 != 91 ? i3 != 101 ? i + 3 : i + 5 : readElementValues(null, i + 1, false, cArr) : readElementValues(null, i + 3, true, cArr);
        }
        int i4 = i + 1;
        int i5 = this.classFileBuffer[i] & UByte.MAX_VALUE;
        if (i5 == 64) {
            return readElementValues(annotationVisitor.visitAnnotation(str, readUTF8(i4, cArr)), i + 3, true, cArr);
        }
        if (i5 != 70) {
            if (i5 == 83) {
                annotationVisitor.visit(str, Short.valueOf((short) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                return i + 3;
            }
            if (i5 == 99) {
                annotationVisitor.visit(str, Type.getType(readUTF8(i4, cArr)));
                return i + 3;
            }
            if (i5 == 101) {
                annotationVisitor.visitEnum(str, readUTF8(i4, cArr), readUTF8(i + 3, cArr));
                return i + 5;
            }
            if (i5 == 115) {
                annotationVisitor.visit(str, readUTF8(i4, cArr));
                return i + 3;
            }
            if (i5 != 73 && i5 != 74) {
                if (i5 == 90) {
                    annotationVisitor.visit(str, readInt(this.cpInfoOffsets[readUnsignedShort(i4)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                    return i + 3;
                }
                if (i5 == 91) {
                    int readUnsignedShort = readUnsignedShort(i4);
                    int i6 = i + 3;
                    if (readUnsignedShort == 0) {
                        return readElementValues(annotationVisitor.visitArray(str), i + 1, false, cArr);
                    }
                    int i7 = this.classFileBuffer[i6] & UByte.MAX_VALUE;
                    if (i7 == 70) {
                        float[] fArr = new float[readUnsignedShort];
                        while (i2 < readUnsignedShort) {
                            fArr[i2] = Float.intBitsToFloat(readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                            i6 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, fArr);
                        return i6;
                    }
                    if (i7 == 83) {
                        short[] sArr = new short[readUnsignedShort];
                        while (i2 < readUnsignedShort) {
                            sArr[i2] = (short) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, sArr);
                        return i6;
                    }
                    if (i7 == 90) {
                        boolean[] zArr = new boolean[readUnsignedShort];
                        for (int i8 = 0; i8 < readUnsignedShort; i8++) {
                            zArr[i8] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]) != 0;
                            i6 += 3;
                        }
                        annotationVisitor.visit(str, zArr);
                        return i6;
                    }
                    if (i7 == 73) {
                        int[] iArr = new int[readUnsignedShort];
                        while (i2 < readUnsignedShort) {
                            iArr[i2] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, iArr);
                        return i6;
                    }
                    if (i7 == 74) {
                        long[] jArr = new long[readUnsignedShort];
                        while (i2 < readUnsignedShort) {
                            jArr[i2] = readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        annotationVisitor.visit(str, jArr);
                        return i6;
                    }
                    switch (i7) {
                        case 66:
                            byte[] bArr = new byte[readUnsignedShort];
                            while (i2 < readUnsignedShort) {
                                bArr[i2] = (byte) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, bArr);
                            return i6;
                        case 67:
                            char[] cArr2 = new char[readUnsignedShort];
                            while (i2 < readUnsignedShort) {
                                cArr2[i2] = (char) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, cArr2);
                            return i6;
                        case 68:
                            double[] dArr = new double[readUnsignedShort];
                            while (i2 < readUnsignedShort) {
                                dArr[i2] = Double.longBitsToDouble(readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, dArr);
                            return i6;
                        default:
                            return readElementValues(annotationVisitor.visitArray(str), i + 1, false, cArr);
                    }
                }
                switch (i5) {
                    case 66:
                        annotationVisitor.visit(str, Byte.valueOf((byte) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                        return i + 3;
                    case 67:
                        annotationVisitor.visit(str, Character.valueOf((char) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                        return i + 3;
                    case 68:
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        }
        annotationVisitor.visit(str, readConst(readUnsignedShort(i4), cArr));
        return i + 3;
    }

    private int readElementValues(AnnotationVisitor annotationVisitor, int i, boolean z, char[] cArr) {
        int readUnsignedShort = readUnsignedShort(i);
        int i2 = i + 2;
        if (!z) {
            while (true) {
                int i3 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                i2 = readElementValue(annotationVisitor, i2, null, cArr);
                readUnsignedShort = i3;
            }
        } else {
            while (true) {
                int i4 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                i2 = readElementValue(annotationVisitor, i2 + 2, readUTF8(i2, cArr), cArr);
                readUnsignedShort = i4;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return i2;
    }

    private int readField(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        int i3;
        int i4;
        Context context2 = context;
        char[] cArr = context2.charBuffer;
        int readUnsignedShort = readUnsignedShort(i);
        String readUTF8 = readUTF8(i + 2, cArr);
        String readUTF82 = readUTF8(i + 4, cArr);
        int readUnsignedShort2 = readUnsignedShort(i + 6);
        int i5 = i + 8;
        int i6 = readUnsignedShort;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        String str = null;
        Object obj = null;
        Attribute attribute = null;
        while (true) {
            int i11 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            int i12 = i7;
            String readUTF83 = readUTF8(i5, cArr);
            int readInt = readInt(i5 + 2);
            int i13 = i5 + 6;
            if ("ConstantValue".equals(readUTF83)) {
                int readUnsignedShort3 = readUnsignedShort(i13);
                obj = readUnsignedShort3 == 0 ? null : readConst(readUnsignedShort3, cArr);
            } else if ("Signature".equals(readUTF83)) {
                str = readUTF8(i13, cArr);
            } else {
                if ("Deprecated".equals(readUTF83)) {
                    i4 = 131072 | i6;
                } else if ("Synthetic".equals(readUTF83)) {
                    i4 = i6 | ConstantsKt.DEFAULT_BLOCK_SIZE;
                } else {
                    if ("RuntimeVisibleAnnotations".equals(readUTF83)) {
                        i7 = i13;
                        i2 = i7;
                        i13 = i8;
                        i3 = readInt;
                    } else {
                        if ("RuntimeVisibleTypeAnnotations".equals(readUTF83)) {
                            i2 = i13;
                            i9 = i2;
                        } else if ("RuntimeInvisibleAnnotations".equals(readUTF83)) {
                            i2 = i13;
                            i3 = readInt;
                            i7 = i12;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF83)) {
                            i2 = i13;
                            i10 = i2;
                        } else {
                            i2 = i13;
                            int i14 = i8;
                            i3 = readInt;
                            Attribute readAttribute = readAttribute(context2.attributePrototypes, readUTF83, i2, i3, cArr, -1, null);
                            readAttribute.nextAttribute = attribute;
                            attribute = readAttribute;
                            i9 = i9;
                            i13 = i14;
                            i7 = i12;
                            i10 = i10;
                        }
                        i13 = i8;
                        i3 = readInt;
                        i7 = i12;
                    }
                    int i15 = i2 + i3;
                    context2 = context;
                    i8 = i13;
                    i5 = i15;
                    readUnsignedShort2 = i11;
                }
                i2 = i13;
                i6 = i4;
                i13 = i8;
                i3 = readInt;
                i7 = i12;
                int i152 = i2 + i3;
                context2 = context;
                i8 = i13;
                i5 = i152;
                readUnsignedShort2 = i11;
            }
            i2 = i13;
            i13 = i8;
            i3 = readInt;
            i7 = i12;
            int i1522 = i2 + i3;
            context2 = context;
            i8 = i13;
            i5 = i1522;
            readUnsignedShort2 = i11;
        }
        int i16 = i7;
        int i17 = i9;
        int i18 = i10;
        FieldVisitor visitField = classVisitor.visitField(i6, readUTF8, readUTF82, str, obj);
        if (visitField == null) {
            return i5;
        }
        if (i16 != 0) {
            int readUnsignedShort4 = readUnsignedShort(i16);
            int i19 = i16 + 2;
            while (true) {
                int i20 = readUnsignedShort4 - 1;
                if (readUnsignedShort4 <= 0) {
                    break;
                }
                i19 = readElementValues(visitField.visitAnnotation(readUTF8(i19, cArr), true), i19 + 2, true, cArr);
                readUnsignedShort4 = i20;
            }
        }
        if (i8 != 0) {
            int readUnsignedShort5 = readUnsignedShort(i8);
            int i21 = i8 + 2;
            while (true) {
                int i22 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                i21 = readElementValues(visitField.visitAnnotation(readUTF8(i21, cArr), false), i21 + 2, true, cArr);
                readUnsignedShort5 = i22;
            }
        }
        if (i17 != 0) {
            int readUnsignedShort6 = readUnsignedShort(i17);
            int i23 = i17 + 2;
            while (true) {
                int i24 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = readTypeAnnotationTarget(context, i23);
                i23 = readElementValues(visitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort6 = i24;
            }
        }
        if (i18 != 0) {
            int readUnsignedShort7 = readUnsignedShort(i18);
            int i25 = i18 + 2;
            while (true) {
                int i26 = readUnsignedShort7 - 1;
                if (readUnsignedShort7 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = readTypeAnnotationTarget(context, i25);
                i25 = readElementValues(visitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort7 = i26;
            }
        }
        while (attribute != null) {
            Attribute attribute2 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            visitField.visitAttribute(attribute);
            attribute = attribute2;
        }
        visitField.visitEnd();
        return i5;
    }

    private int readMethod(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        char[] cArr;
        int i3;
        int i4;
        int i5;
        char[] cArr2;
        ClassReader classReader = this;
        char[] cArr3 = context.charBuffer;
        context.currentMethodAccessFlags = classReader.readUnsignedShort(i);
        context.currentMethodName = classReader.readUTF8(i + 2, cArr3);
        int i6 = i + 4;
        context.currentMethodDescriptor = classReader.readUTF8(i6, cArr3);
        int readUnsignedShort = classReader.readUnsignedShort(i + 6);
        int i7 = i + 8;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        Attribute attribute = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String[] strArr = null;
        boolean z = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int i19 = readUnsignedShort - 1;
            if (readUnsignedShort <= 0) {
                break;
            }
            int i20 = i8;
            String readUTF8 = classReader.readUTF8(i7, cArr3);
            int readInt = classReader.readInt(i7 + 2);
            int i21 = i9;
            int i22 = i7 + 6;
            int i23 = i20;
            if ("Code".equals(readUTF8)) {
                if ((context.parsingOptions & 1) == 0) {
                    i18 = i22;
                }
            } else if ("Exceptions".equals(readUTF8)) {
                int readUnsignedShort2 = classReader.readUnsignedShort(i22);
                int i24 = i7 + 8;
                strArr = new String[readUnsignedShort2];
                for (int i25 = 0; i25 < readUnsignedShort2; i25++) {
                    strArr[i25] = classReader.readClass(i24, cArr3);
                    i24 += 2;
                }
                i15 = i22;
            } else if ("Signature".equals(readUTF8)) {
                i12 = classReader.readUnsignedShort(i22);
            } else if ("Deprecated".equals(readUTF8)) {
                context.currentMethodAccessFlags |= 131072;
            } else if ("RuntimeVisibleAnnotations".equals(readUTF8)) {
                i23 = i22;
            } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF8)) {
                i4 = i22;
                cArr2 = cArr3;
                i5 = readInt;
                i7 = i22 + i5;
                cArr3 = cArr2;
                readUnsignedShort = i19;
                i9 = i21;
                i8 = i23;
                i10 = i4;
            } else if ("AnnotationDefault".equals(readUTF8)) {
                i14 = i22;
            } else {
                if ("Synthetic".equals(readUTF8)) {
                    context.currentMethodAccessFlags |= ConstantsKt.DEFAULT_BLOCK_SIZE;
                    i4 = i10;
                    cArr2 = cArr3;
                    i5 = readInt;
                    z = true;
                } else if ("RuntimeInvisibleAnnotations".equals(readUTF8)) {
                    i21 = i22;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF8)) {
                    i11 = i22;
                } else if ("RuntimeVisibleParameterAnnotations".equals(readUTF8)) {
                    i16 = i22;
                } else if ("RuntimeInvisibleParameterAnnotations".equals(readUTF8)) {
                    i17 = i22;
                } else if ("MethodParameters".equals(readUTF8)) {
                    i13 = i22;
                } else {
                    i4 = i10;
                    i5 = readInt;
                    Attribute readAttribute = classReader.readAttribute(context.attributePrototypes, readUTF8, i22, i5, cArr3, -1, null);
                    cArr2 = cArr3;
                    readAttribute.nextAttribute = attribute;
                    attribute = readAttribute;
                    i11 = i11;
                }
                i7 = i22 + i5;
                cArr3 = cArr2;
                readUnsignedShort = i19;
                i9 = i21;
                i8 = i23;
                i10 = i4;
            }
            i4 = i10;
            cArr2 = cArr3;
            i5 = readInt;
            i7 = i22 + i5;
            cArr3 = cArr2;
            readUnsignedShort = i19;
            i9 = i21;
            i8 = i23;
            i10 = i4;
        }
        int i26 = i8;
        int i27 = i9;
        int i28 = i10;
        char[] cArr4 = cArr3;
        int i29 = i11;
        int i30 = i14;
        int i31 = i13;
        MethodVisitor visitMethod = classVisitor.visitMethod(context.currentMethodAccessFlags, context.currentMethodName, context.currentMethodDescriptor, i12 == 0 ? null : classReader.readUtf(i12, cArr4), strArr);
        if (visitMethod == null) {
            return i7;
        }
        if (visitMethod instanceof MethodWriter) {
            MethodWriter methodWriter = (MethodWriter) visitMethod;
            i3 = i30;
            boolean z2 = (context.currentMethodAccessFlags & 131072) != 0;
            int readUnsignedShort3 = classReader.readUnsignedShort(i6);
            int i32 = i12;
            i2 = i31;
            cArr = cArr4;
            boolean canCopyMethodAttributes = methodWriter.canCopyMethodAttributes(classReader, z, z2, readUnsignedShort3, i32, i15);
            classReader = classReader;
            if (canCopyMethodAttributes) {
                methodWriter.setMethodAttributesSource(i, i7 - i);
                return i7;
            }
        } else {
            i2 = i31;
            cArr = cArr4;
            i3 = i30;
        }
        if (i2 != 0 && (context.parsingOptions & 2) == 0) {
            int readByte = classReader.readByte(i2);
            int i33 = i2 + 1;
            while (true) {
                int i34 = readByte - 1;
                if (readByte <= 0) {
                    break;
                }
                visitMethod.visitParameter(classReader.readUTF8(i33, cArr), classReader.readUnsignedShort(i33 + 2));
                i33 += 4;
                readByte = i34;
            }
        }
        if (i3 != 0) {
            AnnotationVisitor visitAnnotationDefault = visitMethod.visitAnnotationDefault();
            classReader.readElementValue(visitAnnotationDefault, i3, null, cArr);
            if (visitAnnotationDefault != null) {
                visitAnnotationDefault.visitEnd();
            }
        }
        if (i26 != 0) {
            int readUnsignedShort4 = classReader.readUnsignedShort(i26);
            int i35 = i26 + 2;
            while (true) {
                int i36 = readUnsignedShort4 - 1;
                if (readUnsignedShort4 <= 0) {
                    break;
                }
                i35 = classReader.readElementValues(visitMethod.visitAnnotation(classReader.readUTF8(i35, cArr), true), i35 + 2, true, cArr);
                readUnsignedShort4 = i36;
            }
        }
        if (i27 != 0) {
            int readUnsignedShort5 = classReader.readUnsignedShort(i27);
            int i37 = i27 + 2;
            while (true) {
                int i38 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                i37 = classReader.readElementValues(visitMethod.visitAnnotation(classReader.readUTF8(i37, cArr), false), i37 + 2, true, cArr);
                readUnsignedShort5 = i38;
            }
        }
        if (i28 != 0) {
            int readUnsignedShort6 = classReader.readUnsignedShort(i28);
            int i39 = i28 + 2;
            while (true) {
                int i40 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = classReader.readTypeAnnotationTarget(context, i39);
                i39 = classReader.readElementValues(visitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort6 = i40;
            }
        }
        if (i29 != 0) {
            int readUnsignedShort7 = classReader.readUnsignedShort(i29);
            int i41 = i29 + 2;
            while (true) {
                int i42 = readUnsignedShort7 - 1;
                if (readUnsignedShort7 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = classReader.readTypeAnnotationTarget(context, i41);
                i41 = classReader.readElementValues(visitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort7 = i42;
            }
        }
        int i43 = i16;
        if (i43 != 0) {
            classReader.readParameterAnnotations(visitMethod, context, i43, true);
        }
        int i44 = i17;
        if (i44 != 0) {
            classReader.readParameterAnnotations(visitMethod, context, i44, false);
        }
        while (attribute != null) {
            Attribute attribute2 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            visitMethod.visitAttribute(attribute);
            attribute = attribute2;
        }
        int i45 = i18;
        if (i45 != 0) {
            visitMethod.visitCode();
            classReader.readCode(visitMethod, context, i45);
        }
        visitMethod.visitEnd();
        return i7;
    }

    private void readModuleAttributes(ClassVisitor classVisitor, Context context, int i, int i2, String str) {
        String[] strArr;
        char[] cArr = context.charBuffer;
        int i3 = i + 6;
        ModuleVisitor visitModule = classVisitor.visitModule(readModule(i, cArr), readUnsignedShort(i + 2), readUTF8(i + 4, cArr));
        if (visitModule == null) {
            return;
        }
        if (str != null) {
            visitModule.visitMainClass(str);
        }
        if (i2 != 0) {
            int readUnsignedShort = readUnsignedShort(i2);
            int i4 = i2 + 2;
            while (true) {
                int i5 = readUnsignedShort - 1;
                if (readUnsignedShort <= 0) {
                    break;
                }
                visitModule.visitPackage(readPackage(i4, cArr));
                i4 += 2;
                readUnsignedShort = i5;
            }
        }
        int readUnsignedShort2 = readUnsignedShort(i3);
        int i6 = i + 8;
        while (true) {
            int i7 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            String readModule = readModule(i6, cArr);
            int readUnsignedShort3 = readUnsignedShort(i6 + 2);
            String readUTF8 = readUTF8(i6 + 4, cArr);
            i6 += 6;
            visitModule.visitRequire(readModule, readUnsignedShort3, readUTF8);
            readUnsignedShort2 = i7;
        }
        int readUnsignedShort4 = readUnsignedShort(i6);
        int i8 = i6 + 2;
        while (true) {
            int i9 = readUnsignedShort4 - 1;
            String[] strArr2 = null;
            if (readUnsignedShort4 <= 0) {
                break;
            }
            String readPackage = readPackage(i8, cArr);
            int readUnsignedShort5 = readUnsignedShort(i8 + 2);
            int readUnsignedShort6 = readUnsignedShort(i8 + 4);
            i8 += 6;
            if (readUnsignedShort6 != 0) {
                strArr2 = new String[readUnsignedShort6];
                for (int i10 = 0; i10 < readUnsignedShort6; i10++) {
                    strArr2[i10] = readModule(i8, cArr);
                    i8 += 2;
                }
            }
            visitModule.visitExport(readPackage, readUnsignedShort5, strArr2);
            readUnsignedShort4 = i9;
        }
        int readUnsignedShort7 = readUnsignedShort(i8);
        int i11 = i8 + 2;
        while (true) {
            int i12 = readUnsignedShort7 - 1;
            if (readUnsignedShort7 <= 0) {
                break;
            }
            String readPackage2 = readPackage(i11, cArr);
            int readUnsignedShort8 = readUnsignedShort(i11 + 2);
            int readUnsignedShort9 = readUnsignedShort(i11 + 4);
            i11 += 6;
            if (readUnsignedShort9 != 0) {
                strArr = new String[readUnsignedShort9];
                for (int i13 = 0; i13 < readUnsignedShort9; i13++) {
                    strArr[i13] = readModule(i11, cArr);
                    i11 += 2;
                }
            } else {
                strArr = null;
            }
            visitModule.visitOpen(readPackage2, readUnsignedShort8, strArr);
            readUnsignedShort7 = i12;
        }
        int readUnsignedShort10 = readUnsignedShort(i11);
        int i14 = i11 + 2;
        while (true) {
            int i15 = readUnsignedShort10 - 1;
            if (readUnsignedShort10 <= 0) {
                break;
            }
            visitModule.visitUse(readClass(i14, cArr));
            i14 += 2;
            readUnsignedShort10 = i15;
        }
        int readUnsignedShort11 = readUnsignedShort(i14);
        int i16 = i14 + 2;
        while (true) {
            int i17 = readUnsignedShort11 - 1;
            if (readUnsignedShort11 <= 0) {
                visitModule.visitEnd();
                return;
            }
            String readClass = readClass(i16, cArr);
            int readUnsignedShort12 = readUnsignedShort(i16 + 2);
            i16 += 4;
            String[] strArr3 = new String[readUnsignedShort12];
            for (int i18 = 0; i18 < readUnsignedShort12; i18++) {
                strArr3[i18] = readClass(i16, cArr);
                i16 += 2;
            }
            visitModule.visitProvide(readClass, strArr3);
            readUnsignedShort11 = i17;
        }
    }

    private void readParameterAnnotations(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int i2 = i + 1;
        int i3 = this.classFileBuffer[i] & UByte.MAX_VALUE;
        methodVisitor.visitAnnotableParameterCount(i3, z);
        char[] cArr = context.charBuffer;
        for (int i4 = 0; i4 < i3; i4++) {
            int readUnsignedShort = readUnsignedShort(i2);
            i2 += 2;
            while (true) {
                int i5 = readUnsignedShort - 1;
                if (readUnsignedShort > 0) {
                    i2 = readElementValues(methodVisitor.visitParameterAnnotation(i4, readUTF8(i2, cArr), z), i2 + 2, true, cArr);
                    readUnsignedShort = i5;
                }
            }
        }
    }

    private int readRecordComponent(ClassVisitor classVisitor, Context context, int i) {
        int i2;
        int i3;
        Attribute attribute;
        char[] cArr = context.charBuffer;
        String readUTF8 = readUTF8(i, cArr);
        String readUTF82 = readUTF8(i + 2, cArr);
        int readUnsignedShort = readUnsignedShort(i + 4);
        int i4 = i + 6;
        int i5 = 0;
        Attribute attribute2 = null;
        int i6 = 0;
        String str = null;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = readUnsignedShort - 1;
            if (readUnsignedShort <= 0) {
                break;
            }
            String readUTF83 = readUTF8(i4, cArr);
            int readInt = readInt(i4 + 2);
            int i10 = i4 + 6;
            if ("Signature".equals(readUTF83)) {
                str = readUTF8(i10, cArr);
                int i11 = i5;
                i2 = i10;
                i10 = i11;
            } else {
                if ("RuntimeVisibleAnnotations".equals(readUTF83)) {
                    i7 = i10;
                    attribute = attribute2;
                    i3 = readInt;
                    i10 = i5;
                    i2 = i7;
                } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF83)) {
                    i2 = i10;
                } else if ("RuntimeInvisibleAnnotations".equals(readUTF83)) {
                    i8 = i10;
                    attribute = attribute2;
                    i3 = readInt;
                    i10 = i5;
                    i2 = i8;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF83)) {
                    i6 = i10;
                    attribute = attribute2;
                    i3 = readInt;
                    i10 = i5;
                    i2 = i6;
                } else {
                    int i12 = i5;
                    i2 = i10;
                    Attribute attribute3 = attribute2;
                    i3 = readInt;
                    Attribute readAttribute = readAttribute(context.attributePrototypes, readUTF83, i2, i3, cArr, -1, null);
                    readAttribute.nextAttribute = attribute3;
                    attribute = readAttribute;
                    i10 = i12;
                    i6 = i6;
                }
                int i13 = i2 + i3;
                i5 = i10;
                i4 = i13;
                attribute2 = attribute;
                readUnsignedShort = i9;
            }
            attribute = attribute2;
            i3 = readInt;
            int i132 = i2 + i3;
            i5 = i10;
            i4 = i132;
            attribute2 = attribute;
            readUnsignedShort = i9;
        }
        int i14 = i5;
        Attribute attribute4 = attribute2;
        int i15 = i6;
        RecordComponentVisitor visitRecordComponent = classVisitor.visitRecordComponent(readUTF8, readUTF82, str);
        if (visitRecordComponent == null) {
            return i4;
        }
        if (i7 != 0) {
            int readUnsignedShort2 = readUnsignedShort(i7);
            int i16 = i7 + 2;
            while (true) {
                int i17 = readUnsignedShort2 - 1;
                if (readUnsignedShort2 <= 0) {
                    break;
                }
                i16 = readElementValues(visitRecordComponent.visitAnnotation(readUTF8(i16, cArr), true), i16 + 2, true, cArr);
                readUnsignedShort2 = i17;
            }
        }
        if (i8 != 0) {
            int readUnsignedShort3 = readUnsignedShort(i8);
            int i18 = i8 + 2;
            while (true) {
                int i19 = readUnsignedShort3 - 1;
                if (readUnsignedShort3 <= 0) {
                    break;
                }
                i18 = readElementValues(visitRecordComponent.visitAnnotation(readUTF8(i18, cArr), false), i18 + 2, true, cArr);
                readUnsignedShort3 = i19;
            }
        }
        if (i14 != 0) {
            int readUnsignedShort4 = readUnsignedShort(i14);
            int i20 = i14 + 2;
            while (true) {
                int i21 = readUnsignedShort4 - 1;
                if (readUnsignedShort4 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = readTypeAnnotationTarget(context, i20);
                i20 = readElementValues(visitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort4 = i21;
            }
        }
        if (i15 != 0) {
            int readUnsignedShort5 = readUnsignedShort(i15);
            int i22 = i15 + 2;
            while (true) {
                int i23 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = readTypeAnnotationTarget(context, i22);
                i22 = readElementValues(visitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort5 = i23;
            }
        }
        Attribute attribute5 = attribute4;
        while (attribute5 != null) {
            Attribute attribute6 = attribute5.nextAttribute;
            attribute5.nextAttribute = null;
            visitRecordComponent.visitAttribute(attribute5);
            attribute5 = attribute6;
        }
        visitRecordComponent.visitEnd();
        return i4;
    }

    private int readStackMapFrame(int i, boolean z, boolean z2, Context context) {
        int i2;
        int i3;
        char[] cArr = context.charBuffer;
        Label[] labelArr = context.currentMethodLabels;
        if (z) {
            i2 = i + 1;
            i3 = this.classFileBuffer[i] & UByte.MAX_VALUE;
        } else {
            context.currentFrameOffset = -1;
            i2 = i;
            i3 = 255;
        }
        context.currentFrameLocalCountDelta = 0;
        if (i3 < 64) {
            context.currentFrameType = 3;
            context.currentFrameStackCount = 0;
        } else if (i3 < 128) {
            i3 -= 64;
            i2 = readVerificationTypeInfo(i2, context.currentFrameStackTypes, 0, cArr, labelArr);
            context.currentFrameType = 4;
            context.currentFrameStackCount = 1;
        } else {
            if (i3 < 247) {
                throw new IllegalArgumentException();
            }
            int readUnsignedShort = readUnsignedShort(i2);
            int i4 = i2;
            i2 = i4 + 2;
            if (i3 == 247) {
                i2 = readVerificationTypeInfo(i2, context.currentFrameStackTypes, 0, cArr, labelArr);
                context.currentFrameType = 4;
                context.currentFrameStackCount = 1;
            } else if (i3 >= 248 && i3 < 251) {
                context.currentFrameType = 2;
                int i5 = 251 - i3;
                context.currentFrameLocalCountDelta = i5;
                context.currentFrameLocalCount -= i5;
                context.currentFrameStackCount = 0;
            } else if (i3 == 251) {
                context.currentFrameType = 3;
                context.currentFrameStackCount = 0;
            } else if (i3 < 255) {
                int i6 = i3 - 251;
                int i7 = z2 ? context.currentFrameLocalCount : 0;
                int i8 = i6;
                while (i8 > 0) {
                    i2 = readVerificationTypeInfo(i2, context.currentFrameLocalTypes, i7, cArr, labelArr);
                    i8--;
                    i7++;
                }
                context.currentFrameType = 1;
                context.currentFrameLocalCountDelta = i6;
                context.currentFrameLocalCount += i6;
                context.currentFrameStackCount = 0;
            } else {
                int readUnsignedShort2 = readUnsignedShort(i2);
                int i9 = i4 + 4;
                context.currentFrameType = 0;
                context.currentFrameLocalCountDelta = readUnsignedShort2;
                context.currentFrameLocalCount = readUnsignedShort2;
                for (int i10 = 0; i10 < readUnsignedShort2; i10++) {
                    i9 = readVerificationTypeInfo(i9, context.currentFrameLocalTypes, i10, cArr, labelArr);
                }
                int readUnsignedShort3 = readUnsignedShort(i9);
                i2 = i9 + 2;
                context.currentFrameStackCount = readUnsignedShort3;
                for (int i11 = 0; i11 < readUnsignedShort3; i11++) {
                    i2 = readVerificationTypeInfo(i2, context.currentFrameStackTypes, i11, cArr, labelArr);
                }
            }
            i3 = readUnsignedShort;
        }
        int i12 = i3 + 1 + context.currentFrameOffset;
        context.currentFrameOffset = i12;
        createLabel(i12, labelArr);
        return i2;
    }

    private String readStringish(int i, char[] cArr) {
        return readUTF8(this.cpInfoOffsets[readUnsignedShort(i)], cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int readTypeAnnotationTarget(Context context, int i) {
        int i2;
        int i3;
        int readInt = readInt(i);
        int i4 = readInt >>> 24;
        if (i4 != 0 && i4 != 1) {
            switch (i4) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = readInt & (-256);
                    i3 = i + 3;
                    context.currentTypeAnnotationTarget = i2;
                    int readByte = readByte(i3);
                    context.currentTypeAnnotationTargetPath = readByte != 0 ? null : new TypePath(this.classFileBuffer, i3);
                    return (readByte * 2) + i3 + 1;
                case 19:
                case 20:
                case 21:
                    i2 = readInt & (-16777216);
                    i3 = i + 1;
                    context.currentTypeAnnotationTarget = i2;
                    int readByte2 = readByte(i3);
                    context.currentTypeAnnotationTargetPath = readByte2 != 0 ? null : new TypePath(this.classFileBuffer, i3);
                    return (readByte2 * 2) + i3 + 1;
                case 22:
                    break;
                default:
                    switch (i4) {
                        case 64:
                        case 65:
                            i2 = readInt & (-16777216);
                            int readUnsignedShort = readUnsignedShort(i + 1);
                            i3 = i + 3;
                            context.currentLocalVariableAnnotationRangeStarts = new Label[readUnsignedShort];
                            context.currentLocalVariableAnnotationRangeEnds = new Label[readUnsignedShort];
                            context.currentLocalVariableAnnotationRangeIndices = new int[readUnsignedShort];
                            for (int i5 = 0; i5 < readUnsignedShort; i5++) {
                                int readUnsignedShort2 = readUnsignedShort(i3);
                                int readUnsignedShort3 = readUnsignedShort(i3 + 2);
                                int readUnsignedShort4 = readUnsignedShort(i3 + 4);
                                i3 += 6;
                                context.currentLocalVariableAnnotationRangeStarts[i5] = createLabel(readUnsignedShort2, context.currentMethodLabels);
                                context.currentLocalVariableAnnotationRangeEnds[i5] = createLabel(readUnsignedShort2 + readUnsignedShort3, context.currentMethodLabels);
                                context.currentLocalVariableAnnotationRangeIndices[i5] = readUnsignedShort4;
                            }
                            context.currentTypeAnnotationTarget = i2;
                            int readByte22 = readByte(i3);
                            context.currentTypeAnnotationTargetPath = readByte22 != 0 ? null : new TypePath(this.classFileBuffer, i3);
                            return (readByte22 * 2) + i3 + 1;
                        case 66:
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = readInt & (-16777216);
                            i3 = i + 3;
                            context.currentTypeAnnotationTarget = i2;
                            int readByte222 = readByte(i3);
                            context.currentTypeAnnotationTargetPath = readByte222 != 0 ? null : new TypePath(this.classFileBuffer, i3);
                            return (readByte222 * 2) + i3 + 1;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = readInt & (-16776961);
                            i3 = i + 4;
                            context.currentTypeAnnotationTarget = i2;
                            int readByte2222 = readByte(i3);
                            context.currentTypeAnnotationTargetPath = readByte2222 != 0 ? null : new TypePath(this.classFileBuffer, i3);
                            return (readByte2222 * 2) + i3 + 1;
                        default:
                            throw new IllegalArgumentException();
                    }
            }
        }
        i2 = readInt & (-65536);
        i3 = i + 2;
        context.currentTypeAnnotationTarget = i2;
        int readByte22222 = readByte(i3);
        context.currentTypeAnnotationTargetPath = readByte22222 != 0 ? null : new TypePath(this.classFileBuffer, i3);
        return (readByte22222 * 2) + i3 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int[] readTypeAnnotations(MethodVisitor methodVisitor, Context context, int i, boolean z) {
        int i2;
        char[] cArr = context.charBuffer;
        int readUnsignedShort = readUnsignedShort(i);
        int[] iArr = new int[readUnsignedShort];
        int i3 = i + 2;
        for (int i4 = 0; i4 < readUnsignedShort; i4++) {
            iArr[i4] = i3;
            int readInt = readInt(i3);
            int i5 = readInt >>> 24;
            if (i5 != 23) {
                switch (i5) {
                    default:
                        switch (i5) {
                            case 64:
                            case 65:
                                int readUnsignedShort2 = readUnsignedShort(i3 + 1);
                                i2 = i3 + 3;
                                while (true) {
                                    int i6 = readUnsignedShort2 - 1;
                                    if (readUnsignedShort2 <= 0) {
                                        break;
                                    } else {
                                        int readUnsignedShort3 = readUnsignedShort(i2);
                                        int readUnsignedShort4 = readUnsignedShort(i2 + 2);
                                        i2 += 6;
                                        createLabel(readUnsignedShort3, context.currentMethodLabels);
                                        createLabel(readUnsignedShort3 + readUnsignedShort4, context.currentMethodLabels);
                                        readUnsignedShort2 = i6;
                                    }
                                }
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i2 = i3 + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        int readByte = readByte(i2);
                        if (i5 == 66) {
                            TypePath typePath = readByte != 0 ? new TypePath(this.classFileBuffer, i2) : null;
                            int c = a.c(readByte, 2, 1, i2);
                            i3 = readElementValues(methodVisitor.visitTryCatchAnnotation(readInt & (-256), typePath, readUTF8(c, cArr), z), c + 2, true, cArr);
                        } else {
                            i3 = readElementValues(null, a.c(readByte, 2, 3, i2), true, cArr);
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = i3 + 3;
                        int readByte2 = readByte(i2);
                        if (i5 == 66) {
                        }
                        break;
                }
            }
            i2 = i3 + 3;
            int readByte22 = readByte(i2);
            if (i5 == 66) {
            }
        }
        return iArr;
    }

    private int readVerificationTypeInfo(int i, Object[] objArr, int i2, char[] cArr, Label[] labelArr) {
        int i3 = i + 1;
        switch (this.classFileBuffer[i] & UByte.MAX_VALUE) {
            case 0:
                objArr[i2] = Opcodes.TOP;
                return i3;
            case 1:
                objArr[i2] = Opcodes.INTEGER;
                return i3;
            case 2:
                objArr[i2] = Opcodes.FLOAT;
                return i3;
            case 3:
                objArr[i2] = Opcodes.DOUBLE;
                return i3;
            case 4:
                objArr[i2] = Opcodes.LONG;
                return i3;
            case 5:
                objArr[i2] = Opcodes.NULL;
                return i3;
            case 6:
                objArr[i2] = Opcodes.UNINITIALIZED_THIS;
                return i3;
            case 7:
                objArr[i2] = readClass(i3, cArr);
                break;
            case 8:
                objArr[i2] = createLabel(readUnsignedShort(i3), labelArr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i + 3;
    }

    public void accept(ClassVisitor classVisitor, Attribute[] attributeArr, int i) {
        Context context;
        ClassReader classReader;
        Context context2;
        String str;
        int i2;
        int i3;
        String str2;
        int i4;
        String str3;
        String str4;
        int i5;
        Context context3 = new Context();
        context3.attributePrototypes = attributeArr;
        context3.parsingOptions = i;
        char[] cArr = new char[this.maxStringLength];
        context3.charBuffer = cArr;
        int i6 = this.header;
        int readUnsignedShort = readUnsignedShort(i6);
        String readClass = readClass(i6 + 2, cArr);
        String readClass2 = readClass(i6 + 4, cArr);
        int readUnsignedShort2 = readUnsignedShort(i6 + 6);
        String[] strArr = new String[readUnsignedShort2];
        int i7 = i6 + 8;
        for (int i8 = 0; i8 < readUnsignedShort2; i8++) {
            strArr[i8] = readClass(i7, cArr);
            i7 += 2;
        }
        int firstAttributeOffset = getFirstAttributeOffset();
        int readUnsignedShort3 = readUnsignedShort(firstAttributeOffset - 2);
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i9 = 0;
        int i10 = 0;
        String str8 = null;
        int i11 = 0;
        int i12 = 0;
        String str9 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        Attribute attribute = null;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (readUnsignedShort3 > 0) {
            int i20 = firstAttributeOffset;
            String readUTF8 = readUTF8(i20, cArr);
            int readInt = readInt(i20 + 2);
            String str10 = str5;
            int i21 = i20 + 6;
            String str11 = str6;
            if ("SourceFile".equals(readUTF8)) {
                str2 = readUTF8(i21, cArr);
                i5 = readUnsignedShort;
                i3 = i21;
                str3 = readClass;
                str6 = str11;
                i4 = readInt;
                context2 = context3;
            } else {
                if ("InnerClasses".equals(readUTF8)) {
                    i5 = readUnsignedShort;
                    i3 = i21;
                    i18 = i3;
                } else if ("EnclosingMethod".equals(readUTF8)) {
                    i5 = readUnsignedShort;
                    i3 = i21;
                    i10 = i3;
                } else {
                    if ("NestHost".equals(readUTF8)) {
                        str7 = readClass(i21, cArr);
                    } else if ("NestMembers".equals(readUTF8)) {
                        i5 = readUnsignedShort;
                        i3 = i21;
                        i16 = i3;
                    } else if ("PermittedSubclasses".equals(readUTF8)) {
                        i5 = readUnsignedShort;
                        i3 = i21;
                        i17 = i3;
                    } else if ("Signature".equals(readUTF8)) {
                        str8 = readUTF8(i21, cArr);
                    } else if ("RuntimeVisibleAnnotations".equals(readUTF8)) {
                        i5 = readUnsignedShort;
                        i3 = i21;
                        i9 = i3;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(readUTF8)) {
                        i5 = readUnsignedShort;
                        i3 = i21;
                        i14 = i3;
                    } else {
                        if ("Deprecated".equals(readUTF8)) {
                            i5 = 131072 | readUnsignedShort;
                        } else if ("Synthetic".equals(readUTF8)) {
                            i5 = readUnsignedShort | ConstantsKt.DEFAULT_BLOCK_SIZE;
                        } else if ("SourceDebugExtension".equals(readUTF8)) {
                            if (readInt > this.classFileBuffer.length - i21) {
                                throw new IllegalArgumentException();
                            }
                            str6 = readUtf(i21, readInt, new char[readInt]);
                            i5 = readUnsignedShort;
                            i3 = i21;
                            context2 = context3;
                            str2 = str10;
                            i4 = readInt;
                            str3 = readClass;
                        } else if ("RuntimeInvisibleAnnotations".equals(readUTF8)) {
                            i5 = readUnsignedShort;
                            i3 = i21;
                            i13 = i3;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(readUTF8)) {
                            i5 = readUnsignedShort;
                            i3 = i21;
                            i15 = i3;
                        } else if ("Record".equals(readUTF8)) {
                            i5 = 65536 | readUnsignedShort;
                            i3 = i21;
                            i19 = i3;
                        } else if ("Module".equals(readUTF8)) {
                            i5 = readUnsignedShort;
                            i3 = i21;
                            i11 = i3;
                        } else if ("ModuleMainClass".equals(readUTF8)) {
                            str9 = readClass(i21, cArr);
                        } else if ("ModulePackages".equals(readUTF8)) {
                            i5 = readUnsignedShort;
                            i3 = i21;
                            i12 = i3;
                        } else {
                            if ("BootstrapMethods".equals(readUTF8)) {
                                context2 = context3;
                                str = str11;
                                i2 = readUnsignedShort;
                                i3 = i21;
                                str2 = str10;
                                i4 = readInt;
                                str3 = readClass;
                                str4 = str7;
                            } else {
                                context2 = context3;
                                str = str11;
                                str2 = str10;
                                str3 = readClass;
                                str4 = str7;
                                i2 = readUnsignedShort;
                                i3 = i21;
                                i4 = readInt;
                                Attribute readAttribute = readAttribute(attributeArr, readUTF8, i3, i4, cArr, -1, null);
                                readAttribute.nextAttribute = attribute;
                                attribute = readAttribute;
                            }
                            str6 = str;
                            str7 = str4;
                            i5 = i2;
                        }
                        i3 = i21;
                    }
                    i5 = readUnsignedShort;
                    i3 = i21;
                }
                str6 = str11;
                str2 = str10;
                i4 = readInt;
                context2 = context3;
                str3 = readClass;
            }
            int i22 = i3 + i4;
            readUnsignedShort3--;
            readUnsignedShort = i5;
            str5 = str2;
            context3 = context2;
            readClass = str3;
            firstAttributeOffset = i22;
        }
        String str12 = str5;
        Context context4 = context3;
        String str13 = readClass;
        String str14 = str6;
        String str15 = str7;
        Attribute attribute2 = attribute;
        classVisitor.visit(readInt(this.cpInfoOffsets[1] - 7), readUnsignedShort, str13, str8, readClass2, strArr);
        if ((i & 2) == 0 && (str12 != null || str14 != null)) {
            classVisitor.visitSource(str12, str14);
        }
        if (i11 != 0) {
            context = context4;
            classReader = this;
            classReader.readModuleAttributes(classVisitor, context, i11, i12, str9);
        } else {
            context = context4;
            classReader = this;
        }
        if (str15 != null) {
            classVisitor.visitNestHost(str15);
        }
        if (i10 != 0) {
            String readClass3 = classReader.readClass(i10, cArr);
            int readUnsignedShort4 = classReader.readUnsignedShort(i10 + 2);
            classVisitor.visitOuterClass(readClass3, readUnsignedShort4 == 0 ? null : classReader.readUTF8(classReader.cpInfoOffsets[readUnsignedShort4], cArr), readUnsignedShort4 == 0 ? null : classReader.readUTF8(classReader.cpInfoOffsets[readUnsignedShort4] + 2, cArr));
        }
        if (i9 != 0) {
            int readUnsignedShort5 = classReader.readUnsignedShort(i9);
            int i23 = i9 + 2;
            while (true) {
                int i24 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 <= 0) {
                    break;
                }
                i23 = classReader.readElementValues(classVisitor.visitAnnotation(classReader.readUTF8(i23, cArr), true), i23 + 2, true, cArr);
                readUnsignedShort5 = i24;
            }
        }
        int i25 = i13;
        if (i25 != 0) {
            int readUnsignedShort6 = classReader.readUnsignedShort(i25);
            int i26 = i25 + 2;
            while (true) {
                int i27 = readUnsignedShort6 - 1;
                if (readUnsignedShort6 <= 0) {
                    break;
                }
                i26 = classReader.readElementValues(classVisitor.visitAnnotation(classReader.readUTF8(i26, cArr), false), i26 + 2, true, cArr);
                readUnsignedShort6 = i27;
            }
        }
        int i28 = i14;
        if (i28 != 0) {
            int readUnsignedShort7 = classReader.readUnsignedShort(i28);
            int i29 = i28 + 2;
            while (true) {
                int i30 = readUnsignedShort7 - 1;
                if (readUnsignedShort7 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget = classReader.readTypeAnnotationTarget(context, i29);
                i29 = classReader.readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(readTypeAnnotationTarget, cArr), true), readTypeAnnotationTarget + 2, true, cArr);
                readUnsignedShort7 = i30;
            }
        }
        int i31 = i15;
        if (i31 != 0) {
            int readUnsignedShort8 = classReader.readUnsignedShort(i31);
            int i32 = i31 + 2;
            while (true) {
                int i33 = readUnsignedShort8 - 1;
                if (readUnsignedShort8 <= 0) {
                    break;
                }
                int readTypeAnnotationTarget2 = classReader.readTypeAnnotationTarget(context, i32);
                i32 = classReader.readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, classReader.readUTF8(readTypeAnnotationTarget2, cArr), false), readTypeAnnotationTarget2 + 2, true, cArr);
                readUnsignedShort8 = i33;
            }
        }
        while (attribute2 != null) {
            Attribute attribute3 = attribute2.nextAttribute;
            attribute2.nextAttribute = null;
            classVisitor.visitAttribute(attribute2);
            attribute2 = attribute3;
        }
        int i34 = i16;
        if (i34 != 0) {
            int readUnsignedShort9 = classReader.readUnsignedShort(i34);
            int i35 = i34 + 2;
            while (true) {
                int i36 = readUnsignedShort9 - 1;
                if (readUnsignedShort9 <= 0) {
                    break;
                }
                classVisitor.visitNestMember(classReader.readClass(i35, cArr));
                i35 += 2;
                readUnsignedShort9 = i36;
            }
        }
        int i37 = i17;
        if (i37 != 0) {
            int readUnsignedShort10 = classReader.readUnsignedShort(i37);
            int i38 = i37 + 2;
            while (true) {
                int i39 = readUnsignedShort10 - 1;
                if (readUnsignedShort10 <= 0) {
                    break;
                }
                classVisitor.visitPermittedSubclass(classReader.readClass(i38, cArr));
                i38 += 2;
                readUnsignedShort10 = i39;
            }
        }
        int i40 = i18;
        if (i40 != 0) {
            int readUnsignedShort11 = classReader.readUnsignedShort(i40);
            int i41 = i40 + 2;
            while (true) {
                int i42 = readUnsignedShort11 - 1;
                if (readUnsignedShort11 <= 0) {
                    break;
                }
                classVisitor.visitInnerClass(classReader.readClass(i41, cArr), classReader.readClass(i41 + 2, cArr), classReader.readUTF8(i41 + 4, cArr), classReader.readUnsignedShort(i41 + 6));
                i41 += 8;
                readUnsignedShort11 = i42;
            }
        }
        int i43 = i19;
        if (i43 != 0) {
            int readUnsignedShort12 = classReader.readUnsignedShort(i43);
            int i44 = i43 + 2;
            while (true) {
                int i45 = readUnsignedShort12 - 1;
                if (readUnsignedShort12 <= 0) {
                    break;
                }
                i44 = classReader.readRecordComponent(classVisitor, context, i44);
                readUnsignedShort12 = i45;
            }
        }
        int readUnsignedShort13 = classReader.readUnsignedShort(i7);
        int i46 = i7 + 2;
        while (true) {
            int i47 = readUnsignedShort13 - 1;
            if (readUnsignedShort13 <= 0) {
                break;
            }
            i46 = classReader.readField(classVisitor, context, i46);
            readUnsignedShort13 = i47;
        }
        int readUnsignedShort14 = classReader.readUnsignedShort(i46);
        int i48 = i46 + 2;
        while (true) {
            int i49 = readUnsignedShort14 - 1;
            if (readUnsignedShort14 <= 0) {
                classVisitor.visitEnd();
                return;
            } else {
                i48 = classReader.readMethod(classVisitor, context, i48);
                readUnsignedShort14 = i49;
            }
        }
    }

    public final int getFirstAttributeOffset() {
        int i = this.header;
        int readUnsignedShort = (readUnsignedShort(i + 6) * 2) + i + 8;
        int readUnsignedShort2 = readUnsignedShort(readUnsignedShort);
        int i2 = readUnsignedShort + 2;
        while (true) {
            int i3 = readUnsignedShort2 - 1;
            if (readUnsignedShort2 <= 0) {
                break;
            }
            int readUnsignedShort3 = readUnsignedShort(i2 + 6);
            i2 += 8;
            while (true) {
                int i4 = readUnsignedShort3 - 1;
                if (readUnsignedShort3 > 0) {
                    i2 += readInt(i2 + 2) + 6;
                    readUnsignedShort3 = i4;
                }
            }
            readUnsignedShort2 = i3;
        }
        int readUnsignedShort4 = readUnsignedShort(i2);
        int i5 = i2 + 2;
        while (true) {
            int i6 = readUnsignedShort4 - 1;
            if (readUnsignedShort4 <= 0) {
                return i5 + 2;
            }
            int readUnsignedShort5 = readUnsignedShort(i5 + 6);
            i5 += 8;
            while (true) {
                int i7 = readUnsignedShort5 - 1;
                if (readUnsignedShort5 > 0) {
                    i5 += readInt(i5 + 2) + 6;
                    readUnsignedShort5 = i7;
                }
            }
            readUnsignedShort4 = i6;
        }
    }

    public int getItem(int i) {
        return this.cpInfoOffsets[i];
    }

    public int getItemCount() {
        return this.cpInfoOffsets.length;
    }

    public int getMaxStringLength() {
        return this.maxStringLength;
    }

    public int readByte(int i) {
        return this.classFileBuffer[i] & UByte.MAX_VALUE;
    }

    public String readClass(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public Object readConst(int i, char[] cArr) {
        int i2 = this.cpInfoOffsets[i];
        byte b = this.classFileBuffer[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(readInt(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(readInt(i2)));
            case 5:
                return Long.valueOf(readLong(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(readLong(i2)));
            case 7:
                return Type.getObjectType(readUTF8(i2, cArr));
            case 8:
                return readUTF8(i2, cArr);
            default:
                switch (b) {
                    case 15:
                        int readByte = readByte(i2);
                        int i3 = this.cpInfoOffsets[readUnsignedShort(i2 + 1)];
                        int i4 = this.cpInfoOffsets[readUnsignedShort(i3 + 2)];
                        return new Handle(readByte, readClass(i3, cArr), readUTF8(i4, cArr), readUTF8(i4 + 2, cArr), this.classFileBuffer[i3 - 1] == 11);
                    case 16:
                        return Type.getMethodType(readUTF8(i2, cArr));
                    case 17:
                        return readConstantDynamic(i, cArr);
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public int readInt(int i) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    public Label readLabel(int i, Label[] labelArr) {
        if (labelArr[i] == null) {
            labelArr[i] = new Label();
        }
        return labelArr[i];
    }

    public long readLong(int i) {
        return (readInt(i) << 32) | (readInt(i + 4) & 4294967295L);
    }

    public String readModule(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public String readPackage(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public short readShort(int i) {
        byte[] bArr = this.classFileBuffer;
        return (short) ((bArr[i + 1] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8));
    }

    public String readUTF8(int i, char[] cArr) {
        int readUnsignedShort = readUnsignedShort(i);
        if (i == 0 || readUnsignedShort == 0) {
            return null;
        }
        return readUtf(readUnsignedShort, cArr);
    }

    public int readUnsignedShort(int i) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i + 1] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8);
    }

    public final String readUtf(int i, char[] cArr) {
        String[] strArr = this.constantUtf8Values;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.cpInfoOffsets[i];
        String readUtf = readUtf(i2 + 2, readUnsignedShort(i2), cArr);
        strArr[i] = readUtf;
        return readUtf;
    }

    private String readUtf(int i, int i2, char[] cArr) {
        int i3;
        int i4 = i2 + i;
        byte[] bArr = this.classFileBuffer;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i];
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                cArr[i5] = (char) (b & ByteCompanionObject.MAX_VALUE);
                i5++;
                i = i6;
            } else {
                if ((b & 224) == 192) {
                    i3 = i5 + 1;
                    i += 2;
                    cArr[i5] = (char) (((b & 31) << 6) + (bArr[i6] & 63));
                } else {
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    cArr[i5] = (char) (((b & 15) << 12) + ((bArr[i6] & 63) << 6) + (bArr[i7] & 63));
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }
}
