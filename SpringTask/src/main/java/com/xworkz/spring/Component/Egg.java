package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Egg {
    public Egg() {
        System.out.println("Running Egg constructor");
    }
    @RequestMapping("egg")
    public String run(){
        System.out.println("Running run in Egg ");
        return  "/egg.jsp";
    }
}
