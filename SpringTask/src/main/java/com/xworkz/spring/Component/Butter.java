package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Butter {
    public Butter() {
        System.out.println("Running butter constructor");
    }
    @RequestMapping("butter")
    public String run(){
        System.out.println("Running run in butter");
        return  "/butter.jsp";
    }
}
