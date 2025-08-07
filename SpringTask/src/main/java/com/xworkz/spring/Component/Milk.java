package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Milk {
    public Milk() {
        System.out.println("Running milk constructor");
    }
    @RequestMapping("milk")
    public String run(@RequestParam String name, @RequestParam String type){
        System.out.println("Running run in milk ");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/milk.jsp";
    }
}
