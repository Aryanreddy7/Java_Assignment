package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Chappal {
    public Chappal() {
        System.out.println("Running Chappal constructor");
    }
    @RequestMapping("chappal")
    public String run(@RequestParam String name, @RequestParam String type){
        System.out.println("Running Chappal in Shoe ");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/chappal.jsp";
    }
}
