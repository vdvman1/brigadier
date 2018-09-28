package com.mojang.brigadier.value;

public class LongCharValue implements Value {
    private int value;

    public LongCharValue(int value) {
        this.value = value;
    }

    @Override
    public String typeName() {
        return "UTF-32 char";
    }

    // TODO: Should this not be implemented
    @Override
    public boolean toBoolean() {
        return value != 0;
    }

    @Override
    public byte toByte() {
        return (byte)value;
    }

    @Override
    public char toChar() {
        return (char)value;
    }

    @Override
    public short toShort() {
        return (short)value;
    }

    @Override
    public int toInt() {
        return value;
    }

    @Override
    public long toLong() {
        return value;
    }

    // TODO: Should this not be implemented?
    @Override
    public float toFloat() {
        return value;
    }

    // TODO: Should this not be implemented?
    @Override
    public double toDouble() {
        return value;
    }

    @Override
    public String toString() {
        return new String(Character.toChars(value));
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }
}
