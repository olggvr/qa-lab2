package com.example.math.log;

import com.example.math.MathFunction;

public class Log3 implements MathFunction {

    private final MathFunction ln;

    public Log3(MathFunction ln) {
        this.ln = ln;
    }

    @Override
    public double calculate(double x) {
        if (x <= 0) return Double.NaN;
        return ln.calculate(x) / ln.calculate(3);
    }
}