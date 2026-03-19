package com.example.math.trig;

import com.example.math.base.Sin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CscTest {

    private final Sin sin = new Sin(1e-6);
    private final Csc csc = new Csc(sin);

    @Test
    void testPiOver2() {
        double result = csc.calculate(Math.PI / 2);
        assertEquals(1, result, 1e-2);
    }

    @Test
    void testZero() {
        assertTrue(Double.isNaN(csc.calculate(0)));
    }
}