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

    // TODO: Should this not be implemented?
    @Override
    public boolean toBoolean() {
        return value != 0;
    }

    @Override
    public char toChar(double scale) {
        return value;
    }

    @Override
    public byte toByte(double scale) {
        return (byte) toDouble(scale);
    }

    @Override
    public short toShort(double scale) {
        return (short) toDouble(scale);
    }

    @Override
    public int toInt(double scale) {
        return (int) toDouble(scale);
    }

    @Override
    public long toLong(double scale) {
        return (long) toDouble(scale);
    }

    // TODO: Should this not be implemented?
    @Override
    public float toFloat(double scale) {
        return (float) toDouble(scale);
    }

    // TODO: Should this not be implemented?
    @Override
    public double toDouble(double scale) {
        return value * scale;
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