package com.example.integration;

import com.example.stub.*;
import com.example.system.LogExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogExpressionStubTest {

    @Test
    void testLogExpressionStub() {

        double x = 2.0;

        LogExpression logExpr = new LogExpression(
                new LnStub(),
                new Log2Stub(),
                new Log3Stub(),
                new Log5Stub(),
                new Log10Stub()
        );

        double result = logExpr.calculate(x);

        assertFalse(Double.isNaN(result));
    }
}