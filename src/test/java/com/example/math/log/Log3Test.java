package com.example.math.log;

import com.example.math.base.Ln;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Log3Test {

    private final Log3 log3 = new Log3(new Ln(1e-6));

    @Test
    void testOne() {
        assertEquals(0, log3.calculate(1), 1e-6);
    }

    @Test
    void testThree() {
        assertEquals(1, log3.calculate(3), 1e-3);
    }

    @Test
    void testInvalid() {
        assertTrue(Double.isNaN(log3.calculate(-1)));
    }
}