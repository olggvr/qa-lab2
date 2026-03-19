package com.example.math.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SinTest {

    @Test
    void testZero() {
        Sin sin = new Sin(1e-6);
        assertEquals(0, sin.calculate(0), 1e-6);
    }

    @Test
    void testPi() {
        Sin sin = new Sin(1e-6);
        assertEquals(0, sin.calculate(Math.PI), 1e-3);
    }
}