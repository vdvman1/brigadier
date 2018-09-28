package com.mojang.brigadier.value;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListValue implements Value {
    private List<Value> value;

    public ListValue(List<Value> value) {
        this.value = value == null ? new ArrayList<>() : value;
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
        return value.size() * scale;
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
