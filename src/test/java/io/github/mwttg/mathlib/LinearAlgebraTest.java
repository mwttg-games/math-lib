package io.github.mwttg.mathlib;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinearAlgebraTest {

    @Test
    void testVector2Addition() {
        assertThat(LinearAlgebra.add(new Vector2(1.5f, 2.5f), new Vector2(2.5f, 3.5f))).isEqualTo(Vector2.create(4.0f, 6.0f));
    }

    @Test
    void testVector2Subtraction() {
        assertThat(LinearAlgebra.subtract(new Vector2(2.5f, 3.5f), new Vector2(1.5f, 2.5f))).isEqualTo(Vector2.create(1.0f, 1.0f));
    }

    @Test
    void testVector2Length() {
        assertThat(LinearAlgebra.length(new Vector2(3.0f, 4.0f))).isEqualTo(5.0f);
    }
}