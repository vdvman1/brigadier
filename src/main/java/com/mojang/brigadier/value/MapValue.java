package com.mojang.brigadier.value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapValue implements Value {
    private Map<Value, Value> value;

    public MapValue(Map<Value, Value> value) {
        this.value = value;
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
    public Map<Value, Value> toMap() {
        return value;
    }

    // TODO: implement toList
}
