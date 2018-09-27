package com.mojang.brigadier.value;

public class ShortValue extends NumberValue {
    private short value;

    public ShortValue(short value) {
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
        return value;
    }

    @Override
    public int toInt() {
        return value;
    }

    @Override
    public long toLong() {
        return value;
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
