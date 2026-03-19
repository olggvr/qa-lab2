package com.example.math.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LnTest {

    @Test
    void testOne() {
        Ln ln = new Ln(1e-6);
        assertEquals(0, ln.calculate(1), 1e-6);
    }

    @Test
    void testE() {
        Ln ln = new Ln(1e-6);
        assertEquals(1, ln.calculate(Math.E), 1e-3);
    }

    @Test
    void testInvalid() {
        Ln ln = new Ln(1e-6);
        assertTrue(Double.isNaN(ln.calculate(0)));
    }
}