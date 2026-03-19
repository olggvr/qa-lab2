package com.example.stub;

import java.util.Map;

public class SinStub extends TableStub {

    public SinStub() {
        super(Map.of(
                -Math.PI, 0.0,
                -Math.PI / 2, -1.0,
                0.0, 0.0,
                Math.PI / 2, 1.0
        ));
    }
}