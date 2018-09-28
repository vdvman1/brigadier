package com.mojang.brigadier.value;

public class ByteValue extends NumberValue {
    private byte value;

    public ByteValue(byte value) {
        this.value = value;
    }

    public static String TypeName() {
        return "byte";
    }

    @Override
    protected Number toNumber() {
        return value;
    }

    @Override
    public String typeName() {
        return TypeName();
    }

    @Override
    public boolean toBoolean() {
        return value != 0;
    }

    @Override
    public double toDouble(double scale) {
        return value * scale;
    }
}
