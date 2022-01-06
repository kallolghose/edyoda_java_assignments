package com.ghoseka.aspect.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = {"com.ghoseka.aspect"})
public class AspectConfig {



}
