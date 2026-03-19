package com.example.system;

import com.example.math.base.Ln;
import com.example.math.log.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogExpressionTest {

    private final Ln ln = new Ln(1e-6);
    private final Log2 log2 = new Log2(ln);
    private final Log3 log3 = new Log3(ln);
    private final Log5 log5 = new Log5(ln);
    private final Log10 log10 = new Log10(ln);

    private final LogExpression logExpr =
            new LogExpression(ln, log2, log3, log5, log10);

    @Test
    void testNormalValue() {
        double result = logExpr.calculate(2);
        assertFalse(Double.isNaN(result));
    }

    @Test
    void testOne() {
        double result = logExpr.calculate(1);
        assertTrue(Double.isNaN(result));
    }

    @Test
    void testInvalid() {
        assertTrue(Double.isNaN(logExpr.calculate(0)));
    }
}