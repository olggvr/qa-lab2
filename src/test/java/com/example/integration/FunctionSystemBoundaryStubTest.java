package com.example.integration;

import com.example.stub.*;
import com.example.system.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionSystemBoundaryStubTest {

    @Test
    void testBoundary() {

        TrigExpression trig = new TrigExpression(
                new CotStub(),
                new CscStub(),
                new SecStub(),
                new CosStub()
        );

        LogExpression log = new LogExpression(
                new LnStub(),
                new Log2Stub(),
                new Log3Stub(),
                new Log5Stub(),
                new Log10Stub()
        );

        FunctionSystem system = new FunctionSystem(trig, log);

        double left = system.calculate(-0.0001);
        double right = system.calculate(0.0001);

        assertFalse(Double.isNaN(left));
        assertFalse(Double.isNaN(right));
    }
}