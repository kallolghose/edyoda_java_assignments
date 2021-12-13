package com.edyoda.spring.annotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.edyoda.spring.annotations"})
@PropertySource("classpath:spel.properties")
public class SpringConfiguration {

}
