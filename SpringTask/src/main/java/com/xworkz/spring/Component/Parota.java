package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Parota {
    public Parota() {
        System.out.println("Running Parota constructor");
    }
    @RequestMapping("parota")
    public String run(){
        System.out.println("Running run in Parota ");
        return  "/parota.jsp";
    }
}
