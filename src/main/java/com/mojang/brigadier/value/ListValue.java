package com.mojang.brigadier.value;

import java.util.List;
import java.util.Map;

public class ListValue implements Value {
    private List<Value> value;

    public ListValue(List<Value> value) {
        this.value = value;
    }

    public static String TypeName() {
        return "list";
    }

    @Override
    public String typeName() {
        return TypeName();
    }

    @Override
    public boolean toBoolean() {
        return !value.isEmpty();
    }

    @Override
    public byte toByte() {
        return (byte)toInt();
    }

    // TODO: Should this not be implemented?
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
        return value.size();
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
        return value.toString();
    }

    @Override
    public List<Value> toList() {
        return value;
    }

    @Override
    public Map<Value, Value> toMap() {
        return MapValue.listToMap(value);
    }
}
