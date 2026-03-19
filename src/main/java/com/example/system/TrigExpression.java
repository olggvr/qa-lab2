package com.example.system;

import com.example.math.MathFunction;

public class TrigExpression implements MathFunction {

    private final MathFunction cot;
    private final MathFunction csc;
    private final MathFunction sec;
    private final MathFunction cos;

    public TrigExpression(MathFunction cot,
                          MathFunction csc,
                          MathFunction sec,
                          MathFunction cos) {
        this.cot = cot;
        this.csc = csc;
        this.sec = sec;
        this.cos = cos;
    }

    @Override
    public double calculate(double x) {

        double cotVal = cot.calculate(x);
        double cscVal = csc.calculate(x);
        double secVal = sec.calculate(x);
        double cosVal = cos.calculate(x);

        double numerator = (cotVal + cscVal) + (secVal - cotVal);
        double denominator = cotVal + secVal;

        if (Double.isNaN(denominator) || Math.abs(denominator) < 1e-6) {
            return Double.NaN;
        }

        double part1 = numerator / denominator;

        if (Double.isNaN(cscVal) || Math.abs(cscVal) < 1e-6) {
            return Double.NaN;
        }

        double part2 = cotVal / cscVal;

        return (part1 + part2) * cosVal;
    }
}