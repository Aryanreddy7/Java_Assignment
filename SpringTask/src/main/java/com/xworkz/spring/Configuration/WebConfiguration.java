package com.xworkz.spring.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@ComponentScan(basePackages = "com.xworkz.spring")

public class WebConfiguration {
        public WebConfiguration() {
            System.out.println("Running WebConfiguration const ");
        }
}
