package com.mojang.brigadier.value;

public class FloatValue extends NumberValue {
    private float value;

    public FloatValue(float value) {
        this.value = value;
    }

    public static String TypeName() {
        return "float";
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
