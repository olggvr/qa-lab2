package com.example.integration;

import com.example.math.base.Sin;
import com.example.math.trig.Cos;
import com.example.math.trig.Cot;
import com.example.stub.*;
import com.example.system.TrigExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrigModulesIntegrationTest {

    @Test
    void testTrigModulesIntegration() {

        double x = -Math.PI / 2;

        Sin sin = new Sin(-Math.PI / 2);
        Cos cos = new Cos(sin); // 0

        Cot cot = new Cot(sin, cos);   // 0
        CscStub csc = new CscStub();   // -1
        SecStub sec = new SecStub();   // 1

        TrigExpression trig = new TrigExpression(cot, csc, sec, cos);

        double result = trig.calculate(x);

        // можно даже точно проверить
        assertEquals(0.0, result, 1e-6);
    }
}