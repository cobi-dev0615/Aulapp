package com.nimbusds.jose.shaded.ow2asm;

import com.nimbusds.jose.shaded.ow2asm.Attribute;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public class ClassWriter extends ClassVisitor {
    private int accessFlags;
    private int compute;
    private ByteVector debugExtension;
    private int enclosingClassIndex;
    private int enclosingMethodIndex;
    private Attribute firstAttribute;
    private FieldWriter firstField;
    private MethodWriter firstMethod;
    private RecordComponentWriter firstRecordComponent;
    private ByteVector innerClasses;
    private int interfaceCount;
    private int[] interfaces;
    private FieldWriter lastField;
    private MethodWriter lastMethod;
    private RecordComponentWriter lastRecordComponent;
    private AnnotationWriter lastRuntimeInvisibleAnnotation;
    private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private AnnotationWriter lastRuntimeVisibleAnnotation;
    private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private ModuleWriter moduleWriter;
    private int nestHostClassIndex;
    private ByteVector nestMemberClasses;
    private int numberOfInnerClasses;
    private int numberOfNestMemberClasses;
    private int numberOfPermittedSubclasses;
    private ByteVector permittedSubclasses;
    private int signatureIndex;
    private int sourceFileIndex;
    private int superClass;
    private final SymbolTable symbolTable;
    private int thisClass;
    private int version;

    public ClassWriter(int i) {
        this(null, i);
    }

    private Attribute[] getAttributePrototypes() {
        Attribute.Set set = new Attribute.Set();
        set.addAttributes(this.firstAttribute);
        for (FieldWriter fieldWriter = this.firstField; fieldWriter != null; fieldWriter = (FieldWriter) fieldWriter.fv) {
            fieldWriter.collectAttributePrototypes(set);
        }
        for (MethodWriter methodWriter = this.firstMethod; methodWriter != null; methodWriter = (MethodWriter) methodWriter.mv) {
            methodWriter.collectAttributePrototypes(set);
        }
        for (RecordComponentWriter recordComponentWriter = this.firstRecordComponent; recordComponentWriter != null; recordComponentWriter = (RecordComponentWriter) recordComponentWriter.delegate) {
            recordComponentWriter.collectAttributePrototypes(set);
        }
        return set.toArray();
    }

    private byte[] replaceAsmInstructions(byte[] bArr, boolean z) {
        Attribute[] attributePrototypes = getAttributePrototypes();
        this.firstField = null;
        this.lastField = null;
        this.firstMethod = null;
        this.lastMethod = null;
        this.lastRuntimeVisibleAnnotation = null;
        this.lastRuntimeInvisibleAnnotation = null;
        this.lastRuntimeVisibleTypeAnnotation = null;
        this.lastRuntimeInvisibleTypeAnnotation = null;
        this.moduleWriter = null;
        this.nestHostClassIndex = 0;
        this.numberOfNestMemberClasses = 0;
        this.nestMemberClasses = null;
        this.numberOfPermittedSubclasses = 0;
        this.permittedSubclasses = null;
        this.firstRecordComponent = null;
        this.lastRecordComponent = null;
        this.firstAttribute = null;
        this.compute = z ? 3 : 0;
        new ClassReader(bArr, 0, false).accept(this, attributePrototypes, (z ? 8 : 0) | 256);
        return toByteArray();
    }

    public ClassLoader getClassLoader() {
        return getClass().getClassLoader();
    }

    public String getCommonSuperClass(String str, String str2) {
        ClassLoader classLoader = getClassLoader();
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, classLoader);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, classLoader);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (cls.isInterface() || cls2.isInterface()) {
                    return "java/lang/Object";
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(cls2));
                return cls.getName().replace('.', '/');
            } catch (ClassNotFoundException e) {
                throw new TypeNotPresentException(str2, e);
            }
        } catch (ClassNotFoundException e2) {
            throw new TypeNotPresentException(str, e2);
        }
    }

    public byte[] toByteArray() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = (this.interfaceCount * 2) + 24;
        int i12 = 0;
        for (FieldWriter fieldWriter = this.firstField; fieldWriter != null; fieldWriter = (FieldWriter) fieldWriter.fv) {
            i12++;
            i11 += fieldWriter.computeFieldInfoSize();
        }
        int i13 = 0;
        for (MethodWriter methodWriter = this.firstMethod; methodWriter != null; methodWriter = (MethodWriter) methodWriter.mv) {
            i13++;
            i11 += methodWriter.computeMethodInfoSize();
        }
        ByteVector byteVector = this.innerClasses;
        if (byteVector != null) {
            i11 += byteVector.length + 8;
            this.symbolTable.addConstantUtf8("InnerClasses");
            i = 1;
        } else {
            i = 0;
        }
        if (this.enclosingClassIndex != 0) {
            i++;
            i11 += 10;
            this.symbolTable.addConstantUtf8("EnclosingMethod");
        }
        if ((this.accessFlags & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 && (this.version & 65535) < 49) {
            i++;
            i11 += 6;
            this.symbolTable.addConstantUtf8("Synthetic");
        }
        if (this.signatureIndex != 0) {
            i++;
            i11 += 8;
            this.symbolTable.addConstantUtf8("Signature");
        }
        if (this.sourceFileIndex != 0) {
            i++;
            i11 += 8;
            this.symbolTable.addConstantUtf8("SourceFile");
        }
        ByteVector byteVector2 = this.debugExtension;
        if (byteVector2 != null) {
            i++;
            i11 += byteVector2.length + 6;
            this.symbolTable.addConstantUtf8("SourceDebugExtension");
        }
        if ((this.accessFlags & 131072) != 0) {
            i++;
            i11 += 6;
            this.symbolTable.addConstantUtf8("Deprecated");
        }
        AnnotationWriter annotationWriter = this.lastRuntimeVisibleAnnotation;
        if (annotationWriter != null) {
            i++;
            i11 += annotationWriter.computeAnnotationsSize("RuntimeVisibleAnnotations");
        }
        AnnotationWriter annotationWriter2 = this.lastRuntimeInvisibleAnnotation;
        if (annotationWriter2 != null) {
            i++;
            i11 += annotationWriter2.computeAnnotationsSize("RuntimeInvisibleAnnotations");
        }
        AnnotationWriter annotationWriter3 = this.lastRuntimeVisibleTypeAnnotation;
        if (annotationWriter3 != null) {
            i++;
            i11 += annotationWriter3.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
        }
        AnnotationWriter annotationWriter4 = this.lastRuntimeInvisibleTypeAnnotation;
        if (annotationWriter4 != null) {
            i++;
            i11 += annotationWriter4.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations");
        }
        if (this.symbolTable.computeBootstrapMethodsSize() > 0) {
            i++;
            i11 += this.symbolTable.computeBootstrapMethodsSize();
        }
        ModuleWriter moduleWriter = this.moduleWriter;
        if (moduleWriter != null) {
            i += moduleWriter.getAttributeCount();
            i11 += this.moduleWriter.computeAttributesSize();
        }
        if (this.nestHostClassIndex != 0) {
            i++;
            i11 += 8;
            this.symbolTable.addConstantUtf8("NestHost");
        }
        ByteVector byteVector3 = this.nestMemberClasses;
        if (byteVector3 != null) {
            i++;
            i11 += byteVector3.length + 8;
            this.symbolTable.addConstantUtf8("NestMembers");
        }
        ByteVector byteVector4 = this.permittedSubclasses;
        if (byteVector4 != null) {
            i++;
            i11 += byteVector4.length + 8;
            this.symbolTable.addConstantUtf8("PermittedSubclasses");
        }
        int i14 = i11;
        if ((this.accessFlags & 65536) == 0 && this.firstRecordComponent == null) {
            i5 = i14;
            i2 = 0;
            i3 = i;
            i4 = 0;
        } else {
            i2 = 0;
            int i15 = 0;
            for (RecordComponentWriter recordComponentWriter = this.firstRecordComponent; recordComponentWriter != null; recordComponentWriter = (RecordComponentWriter) recordComponentWriter.delegate) {
                i15++;
                i2 += recordComponentWriter.computeRecordComponentInfoSize();
            }
            int i16 = i2 + 8 + i14;
            i3 = i + 1;
            this.symbolTable.addConstantUtf8("Record");
            i4 = i15;
            i5 = i16;
        }
        Attribute attribute = this.firstAttribute;
        if (attribute != null) {
            i6 = i4;
            i7 = attribute.getAttributeCount() + i3;
            i8 = this.firstAttribute.computeAttributesSize(this.symbolTable) + i5;
        } else {
            i6 = i4;
            i7 = i3;
            i8 = i5;
        }
        int constantPoolLength = i8 + this.symbolTable.getConstantPoolLength();
        int constantPoolCount = this.symbolTable.getConstantPoolCount();
        if (constantPoolCount > 65535) {
            throw new ClassTooLargeException(this.symbolTable.getClassName(), constantPoolCount);
        }
        ByteVector byteVector5 = new ByteVector(constantPoolLength);
        byteVector5.putInt(-889275714).putInt(this.version);
        this.symbolTable.putConstantPool(byteVector5);
        byteVector5.putShort((~((this.version & 65535) < 49 ? ConstantsKt.DEFAULT_BLOCK_SIZE : 0)) & this.accessFlags).putShort(this.thisClass).putShort(this.superClass);
        byteVector5.putShort(this.interfaceCount);
        for (int i17 = 0; i17 < this.interfaceCount; i17++) {
            byteVector5.putShort(this.interfaces[i17]);
        }
        byteVector5.putShort(i12);
        for (FieldWriter fieldWriter2 = this.firstField; fieldWriter2 != null; fieldWriter2 = (FieldWriter) fieldWriter2.fv) {
            fieldWriter2.putFieldInfo(byteVector5);
        }
        byteVector5.putShort(i13);
        boolean z = false;
        boolean z2 = false;
        for (MethodWriter methodWriter2 = this.firstMethod; methodWriter2 != null; methodWriter2 = (MethodWriter) methodWriter2.mv) {
            z |= methodWriter2.hasFrames();
            z2 |= methodWriter2.hasAsmInstructions();
            methodWriter2.putMethodInfo(byteVector5);
        }
        byteVector5.putShort(i7);
        if (this.innerClasses != null) {
            ByteVector putShort = byteVector5.putShort(this.symbolTable.addConstantUtf8("InnerClasses")).putInt(this.innerClasses.length + 2).putShort(this.numberOfInnerClasses);
            ByteVector byteVector6 = this.innerClasses;
            putShort.putByteArray(byteVector6.data, 0, byteVector6.length);
        }
        if (this.enclosingClassIndex != 0) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("EnclosingMethod")).putInt(4).putShort(this.enclosingClassIndex).putShort(this.enclosingMethodIndex);
        }
        if ((this.accessFlags & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 && (this.version & 65535) < 49) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("Synthetic")).putInt(0);
        }
        if (this.signatureIndex != 0) {
            i9 = 2;
            byteVector5.putShort(this.symbolTable.addConstantUtf8("Signature")).putInt(2).putShort(this.signatureIndex);
        } else {
            i9 = 2;
        }
        if (this.sourceFileIndex != 0) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("SourceFile")).putInt(i9).putShort(this.sourceFileIndex);
        }
        ByteVector byteVector7 = this.debugExtension;
        if (byteVector7 != null) {
            int i18 = byteVector7.length;
            i10 = 0;
            byteVector5.putShort(this.symbolTable.addConstantUtf8("SourceDebugExtension")).putInt(i18).putByteArray(this.debugExtension.data, 0, i18);
        } else {
            i10 = 0;
        }
        if ((this.accessFlags & 131072) != 0) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("Deprecated")).putInt(i10);
        }
        AnnotationWriter.putAnnotations(this.symbolTable, this.lastRuntimeVisibleAnnotation, this.lastRuntimeInvisibleAnnotation, this.lastRuntimeVisibleTypeAnnotation, this.lastRuntimeInvisibleTypeAnnotation, byteVector5);
        this.symbolTable.putBootstrapMethods(byteVector5);
        ModuleWriter moduleWriter2 = this.moduleWriter;
        if (moduleWriter2 != null) {
            moduleWriter2.putAttributes(byteVector5);
        }
        if (this.nestHostClassIndex != 0) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("NestHost")).putInt(2).putShort(this.nestHostClassIndex);
        }
        if (this.nestMemberClasses != null) {
            ByteVector putShort2 = byteVector5.putShort(this.symbolTable.addConstantUtf8("NestMembers")).putInt(this.nestMemberClasses.length + 2).putShort(this.numberOfNestMemberClasses);
            ByteVector byteVector8 = this.nestMemberClasses;
            putShort2.putByteArray(byteVector8.data, 0, byteVector8.length);
        }
        if (this.permittedSubclasses != null) {
            ByteVector putShort3 = byteVector5.putShort(this.symbolTable.addConstantUtf8("PermittedSubclasses")).putInt(this.permittedSubclasses.length + 2).putShort(this.numberOfPermittedSubclasses);
            ByteVector byteVector9 = this.permittedSubclasses;
            putShort3.putByteArray(byteVector9.data, 0, byteVector9.length);
        }
        if ((this.accessFlags & 65536) != 0 || this.firstRecordComponent != null) {
            byteVector5.putShort(this.symbolTable.addConstantUtf8("Record")).putInt(i2 + 2).putShort(i6);
            for (RecordComponentWriter recordComponentWriter2 = this.firstRecordComponent; recordComponentWriter2 != null; recordComponentWriter2 = (RecordComponentWriter) recordComponentWriter2.delegate) {
                recordComponentWriter2.putRecordComponentInfo(byteVector5);
            }
        }
        Attribute attribute2 = this.firstAttribute;
        if (attribute2 != null) {
            attribute2.putAttributes(this.symbolTable, byteVector5);
        }
        return z2 ? replaceAsmInstructions(byteVector5.data, z) : byteVector5.data;
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.version = i;
        this.accessFlags = i2;
        int i3 = i & 65535;
        this.thisClass = this.symbolTable.setMajorVersionAndClassName(i3, str);
        if (str2 != null) {
            this.signatureIndex = this.symbolTable.addConstantUtf8(str2);
        }
        this.superClass = str3 == null ? 0 : this.symbolTable.addConstantClass(str3).index;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.interfaceCount = length;
            this.interfaces = new int[length];
            for (int i4 = 0; i4 < this.interfaceCount; i4++) {
                this.interfaces[i4] = this.symbolTable.addConstantClass(strArr[i4]).index;
            }
        }
        if (this.compute != 1 || i3 < 51) {
            return;
        }
        this.compute = 2;
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final AnnotationVisitor visitAnnotation(String str, boolean z) {
        if (z) {
            AnnotationWriter create = AnnotationWriter.create(this.symbolTable, str, this.lastRuntimeVisibleAnnotation);
            this.lastRuntimeVisibleAnnotation = create;
            return create;
        }
        AnnotationWriter create2 = AnnotationWriter.create(this.symbolTable, str, this.lastRuntimeInvisibleAnnotation);
        this.lastRuntimeInvisibleAnnotation = create2;
        return create2;
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final void visitAttribute(Attribute attribute) {
        attribute.nextAttribute = this.firstAttribute;
        this.firstAttribute = attribute;
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final void visitEnd() {
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        FieldWriter fieldWriter = new FieldWriter(this.symbolTable, i, str, str2, str3, obj);
        if (this.firstField == null) {
            this.firstField = fieldWriter;
        } else {
            this.lastField.fv = fieldWriter;
        }
        this.lastField = fieldWriter;
        return fieldWriter;
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final void visitInnerClass(String str, String str2, String str3, int i) {
        if (this.innerClasses == null) {
            this.innerClasses = new ByteVector();
        }
        Symbol addConstantClass = this.symbolTable.addConstantClass(str);
        if (addConstantClass.info == 0) {
            this.numberOfInnerClasses++;
            this.innerClasses.putShort(addConstantClass.index);
            this.innerClasses.putShort(str2 == null ? 0 : this.symbolTable.addConstantClass(str2).index);
            this.innerClasses.putShort(str3 != null ? this.symbolTable.addConstantUtf8(str3) : 0);
            this.innerClasses.putShort(i);
            addConstantClass.info = this.numberOfInnerClasses;
        }
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        MethodWriter methodWriter = new MethodWriter(this.symbolTable, i, str, str2, str3, strArr, this.compute);
        if (this.firstMethod == null) {
            this.firstMethod = methodWriter;
        } else {
            this.lastMethod.mv = methodWriter;
        }
        this.lastMethod = methodWriter;
        return methodWriter;
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final ModuleVisitor visitModule(String str, int i, String str2) {
        SymbolTable symbolTable = this.symbolTable;
        ModuleWriter moduleWriter = new ModuleWriter(symbolTable, symbolTable.addConstantModule(str).index, i, str2 == null ? 0 : this.symbolTable.addConstantUtf8(str2));
        this.moduleWriter = moduleWriter;
        return moduleWriter;
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final void visitNestHost(String str) {
        this.nestHostClassIndex = this.symbolTable.addConstantClass(str).index;
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final void visitNestMember(String str) {
        if (this.nestMemberClasses == null) {
            this.nestMemberClasses = new ByteVector();
        }
        this.numberOfNestMemberClasses++;
        this.nestMemberClasses.putShort(this.symbolTable.addConstantClass(str).index);
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final void visitOuterClass(String str, String str2, String str3) {
        this.enclosingClassIndex = this.symbolTable.addConstantClass(str).index;
        if (str2 == null || str3 == null) {
            return;
        }
        this.enclosingMethodIndex = this.symbolTable.addConstantNameAndType(str2, str3);
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final void visitPermittedSubclass(String str) {
        if (this.permittedSubclasses == null) {
            this.permittedSubclasses = new ByteVector();
        }
        this.numberOfPermittedSubclasses++;
        this.permittedSubclasses.putShort(this.symbolTable.addConstantClass(str).index);
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final RecordComponentVisitor visitRecordComponent(String str, String str2, String str3) {
        RecordComponentWriter recordComponentWriter = new RecordComponentWriter(this.symbolTable, str, str2, str3);
        if (this.firstRecordComponent == null) {
            this.firstRecordComponent = recordComponentWriter;
        } else {
            this.lastRecordComponent.delegate = recordComponentWriter;
        }
        this.lastRecordComponent = recordComponentWriter;
        return recordComponentWriter;
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final void visitSource(String str, String str2) {
        if (str != null) {
            this.sourceFileIndex = this.symbolTable.addConstantUtf8(str);
        }
        if (str2 != null) {
            this.debugExtension = new ByteVector().encodeUtf8(str2, 0, IntCompanionObject.MAX_VALUE);
        }
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.ClassVisitor
    public final AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (z) {
            AnnotationWriter create = AnnotationWriter.create(this.symbolTable, i, typePath, str, this.lastRuntimeVisibleTypeAnnotation);
            this.lastRuntimeVisibleTypeAnnotation = create;
            return create;
        }
        AnnotationWriter create2 = AnnotationWriter.create(this.symbolTable, i, typePath, str, this.lastRuntimeInvisibleTypeAnnotation);
        this.lastRuntimeInvisibleTypeAnnotation = create2;
        return create2;
    }

    public ClassWriter(ClassReader classReader, int i) {
        super(589824);
        this.symbolTable = classReader == null ? new SymbolTable(this) : new SymbolTable(this, classReader);
        if ((i & 2) != 0) {
            this.compute = 4;
        } else if ((i & 1) != 0) {
            this.compute = 1;
        } else {
            this.compute = 0;
        }
    }
}
