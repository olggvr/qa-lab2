package com.example.math.trig;

import com.example.math.MathFunction;

public class Sec implements MathFunction {

    private final MathFunction cos;

    public Sec(MathFunction cos) {
        this.cos = cos;
    }

    @Override
    public double calculate(double x) {
        double cosValue = cos.calculate(x);

        if (Math.abs(cosValue) < 1e-6) {
            return Double.NaN;
        }

        return 1 / cosValue;
    }
}