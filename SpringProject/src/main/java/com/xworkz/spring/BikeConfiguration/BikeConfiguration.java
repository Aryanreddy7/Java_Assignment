package com.xworkz.spring.BikeConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.spring")

public class BikeConfiguration {
    public BikeConfiguration() {
        System.out.println("Running BikeConfiguration const ");
    }
    @Bean
    public String run(){
        System.out.println("Running run in BikeConfiguration ");
        return  "String";

    }
}
