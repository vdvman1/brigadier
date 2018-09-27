package com.mojang.brigadier.value;

public class DoubleValue extends NumberValue {
    private double value;

    public DoubleValue(double value) {
        this.value = value;
    }

    @Override
    protected Number toNumber() {
        return value;
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
        return (float)value;
    }

    @Override
    public double toDouble() {
        return value;
    }
}
