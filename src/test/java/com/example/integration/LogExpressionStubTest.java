package com.example.integration;

import com.example.stub.*;
import com.example.system.LogExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogExpressionStubTest {

    @Test
    void testLogExpressionStub() {

        LnStub ln = new LnStub();
        Log2Stub log2 = new Log2Stub();
        Log3Stub log3 = new Log3Stub();
        Log5Stub log5 = new Log5Stub();
        Log10Stub log10 = new Log10Stub();

        LogExpression logExpr =
                new LogExpression(ln, log2, log3, log5, log10);

        double x = 2.0;

        double result = logExpr.calculate(x);

        assertFalse(Double.isNaN(result));
    }
}