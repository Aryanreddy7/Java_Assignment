package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Chappal {
    public Chappal() {
        System.out.println("Running Chappal constructor");
    }
    @RequestMapping("chappal")
    public String run(){
        System.out.println("Running Chappal in Shoe ");
        return  "/chappal.jsp";
    }
}
