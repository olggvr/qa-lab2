package com.example.math.trig;

import com.example.math.base.Sin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CotTest {

    private final Sin sin = new Sin(1e-6);
    private final Cos cos = new Cos(sin);
    private final Cot cot = new Cot(sin, cos);

    @Test
    void testPiOver4() {
        double result = cot.calculate(Math.PI / 4);
        assertEquals(1, result, 1e-2);
    }

    @Test
    void testZero() {
        assertTrue(Double.isNaN(cot.calculate(0)));
    }
}