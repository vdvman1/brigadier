package com.mojang.brigadier.value;

public class CharValue implements Value {
    private char value;

    public CharValue(char value) {
        this.value = value;
    }

    public static String TypeName() {
        return "char";
    }

    @Override
    public String typeName() {
        return TypeName();
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
        return value;
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
        return String.valueOf(value);
    }

    @Override
    public int hashCode() {
        return Character.hashCode(value);
    }
}