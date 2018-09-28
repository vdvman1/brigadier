package com.mojang.brigadier.value;

public class IntValue extends NumberValue {
    public static final IntValue ZERO = new IntValue(0);
    private int value;

    public IntValue(int value) {
        this.value = value;
    }

    public static String TypeName() {
        return "int";
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
