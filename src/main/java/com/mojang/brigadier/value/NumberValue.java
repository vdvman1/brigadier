package com.mojang.brigadier.value;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

public abstract class NumberValue implements Value {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Number number = toNumber();
        if(o.equals(number)) return true;

        if (!(o instanceof NumberValue)) return false;

        final NumberValue that = (NumberValue) o;
        return that.toNumber().equals(number);
    }

    protected abstract Number toNumber();

    // Not implementing toBoolean here just for efficiency reasons (no boxing or conversion to double)

    @Override
    public int hashCode() {
        return toNumber().hashCode();
    }

    @Override
    public String toString() {
        return toNumber().toString();
    }

    @Override
    public byte toByte(double scale) throws CommandSyntaxException {
        return (byte) toDouble(scale);
    }

    @Override
    public short toShort(double scale) throws CommandSyntaxException {
        return (short) toDouble(scale);
    }

    @Override
    public int toInt(double scale) throws CommandSyntaxException {
        return (int) toDouble(scale);
    }

    @Override
    public long toLong(double scale) throws CommandSyntaxException {
        return (long) toDouble(scale);
    }

    @Override
    public float toFloat(double scale) throws CommandSyntaxException {
        return (float) toDouble(scale);
    }
}
