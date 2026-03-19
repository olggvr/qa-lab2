package com.example.math.log;

import com.example.math.base.Ln;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Log5Test {

    private final Log5 log5 = new Log5(new Ln(1e-6));

    @Test
    void testOne() {
        assertEquals(0, log5.calculate(1), 1e-6);
    }

    @Test
    void testFive() {
        assertEquals(1, log5.calculate(5), 1e-3);
    }

    @Test
    void testInvalid() {
        assertTrue(Double.isNaN(log5.calculate(0)));
    }
}