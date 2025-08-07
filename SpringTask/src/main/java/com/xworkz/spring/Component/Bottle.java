package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Bottle {
    public Bottle() {
        System.out.println("Running Bottle constructor");
    }
    @RequestMapping("bottle")
    public String run(@RequestParam String name, @RequestParam String type){
        System.out.println("Running run in Bottle ");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/bottle.jsp";
    }
}
