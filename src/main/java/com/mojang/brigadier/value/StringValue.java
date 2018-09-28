package com.mojang.brigadier.value;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringValue implements Value {
    private String value;

    public StringValue(String value) {
        this.value = value == null ? "" : value;
    }

    @Override
    public String typeName() {
        return "string";
    }

    // TODO: Should this not be implemented?
    @Override
    public boolean toBoolean() {
        return value.length() > 0;
    }

    @Override
    public byte toByte(double scale) {
        return (byte)toDouble(scale);
    }

    // TODO: Should this not be implemented?
    @Override
    public char toChar(double scale) {
        return (char) toDouble(scale);
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
        return value.length() * scale;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public List<Value> toList() {
        return value.chars().mapToObj(LongCharValue::new).collect(Collectors.toList());
    }

    @Override
    public Map<Value, Value> toMap() {
        return MapValue.listToMap(toList());
    }
}
