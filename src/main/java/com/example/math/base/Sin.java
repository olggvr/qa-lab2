package com.example.math.base;

import com.example.math.MathFunction;

public class Sin implements MathFunction {

    private final double eps;

    public Sin(double eps) {
        this.eps = eps;
    }

    @Override
    public double calculate(double x) {
        double term = x;
        double sum = 0;
        int n = 1;

        while (Math.abs(term) > eps) {
            sum += term;
            term *= -x * x / ((2 * n) * (2 * n + 1));
            n++;
        }

        return sum;
    }
}