package io.github.mwttg.mathlib;

public final class LinearAlgebra {

    private LinearAlgebra() {
    }

    public static Vector2 add(final Vector2 v1, final Vector2 v2) {
        return Vector2.create(
                v1.x() + v2.x(),
                v1.y() + v2.y()
        );
    }

    public static Vector2 subtract(final Vector2 v1, final Vector2 v2) {
        return Vector2.create(
                v1.x() - v2.x(),
                v1.y() - v2.y()
        );
    }

    public static float length(final Vector2 v) {
        return (float) Math.sqrt((v.x() * v.x()) + (v.y() * v.y()));
    }
}
