package com.example.stub;

import java.util.Map;

public class CosStub extends TableStub {

    public CosStub() {
        super(Map.of(
                -Math.PI, -1.0,
                -Math.PI / 2, 0.0,
                0.0, 1.0,
                Math.PI / 2, 0.0
        ));
    }
}