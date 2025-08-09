package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Soap {
    public Soap() {
        System.out.println("Running Soap constructor");
    }
    @RequestMapping("soap")
    public String run(@RequestParam String name, @RequestParam String type){
        System.out.println("Running run in SoapConfiguration ");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/soap.jsp";
    }
}
