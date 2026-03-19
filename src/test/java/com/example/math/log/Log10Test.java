package com.example.math.log;

import com.example.math.base.Ln;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Log10Test {

    private final Log10 log10 = new Log10(new Ln(1e-6));

    @Test
    void testOne() {
        assertEquals(0, log10.calculate(1), 1e-6);
    }

    @Test
    void testTen() {
        assertEquals(1, log10.calculate(10), 1e-3);
    }

    @Test
    void testInvalid() {
        assertTrue(Double.isNaN(log10.calculate(-5)));
    }
}