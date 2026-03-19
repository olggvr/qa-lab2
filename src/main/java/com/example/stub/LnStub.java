package com.example.stub;

import java.util.Map;

public class LnStub extends TableStub {

    public LnStub() {
        super(Map.of(
                1.0, 0.0,
                Math.E, 1.0,
                2.0, 0.693,
                5.0, 1.609
        ));
    }
}