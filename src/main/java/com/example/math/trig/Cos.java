package com.example.math.trig;

import com.example.math.MathFunction;

public class Cos implements MathFunction {

    private final MathFunction sin;

    public Cos(MathFunction sin) {
        this.sin = sin;
    }

    @Override
    public double calculate(double x) {
        return sin.calculate(x + Math.PI / 2);
    }
}