package com.edyoda.myapp.config;

import com.edyoda.myapp.Coach;
import com.edyoda.myapp.SwimCoach;
import com.edyoda.myapp.service.FortuneService;
import com.edyoda.myapp.service.HappyFortuneServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfiguration {

    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneServiceImpl();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
