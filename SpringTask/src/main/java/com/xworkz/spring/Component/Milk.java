package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Milk {
    public Milk() {
        System.out.println("Running milk constructor");
    }
    @RequestMapping("milk")
    public String run(){
        System.out.println("Running run in milk ");
        return  "/milk.jsp";
    }
}
