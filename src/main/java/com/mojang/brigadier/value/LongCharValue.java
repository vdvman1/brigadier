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
    public byte toByte(double scale) {
        return (byte)toDouble(scale);
    }

    @Override
    public char toChar(double scale) {
        return (char)toDouble(scale);
    }

    @Override
    public short toShort(double scale) {
        return (short)toDouble(scale);
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
        return new String(Character.toChars(value));
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }
}
