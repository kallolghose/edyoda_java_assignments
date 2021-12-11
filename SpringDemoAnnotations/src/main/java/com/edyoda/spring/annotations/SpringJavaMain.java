package com.edyoda.spring.annotations;

import com.edyoda.spring.annotations.app.Nano;
import com.edyoda.spring.annotations.app.Vehicle;
import com.edyoda.spring.annotations.config.SpringConfiguration;
import com.edyoda.spring.annotations.config.SpringConfigurationWithoutComponentAnnotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfigurationWithoutComponentAnnotation.class);

        Nano vehicle = context.getBean("nanoCar", Nano.class);
        System.out.println(vehicle.getEnginePower());
        System.out.println(vehicle.getTopSpeed());
        System.out.println(vehicle.getAdditionalDetails());
        context.close();
    }
}
