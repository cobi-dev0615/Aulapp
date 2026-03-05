package com.nimbusds.jose.shaded.ow2asm;

/* loaded from: classes2.dex */
final class CurrentFrame extends Frame {
    public CurrentFrame(Label label) {
        super(label);
    }

    @Override // com.nimbusds.jose.shaded.ow2asm.Frame
    public void execute(int i, int i2, Symbol symbol, SymbolTable symbolTable) {
        super.execute(i, i2, symbol, symbolTable);
        Frame frame = new Frame(null);
        merge(symbolTable, frame, 0);
        copyFrom(frame);
    }
}
