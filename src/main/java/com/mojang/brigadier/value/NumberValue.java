package com.mojang.brigadier.value;

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

    @Override
    public int hashCode() {
        return toNumber().hashCode();
    }
}
