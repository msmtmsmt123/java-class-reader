package com.baislsl.decompiler.structure.constantPool;

public class LongTag extends LongDoubleBasic {
    public LongTag(int tag) {
        super(tag);
    }

    public long getValue() {
        return ((long) highByte << 32) | Integer.toUnsignedLong(lowByte);
    }
}
