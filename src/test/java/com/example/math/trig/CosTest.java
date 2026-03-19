package com.example.math.trig;

import com.example.math.base.Sin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CosTest {

    @Test
    void testZero() {
        Cos cos = new Cos(new Sin(1e-6));
        assertEquals(1, cos.calculate(0), 1e-3);
    }
}