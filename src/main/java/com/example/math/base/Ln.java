package com.example.math.base;

import com.example.math.MathFunction;

public class Ln implements MathFunction {

    private final double eps;

    public Ln(double eps) {
        this.eps = eps;
    }

    @Override
    public double calculate(double x) {
        if (x <= 0) return Double.NaN;

        double t = (x - 1) / (x + 1);
        double term = t;
        double sum = 0;
        int n = 0;

        while (Math.abs(term) > eps) {
            sum += term / (2 * n + 1);
            term *= t * t;
            n++;
        }

        return 2 * sum;
    }
}