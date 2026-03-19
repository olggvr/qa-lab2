package com.example.system;

import com.example.math.base.Sin;
import com.example.math.trig.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrigExpressionTest {

    private final Sin sin = new Sin(1e-6);
    private final Cos cos = new Cos(sin);
    private final Cot cot = new Cot(sin, cos);
    private final Csc csc = new Csc(sin);
    private final Sec sec = new Sec(cos);

    private final TrigExpression trig =
            new TrigExpression(cot, csc, sec, cos);

    @Test
    void testNormalValue() {
        double result = trig.calculate(-1.0);
        assertFalse(Double.isNaN(result));
    }

    @Test
    void testZero() {
        assertTrue(Double.isNaN(trig.calculate(0)));
    }
}