package com.example.math.log;

import com.example.math.MathFunction;

public class Log10 implements MathFunction {

    private final MathFunction ln;

    public Log10(MathFunction ln) {
        this.ln = ln;
    }

    @Override
    public double calculate(double x) {
        if (x <= 0) return Double.NaN;
        return ln.calculate(x) / ln.calculate(10);
    }
}