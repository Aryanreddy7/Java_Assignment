package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Soap {
    public Soap() {
        System.out.println("Running Soap constructor");
    }
    @RequestMapping("soap")
    public String run(){
        System.out.println("Running run in SoapConfiguration ");
        return  "/soap.jsp";
    }
}
