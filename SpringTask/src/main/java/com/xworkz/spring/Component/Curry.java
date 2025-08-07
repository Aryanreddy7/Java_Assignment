package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Curry {
    public Curry() {
        System.out.println("Running curry constructor");
    }
    @RequestMapping("curry")
    public String run(@RequestParam String name, @RequestParam String type){
        System.out.println("Running run in currry ");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/curry.jsp";
    }
}
