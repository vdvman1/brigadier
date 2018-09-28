package com.mojang.brigadier.value;

public class LongValue extends NumberValue {
    private long value;

    public LongValue(long value) {
        this.value = value;
    }

    public static String TypeName() {
        return "long";
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
