package com.prakhar.simplerestapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.prakhar.kela.servies"})
public class SpringBootRest2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRest2Application.class, args);
    }

}
