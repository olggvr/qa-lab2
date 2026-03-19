package com.example.integration;

import com.example.stub.*;
import com.example.system.TrigExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrigExpressionStubTest {

    @Test
    void testTrigExpressionStub() {

        double x = -Math.PI / 2;

        TrigExpression trig = new TrigExpression(
                new CotStub(),
                new CscStub(),
                new SecStub(),
                new CosStub()
        );

        double result = trig.calculate(x);

        assertFalse(Double.isNaN(result));
    }
}