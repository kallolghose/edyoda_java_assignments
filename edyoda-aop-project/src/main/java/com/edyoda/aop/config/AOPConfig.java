package com.edyoda.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.edyoda.aop"})
@EnableAspectJAutoProxy
public class AOPConfig {

}
