package com.edyoda.spring.annotations.config;

import com.edyoda.spring.annotations.app.Nano;
import com.edyoda.spring.annotations.app.Vehicle;
import com.edyoda.spring.annotations.app.carmode.EcoMode;
import com.edyoda.spring.annotations.app.carmode.FamilyMode;
import com.edyoda.spring.annotations.app.carmode.Mode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:car.properties")
public class SpringConfigurationWithoutComponentAnnotation {

    @Bean
    public Mode familyMode(){
        return new FamilyMode();
    }

    @Bean
    public Mode ecoMode(){
        return new EcoMode();
    }

    @Bean
    public Vehicle nanoCar(){
        return new Nano();
    }

}
