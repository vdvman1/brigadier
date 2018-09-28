package com.mojang.brigadier.value;

public class ShortValue extends NumberValue {
    private short value;

    public ShortValue(short value) {
        this.value = value;
    }

    public static String TypeName() {
        return "short";
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
