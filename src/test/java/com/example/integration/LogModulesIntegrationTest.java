package com.example.integration;

import com.example.math.base.Ln;
import com.example.math.log.Log2;
import com.example.stub.*;
import com.example.system.LogExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogModulesIntegrationTest {

    @Test
    void testLogModulesIntegration() {

        double x = 2.0;

        Ln ln = new Ln(1e-6);         // 0.693
        Log2 log2 = new Log2(ln);   // 1
        Log3Stub log3 = new Log3Stub();   // 0.63
        Log5Stub log5 = new Log5Stub();   // 0.43
        Log10Stub log10 = new Log10Stub();// 0.3

        LogExpression log = new LogExpression(ln, log2, log3, log5, log10);

        double result = log.calculate(x);

        assertFalse(Double.isNaN(result));
    }
}