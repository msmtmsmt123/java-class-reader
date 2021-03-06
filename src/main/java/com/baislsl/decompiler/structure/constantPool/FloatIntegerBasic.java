package com.baislsl.decompiler.structure.constantPool;

import com.baislsl.decompiler.DecompileException;
import com.baislsl.decompiler.utils.Read;

import java.io.DataInputStream;

public abstract class FloatIntegerBasic extends ConstantPool {
    private static final int BYTES_SIZE = 4;
    protected int bytes;

    FloatIntegerBasic(int tag) {
        super(tag);
    }

    @Override
    public ConstantPool build(DataInputStream file) throws DecompileException {
        bytes = Read.readBytes(file, BYTES_SIZE);
        return this;
    }

}
