package com.edyoda.spring.annotations.spelpackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelExample {

    @Value("#{${spel.addition.example} + 10 + 20}")
    private Integer add;

    @Value("#{${spel.addition.example} div 20}")
    private Integer divide;

    @Value("#{${spel.relation.example} gt 100}")
    private Boolean greaterThan100;

    @Value("#{200 > 150 and 200 < 400}")
    private Boolean logicalOperation;

    @Value("#{spelComponent.value gt 1000}")
    private Boolean checkSpelComponentValueGt1000;

    @Value("#{spelComponent.company != null ? spelComponent.company : 'DEFAULT'}")
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public Boolean getCheckSpelComponentValueGt1000() {
        return checkSpelComponentValueGt1000;
    }

    public Integer getAdd() {
        return add;
    }

    public Integer getDivide() {
        return divide;
    }

    public Boolean getGreaterThan100() {
        return greaterThan100;
    }

    public Boolean getLogicalOperation() {
        return logicalOperation;
    }
}
