package com.example.integration;

import com.example.stub.*;
import com.example.system.TrigExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrigModulesIntegrationTest {

    @Test
    void testTrigModulesIntegration() {

        double x = -Math.PI / 2;

        CotStub cot = new CotStub();   // 0
        CscStub csc = new CscStub();   // -1
        SecStub sec = new SecStub();   // 1
        CosStub cos = new CosStub();   // 0

        TrigExpression trig = new TrigExpression(cot, csc, sec, cos);

        double result = trig.calculate(x);

        // можно даже точно проверить
        assertEquals(0.0, result, 1e-6);
    }
}