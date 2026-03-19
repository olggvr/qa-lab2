package com.example.stub;

import java.util.Map;

public class CotStub extends TableStub {

    public CotStub() {
        super(Map.of(
                -Math.PI / 4, -1.0,
                -Math.PI / 2, 0.0,
                Math.PI / 4, 1.0
        ));
    }
}