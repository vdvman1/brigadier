package com.mojang.brigadier.value;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

import java.util.List;
import java.util.Map;

// TODO: Is there a better way to get the typename for the destination?

public interface Value {
    Value SUCCESS = new BooleanValue(true);
    Value FAIL = new BooleanValue(false);

    String typeName();

    default boolean toBoolean() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), BooleanValue.TypeName());
    }

    default byte toByte(double scale) throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), ByteValue.TypeName());
    }

    default byte toByte() throws CommandSyntaxException {
        return toByte(1);
    }

    // TODO: Should this not have scale?
    default char toChar(double scale) throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), CharValue.TypeName());
    }

    default char toChar() throws CommandSyntaxException {
        return toChar(1);
    }

    default short toShort(double scale) throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), ShortValue.TypeName());
    }

    default short toShort() throws CommandSyntaxException {
        return toShort(1);
    }

    default int toInt(double scale) throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), IntValue.TypeName());
    }

    default int toInt() throws CommandSyntaxException {
        return toInt(1);
    }

    default long toLong(double scale) throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), LongValue.TypeName());
    }

    default long toLong() throws CommandSyntaxException {
        return toLong(1);
    }

    default float toFloat(double scale) throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), FloatValue.TypeName());
    }

    default float toFloat() throws CommandSyntaxException {
        return toFloat(1);
    }

    default double toDouble(double scale) throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), DoubleValue.TypeName());
    }

    default double toDouble() throws CommandSyntaxException {
        return toDouble(1);
    }

    default Map<Value, Value> toMap() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), MapValue.TypeName());
    }

    default List<Value> toList() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), ListValue.TypeName());
    }
}
