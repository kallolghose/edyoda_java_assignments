package com.edyoda.myapp.config;

import com.edyoda.myapp.mycomponents.Coach;
import com.edyoda.myapp.mycomponents.SwimCoach;
import com.edyoda.myapp.service.FortuneService;
import com.edyoda.myapp.service.HappyFortuneServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.edyoda.myapp"})
@PropertySource("classpath:sport.properties")
public class SportConfiguration {

}
