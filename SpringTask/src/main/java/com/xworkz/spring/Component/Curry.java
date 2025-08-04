package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Curry {
    public Curry() {
        System.out.println("Running curry constructor");
    }
    @RequestMapping("curry")
    public String run(){
        System.out.println("Running run in currry ");
        return  "/curry.jsp";
    }
}
