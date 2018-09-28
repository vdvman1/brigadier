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
    public byte toByte(double scale) {
        return (byte) toDouble(scale);
    }

    // Boolean intentionally ignores scale when converting to char
    @Override
    public char toChar(double scale) {
        return value ? '1' : '0';
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

    @Override
    public float toFloat(double scale) {
        return (float) toDouble(scale);
    }

    @Override
    public double toDouble(double scale) {
        return value ? scale : 0;
    }

    @Override
    public String toString() {
        return String.valueOf(toChar(1));
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(value);
    }
}
