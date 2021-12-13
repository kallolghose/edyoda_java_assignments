package com.edyoda.spring.annotations.spelpackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelComponent {

    @Value("${spel.component.value}")
    private Integer value;

    @Value("${website.company}")
    private String company;

    public Integer getValue() {
        return value;
    }

    public String getCompany() {
        return company;
    }
}
