package com.mojang.brigadier.value;

public class BooleanValue implements Value {
    private boolean value;

    public BooleanValue(boolean value) {
        this.value = value;
    }

    public static String TypeName() {
        return "boolean";
    }

    @Override
    public String typeName() {
        return TypeName();
    }

    @Override
    public boolean toBoolean() {
        return value;
    }

    @Override
    public byte toByte() {
        return (byte)(value ? 1 : 0);
    }

    @Override
    public char toChar() {
        return value ? '1' : '0';
    }

    @Override
    public short toShort() {
        return toByte();
    }

    @Override
    public int toInt() {
        return toByte();
    }

    @Override
    public long toLong() {
        return toByte();
    }

    @Override
    public float toFloat() {
        return toByte();
    }

    @Override
    public double toDouble() {
        return toByte();
    }

    @Override
    public String toString() {
        return String.valueOf(toChar());
    }

    @Override
    public int hashCode() {
        return toByte();
    }
}
