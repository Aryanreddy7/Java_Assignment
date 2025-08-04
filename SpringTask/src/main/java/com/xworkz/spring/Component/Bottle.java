package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Bottle {
    public Bottle() {
        System.out.println("Running Bottle constructor");
    }
    @RequestMapping("bottle")
    public String run(){
        System.out.println("Running run in Bottle ");
        return  "/bottle.jsp";
    }
}
