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
    public byte toByte(double scale) {
        return (byte)toInt(1);
    }

    // TODO: Should this not be implemented?
    @Override
    public char toChar(double scale) {
        return (char) toInt(1);
    }

    @Override
    public short toShort(double scale) {
        return (short) toInt(1);
    }

    @Override
    public int toInt(double scale) {
        return value.size();
    }

    @Override
    public long toLong(double scale) {
        return toInt(1);
    }

    // TODO: Should this not be implemented?
    @Override
    public float toFloat(double scale) {
        return toInt(1);
    }

    // TODO: Should this not be implemented?
    @Override
    public double toDouble(double scale) {
        return toInt(1);
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
