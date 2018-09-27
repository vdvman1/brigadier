package com.mojang.brigadier.value;

import java.util.List;
import java.util.Map;

public interface Value {
    Value SUCCESS = new BooleanValue(true);
    Value FAIL = new BooleanValue(false);

    default boolean toBoolean() {
        // TODO: Throw a CommandSyntaxException
        throw new UnsupportedOperationException();
    }

    default byte toByte() {
        // TODO: Throw a CommandSyntaxException
        throw new UnsupportedOperationException();
    }

    default char toChar() {
        // TODO: Throw a CommandSyntaxException
        throw new UnsupportedOperationException();
    }

    default short toShort() {
        // TODO: Throw a CommandSyntaxException
        throw new UnsupportedOperationException();
    }

    default int toInt() {
        // TODO: Throw a CommandSyntaxException
        throw new UnsupportedOperationException();
    }

    default long toLong() {
        // TODO: Throw a CommandSyntaxException
        throw new UnsupportedOperationException();
    }

    default float toFloat() {
        // TODO: Throw a CommandSyntaxException
        throw new UnsupportedOperationException();
    }

    default double toDouble() {
        // TODO: Throw a CommandSyntaxException
        throw new UnsupportedOperationException();
    }

    default Map<Value, Value> toMap() {
        // TODO: Throw a CommandSyntaxException
        throw new UnsupportedOperationException();
    }

    default List<Value> toList() {
        // TODO: Throw a CommandSyntaxException
        throw new UnsupportedOperationException();
    }
}
