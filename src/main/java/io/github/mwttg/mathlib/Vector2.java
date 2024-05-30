package io.github.mwttg.mathlib;

public record Vector2(float x, float y) {

    public static Vector2 create(final float x, final float y) {
        return new Vector2(x, y);
    }

    public Vector2 add(final Vector2 other) {
        return LinearAlgebra.add(this, other);
    }

    public Vector2 subtract(final Vector2 other) {
        return LinearAlgebra.subtract(this, other);
    }

    public float length() {
        return LinearAlgebra.length(this);
    }
}
