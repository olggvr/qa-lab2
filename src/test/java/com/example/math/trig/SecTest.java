package com.example.math.trig;

import com.example.math.base.Sin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecTest {

    private final Sin sin = new Sin(1e-6);
    private final Cos cos = new Cos(sin);
    private final Sec sec = new Sec(cos);

    @Test
    void testZero() {
        double result = sec.calculate(0);
        assertEquals(1, result, 1e-2);
    }

    @Test
    void testPiOver2() {
        assertTrue(Double.isNaN(sec.calculate(Math.PI / 2)));
    }
}