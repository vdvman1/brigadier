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
    public byte toByte() {
        return (byte) value;
    }

    @Override
    public char toChar() {
        return (char) value;
    }

    @Override
    public short toShort() {
        return (short) value;
    }

    @Override
    public int toInt() {
        return (int) value;
    }

    @Override
    public long toLong() {
        return (long) value;
    }

    @Override
    public float toFloat() {
        return value;
    }

    @Override
    public double toDouble() {
        return value;
    }
}
