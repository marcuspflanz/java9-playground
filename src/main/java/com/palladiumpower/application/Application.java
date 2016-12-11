package com.palladiumpower.application;

import com.palladiumpower.controller.GregorianCalendarController;
import com.palladiumpower.service.GregorianCalendarService;
import com.palladiumpower.service.MayanCalendarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackageClasses = {
                GregorianCalendarController.class,
                GregorianCalendarService.class,
                MayanCalendarService.class
        }
)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
