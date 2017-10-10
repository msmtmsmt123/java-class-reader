package com.baislsl.decompiler.instruction;

import com.baislsl.decompiler.engine.Frame;
import com.baislsl.decompiler.structure.attribute.Code;

public class ISTORE_3 extends RefStoreInstruction {
    @Override
    public Executable build(Code code, Frame frame) {
        this.n = 3;
        return super.build(code, frame);
    }
}
