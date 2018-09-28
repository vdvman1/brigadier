package com.mojang.brigadier.value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapValue implements Value {
    private Map<Value, Value> value;

    public MapValue(Map<Value, Value> value) {
        this.value = value;
    }

    public MapValue(Map.Entry<Value, Value> entry) {
        value = new HashMap<>();
        value.put(entry.getKey(), entry.getValue());
    }

    public static Map<Value, Value> listToMap(List<Value> values) {
        return IntStream.range(0, values.size()).boxed().collect(Collectors.toMap(LongCharValue::new, values::get));
    }

    public static String TypeName() {
        /*
            TODO: What should this be called?
            Some possibilities:
              - object
              - map
              - compound
        */
        return "object";
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
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public Map<Value, Value> toMap() {
        return value;
    }

    @Override
    public List<Value> toList() {
        return value.entrySet().stream().map(MapValue::new).collect(Collectors.toList());
    }
}
