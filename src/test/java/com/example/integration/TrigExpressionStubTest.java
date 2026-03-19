package com.example.integration;

import com.example.stub.*;
import com.example.system.TrigExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrigExpressionStubTest {

    @Test
    void testTrigExpressionStub() {

        CotStub cot = new CotStub();
        CscStub csc = new CscStub();
        SecStub sec = new SecStub();
        CosStub cos = new CosStub();

        TrigExpression trig =
                new TrigExpression(cot, csc, sec, cos);

        double x = Math.PI / 4;

        double result = trig.calculate(x);

        assertFalse(Double.isNaN(result));
    }
}