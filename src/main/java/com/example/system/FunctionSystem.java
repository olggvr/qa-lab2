package com.example.system;

import com.example.math.MathFunction;

public class FunctionSystem implements MathFunction {

    private final MathFunction trigExpression;
    private final MathFunction logExpression;

    public FunctionSystem(MathFunction trigExpression,
                          MathFunction logExpression) {
        this.trigExpression = trigExpression;
        this.logExpression = logExpression;
    }

    @Override
    public double calculate(double x) {
        if (x <= 0) {
            return trigExpression.calculate(x);
        } else {
            return logExpression.calculate(x);
        }
    }
}