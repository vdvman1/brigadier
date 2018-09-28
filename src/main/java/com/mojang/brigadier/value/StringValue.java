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
        return toInt() > 0;
    }

    @Override
    public byte toByte() {
        return (byte)toInt();
    }

    @Override
    public char toChar() {
        return (char) toInt();
    }

    @Override
    public short toShort() {
        return (short) toInt();
    }

    @Override
    public int toInt() {
        return value.length();
    }

    @Override
    public long toLong() {
        return toInt();
    }

    // TODO: Should this not be implemented?
    @Override
    public float toFloat() {
        return toInt();
    }

    // TODO: Should this not be implemented?
    @Override
    public double toDouble() {
        return toInt();
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
