package com.example.stub;

import com.example.math.MathFunction;
import java.util.Map;

public abstract class TableStub implements MathFunction {

    protected final Map<Double, Double> table;

    public TableStub(Map<Double, Double> table) {
        this.table = table;
    }

    @Override
    public double calculate(double x) {
        return table.getOrDefault(x, Double.NaN);
    }
}