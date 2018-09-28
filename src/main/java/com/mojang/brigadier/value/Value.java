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

    default byte toByte() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), ByteValue.TypeName());
    }

    default char toChar() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), CharValue.TypeName());
    }

    default short toShort() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), ShortValue.TypeName());
    }

    default int toInt() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), IntValue.TypeName());
    }

    default long toLong() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), LongValue.TypeName());
    }

    default float toFloat() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), FloatValue.TypeName());
    }

    default double toDouble() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), DoubleValue.TypeName());
    }

    default Map<Value, Value> toMap() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), MapValue.TypeName());
    }

    default List<Value> toList() throws CommandSyntaxException {
        throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.incompatibleTypes().create(typeName(), ListValue.TypeName());
    }
}
