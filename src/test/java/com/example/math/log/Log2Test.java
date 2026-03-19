package com.example.math.log;

import com.example.math.base.Ln;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Log2Test {

    private final Log2 log2 = new Log2(new Ln(1e-6));

    @Test
    void testOne() {
        assertEquals(0, log2.calculate(1), 1e-6);
    }

    @Test
    void testTwo() {
        assertEquals(1, log2.calculate(2), 1e-3);
    }

    @Test
    void testInvalid() {
        assertTrue(Double.isNaN(log2.calculate(0)));
    }
}