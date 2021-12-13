package com.edyoda.myapp.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelExample {

    @Value("#{1 + 2}")
    private Integer add;

    @Value("#{anotherSpel.justAValue * 10}")
    private Integer multiplyFromAnotherBean;

    public Integer getAdd() {
        return add;
    }

    public Integer getMultiplyFromAnotherBean() {
        return multiplyFromAnotherBean;
    }
}
