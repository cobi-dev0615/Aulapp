package com.nimbusds.jose.shaded.ow2asm;

import com.nimbusds.jose.shaded.ow2asm.Attribute;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
final class FieldWriter extends FieldVisitor {
    private final int accessFlags;
    private int constantValueIndex;
    private final int descriptorIndex;
    private Attribute firstAttribute;
    private AnnotationWriter lastRuntimeInvisibleAnnotation;
    private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private AnnotationWriter lastRuntimeVisibleAnnotation;
    private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private final int nameIndex;
    private int signatureIndex;
    private final SymbolTable symbolTable;

    public FieldWriter(SymbolTable symbolTable, int i, String str, String str2, String str3, Object obj) {
        super(589824);
        this.symbolTable = symbolTable;
        this.accessFlags = i;
        this.nameIndex = symbolTable.addConstantUtf8(str);
        this.descriptorIndex = symbolTable.addConstantUtf8(str2);
        if (str3 != null) {
            this.signatureIndex = symbolTable.addConstantUtf8(str3);
        }
        if (obj != null) {
            this.constantValueIndex = symbolTable.addConstant(obj).index;
        }
    }

    public final void collectAttributePrototypes(Attribute.Set set) {
        set.addAttributes(this.firstAttribute);
    }

    public int computeFieldInfoSize() {
        int i;
        if (this.constantValueIndex != 0) {
            this.symbolTable.addConstantUtf8("ConstantValue");
            i = 16;
        } else {
            i = 8;
        }
        int computeAttributesSize = Attribute.computeAttributesSize(this.symbolTable, this.accessFlags, this.signatureIndex) + i + AnnotationWriter.computeAnnotationsSize(this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation);
        Attribute attribute = this.firstAttribute;
        return attribute != null ? attribute.computeAttributesSize(this.symbolTable) + computeAttributesSize : computeAttributesSize;
    }

    public void putFieldInfo(ByteVector byteVector) {
        boolean z = this.symbolTable.getMajorVersion() < 49;
        byteVector.putShort((~(z ? ConstantsKt.DEFAULT_BLOCK_SIZE : 0)) & this.accessFlags).putShort(this.nameIndex).putShort(this.descriptorIndex);
        int i = this.constantValueIndex != 0 ? 1 : 0;
        int i2 = this.accessFlags;
        if ((i2 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 && z) {
            i++;
        }
        if (this.signatureIndex != 0) {
            i++;
        }
        if ((131072 & i2) != 0) {
            i++;
        }
        if (this.lastRuntimeVisibleAnnotation != null) {
            i++;
        }
        if (this.lastRuntimeInvisibleAnnotation != null) {
            i++;
        }
        if (this.lastRuntimeVisibleTypeAnnotation != null) {
            i++;
        }
        if (this.lastRuntimeInvisibleTypeAnnotation != null) {
            i++;
        }
        Attribute attribute = this.firstAttribute;
        if (attribute != null) {
            i += attribute.getAttributeCount();
        }
        byteVector.putShort(i);
        if (this.constantValueIndex != 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("ConstantValue")).putInt(2).putShort(this.constantValueIndex);
        }
        Attribute.putAttributes(this.symbolTable, this.accessFlags, this.signatureIndex, byteVector);
        AnnotationWriter.putAnnotations(this.symbolTable, this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation, byteVector);
        Attribute attribute2 = this.firstAttribute;
        if (attribute2 != null) {
            attribute2.putAttributes(this.symbolTable, byteVector);
        }
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.FieldVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        if (z) {
            AnnotationWriter create = AnnotationWriter.create(this.symbolTable, str, this.lastRuntimeVisibleAnnotation);
            this.lastRuntimeVisibleAnnotation = create;
            return create;
        }
        AnnotationWriter create2 = AnnotationWriter.create(this.symbolTable, str, this.lastRuntimeInvisibleAnnotation);
        this.lastRuntimeInvisibleAnnotation = create2;
        return create2;
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.FieldVisitor
    public void visitAttribute(Attribute attribute) {
        attribute.nextAttribute = this.firstAttribute;
        this.firstAttribute = attribute;
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.FieldVisitor
    public void visitEnd() {
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.FieldVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (z) {
            AnnotationWriter create = AnnotationWriter.create(this.symbolTable, i, typePath, str, this.lastRuntimeVisibleTypeAnnotation);
            this.lastRuntimeVisibleTypeAnnotation = create;
            return create;
        }
        AnnotationWriter create2 = AnnotationWriter.create(this.symbolTable, i, typePath, str, this.lastRuntimeInvisibleTypeAnnotation);
        this.lastRuntimeInvisibleTypeAnnotation = create2;
        return create2;
    }
}
