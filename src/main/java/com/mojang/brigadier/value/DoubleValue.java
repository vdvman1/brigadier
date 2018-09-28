package com.mojang.brigadier.value;

public class DoubleValue extends NumberValue {
    private double value;

    public DoubleValue(double value) {
        this.value = value;
    }

    public static String TypeName() {
        return "double";
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
