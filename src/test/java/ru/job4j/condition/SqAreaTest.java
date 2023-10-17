package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {
    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K1Square4() {
        int expected = 4;
        int p = 8;
        double k = 1;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP202K100Square100() {
        int expected = 100;
        int p = 202;
        double k = 100;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}
