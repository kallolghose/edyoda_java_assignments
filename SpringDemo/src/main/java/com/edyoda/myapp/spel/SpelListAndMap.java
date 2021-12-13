package com.edyoda.myapp.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelListAndMap {

    @Value("#{workersHolder.salaryByWorkers['John']}")
    private Integer johnSalary;

    public Integer getJohnSalary() {
        return johnSalary;
    }
}
