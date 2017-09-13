package com.baislsl.decompiler.structure.constantPool;

import com.baislsl.decompiler.DecompileException;
import com.baislsl.decompiler.Result;

public class FloatTag extends FloatIntegerBasic {
    public FloatTag(int tag) {
        super(tag);
    }

    @Override
    public String[] description(Result result) throws DecompileException {
        return new String[]{
                "Float", Float.toString(getValue())
        };
    }

    public float getValue() {
        return (float) bytes;
    }
}