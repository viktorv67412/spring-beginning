package com;

import com.model.Auto;
import com.service.AutoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AutoTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        AutoService autoService = context.getBean("autoService", AutoService.class);
        List<Auto> autos = autoService.getAutos();

        for (Auto auto : autos){
            System.out.println(auto.getName() + " " + auto.maxPower() + " " + auto.getTorque() + " " + auto.getMaxSpeed());
        }
    }
}
