package com.copilot.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.copilot"})
public class DemoCopilotSpringBootApplication {

    public static void main(String[] args) {
        System.out.println("Inside Copilot World!");
        SpringApplication.run(DemoCopilotSpringBootApplication.class, args);
    }

}
