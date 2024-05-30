package io.github.mwttg.mathlib;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Vector2Test {

    private final Vector2 VECTOR2 = Vector2.create(1.5f, 2.5f);
    private final Vector2 OTHER_VECTOR2 = Vector2.create(2.5f, 3.5f);

    @Test
    void testAdd() {
        assertThat(VECTOR2.add(OTHER_VECTOR2)).isEqualTo(new Vector2(4.0f, 6.0f));
    }

    @Test
    void testSubtract() {
        assertThat(OTHER_VECTOR2.subtract(VECTOR2)).isEqualTo(new Vector2(1.0f, 1.0f));
    }

    @Test
    void testLength() {
        final Vector2 subject = Vector2.create(3.0f, 4.0f);
        assertThat(subject.length()).isEqualTo(5.0f);
    }
}