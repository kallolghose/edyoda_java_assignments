package com.edyoda.aspect.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.edyoda.aspect")
@EnableAspectJAutoProxy
public class AspectConfig {

}
