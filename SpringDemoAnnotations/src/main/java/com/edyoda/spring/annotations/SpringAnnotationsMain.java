package com.edyoda.spring.annotations;

import com.edyoda.spring.annotations.app.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Vehicle vehicle = context.getBean("fordCar", Vehicle.class);
        System.out.println(vehicle.getEnginePower());
        System.out.println(vehicle.getTopSpeed());

        context.close();

    }

}
