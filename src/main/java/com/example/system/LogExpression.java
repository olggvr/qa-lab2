package com.example.system;

import com.example.math.MathFunction;

public class LogExpression implements MathFunction {

    private final MathFunction ln;
    private final MathFunction log2;
    private final MathFunction log3;
    private final MathFunction log5;
    private final MathFunction log10;

    public LogExpression(MathFunction ln,
                         MathFunction log2,
                         MathFunction log3,
                         MathFunction log5,
                         MathFunction log10) {
        this.ln = ln;
        this.log2 = log2;
        this.log3 = log3;
        this.log5 = log5;
        this.log10 = log10;
    }

    @Override
    public double calculate(double x) {

        if (x <= 0) return Double.NaN;

        double lnVal = ln.calculate(x);
        double log2Val = log2.calculate(x);
        double log3Val = log3.calculate(x);
        double log5Val = log5.calculate(x);
        double log10Val = log10.calculate(x);

        double part1 = (lnVal / log5Val) - (log3Val * lnVal);
        part1 = Math.pow(part1, 2) * Math.pow(log10Val, 2);

        double innerDenominator = (log5Val + log3Val);
        if (Math.abs(innerDenominator) < 1e-6) return Double.NaN;

        double inner = (log5Val + lnVal) / innerDenominator;

        if (Math.abs(inner) < 1e-6) return Double.NaN;

        double part2 = (Math.pow(log2Val, 2) / inner) + log10Val;

        if (Math.abs(part2) < 1e-6) return Double.NaN;

        return part1 / part2;
    }
}