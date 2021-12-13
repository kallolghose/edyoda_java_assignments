package com.edyoda.spring.annotations.spelpackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelListAndMap {

    @Value("#{workersHolder.salaryByWorkers['John']}")
    private Integer johnSalary;

    @Value("#{workersHolder.workers[0]}")
    private String firstWorker;

    public Integer getJohnSalary() {
        return johnSalary;
    }

    public String getFirstWorker() {
        return firstWorker;
    }
}
