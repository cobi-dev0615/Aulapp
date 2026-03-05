package com.nimbusds.jose.shaded.ow2asm;

import kotlin.UByte;
import kotlin.UShort;

/* loaded from: classes2.dex */
public class Label {
    static final Label EMPTY_LIST = new Label();
    int bytecodeOffset;
    short flags;
    private int[] forwardReferences;
    Frame frame;
    short inputStackSize;
    private short lineNumber;
    Label nextBasicBlock;
    Label nextListElement;
    private int[] otherLineNumbers;
    Edge outgoingEdges;
    short outputStackMax;
    short outputStackSize;
    short subroutineId;

    private void addForwardReference(int i, int i2, int i3) {
        if (this.forwardReferences == null) {
            this.forwardReferences = new int[6];
        }
        int[] iArr = this.forwardReferences;
        int i4 = iArr[0];
        if (i4 + 2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.forwardReferences = iArr2;
        }
        int[] iArr3 = this.forwardReferences;
        iArr3[i4 + 1] = i;
        int i5 = i4 + 2;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }

    private Label pushSuccessors(Label label) {
        for (Edge edge = this.outgoingEdges; edge != null; edge = edge.nextEdge) {
            if ((this.flags & 16) == 0 || edge != this.outgoingEdges.nextEdge) {
                Label label2 = edge.successor;
                if (label2.nextListElement == null) {
                    label2.nextListElement = label;
                    label = label2;
                }
            }
        }
        return label;
    }

    public final void accept(MethodVisitor methodVisitor, boolean z) {
        short s;
        methodVisitor.visitLabel(this);
        if (!z || (s = this.lineNumber) == 0) {
            return;
        }
        methodVisitor.visitLineNumber(s & UShort.MAX_VALUE, this);
        if (this.otherLineNumbers == null) {
            return;
        }
        int i = 1;
        while (true) {
            int[] iArr = this.otherLineNumbers;
            if (i > iArr[0]) {
                return;
            }
            methodVisitor.visitLineNumber(iArr[i], this);
            i++;
        }
    }

    public final void addLineNumber(int i) {
        if (this.lineNumber == 0) {
            this.lineNumber = (short) i;
            return;
        }
        if (this.otherLineNumbers == null) {
            this.otherLineNumbers = new int[4];
        }
        int[] iArr = this.otherLineNumbers;
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.otherLineNumbers = iArr2;
        }
        this.otherLineNumbers[i2] = i;
    }

    public final void addSubroutineRetSuccessors(Label label) {
        Label label2 = EMPTY_LIST;
        this.nextListElement = label2;
        Label label3 = label2;
        Label label4 = this;
        while (label4 != EMPTY_LIST) {
            Label label5 = label4.nextListElement;
            label4.nextListElement = label3;
            if ((label4.flags & 64) != 0 && label4.subroutineId != label.subroutineId) {
                label4.outgoingEdges = new Edge(label4.outputStackSize, label.outgoingEdges.successor, label4.outgoingEdges);
            }
            label3 = label4;
            label4 = label4.pushSuccessors(label5);
        }
        while (label3 != EMPTY_LIST) {
            Label label6 = label3.nextListElement;
            label3.nextListElement = null;
            label3 = label6;
        }
    }

    public final Label getCanonicalInstance() {
        Frame frame = this.frame;
        return frame == null ? this : frame.owner;
    }

    public final void markSubroutine(short s) {
        this.nextListElement = EMPTY_LIST;
        Label label = this;
        while (label != EMPTY_LIST) {
            Label label2 = label.nextListElement;
            label.nextListElement = null;
            if (label.subroutineId == 0) {
                label.subroutineId = s;
                label = label.pushSuccessors(label2);
            } else {
                label = label2;
            }
        }
    }

    public final void put(ByteVector byteVector, int i, boolean z) {
        if ((this.flags & 4) != 0) {
            if (z) {
                byteVector.putInt(this.bytecodeOffset - i);
                return;
            } else {
                byteVector.putShort(this.bytecodeOffset - i);
                return;
            }
        }
        if (z) {
            addForwardReference(i, 536870912, byteVector.length);
            byteVector.putInt(-1);
        } else {
            addForwardReference(i, 268435456, byteVector.length);
            byteVector.putShort(-1);
        }
    }

    public final boolean resolve(byte[] bArr, int i) {
        this.flags = (short) (this.flags | 4);
        this.bytecodeOffset = i;
        int[] iArr = this.forwardReferences;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.forwardReferences;
            int i3 = iArr2[i2 - 1];
            int i4 = iArr2[i2];
            int i5 = i - i3;
            int i6 = 268435455 & i4;
            if ((i4 & (-268435456)) == 268435456) {
                if (i5 < -32768 || i5 > 32767) {
                    int i7 = bArr[i3] & UByte.MAX_VALUE;
                    if (i7 < 198) {
                        bArr[i3] = (byte) (i7 + 49);
                    } else {
                        bArr[i3] = (byte) (i7 + 20);
                    }
                    z = true;
                }
                bArr[i6] = (byte) (i5 >>> 8);
                bArr[i6 + 1] = (byte) i5;
            } else {
                bArr[i6] = (byte) (i5 >>> 24);
                bArr[i6 + 1] = (byte) (i5 >>> 16);
                bArr[i6 + 2] = (byte) (i5 >>> 8);
                bArr[i6 + 3] = (byte) i5;
            }
        }
        return z;
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }
}
