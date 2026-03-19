package com.example.integration;

import com.example.stub.*;
import com.example.system.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionSystemStubTest {

    @Test
    void testSystemWithStubOnly() {

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

        double neg = system.calculate(-Math.PI / 4);
        double pos = system.calculate(2.0);

        assertFalse(Double.isNaN(neg));
        assertFalse(Double.isNaN(pos));
    }
}