package com.example.math.trig;

import com.example.math.MathFunction;

public class Cot implements MathFunction {

    private final MathFunction sin;
    private final MathFunction cos;

    public Cot(MathFunction sin, MathFunction cos) {
        this.sin = sin;
        this.cos = cos;
    }

    @Override
    public double calculate(double x) {
        double sinValue = sin.calculate(x);

        if (Math.abs(sinValue) < 1e-6) {
            return Double.NaN;
        }

        return cos.calculate(x) / sinValue;
    }
}