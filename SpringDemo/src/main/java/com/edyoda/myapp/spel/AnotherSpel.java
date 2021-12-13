package com.edyoda.myapp.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnotherSpel {

    @Value("#{1 + 1}")
    private Integer justAValue;

    public Integer getJustAValue() {
        return justAValue;
    }
}
