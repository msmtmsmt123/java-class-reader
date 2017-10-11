package com.baislsl.decompiler.instruction;

import com.baislsl.decompiler.engine.Frame;
import com.baislsl.decompiler.structure.attribute.Code;

public abstract class XorInstruction extends OperationInstruction {
    @Override
    public Executable build(Code code, Frame frame) {
        this.operator = "^";
        return super.build(code, frame);
    }
}
