package com.example.math.trig;

import com.example.math.MathFunction;

public class Csc implements MathFunction {

    private final MathFunction sin;

    public Csc(MathFunction sin) {
        this.sin = sin;
    }

    @Override
    public double calculate(double x) {
        double sinValue = sin.calculate(x);

        if (Math.abs(sinValue) < 1e-6) {
            return Double.NaN;
        }

        return 1 / sinValue;
    }
}