package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Egg {
    public Egg() {
        System.out.println("Running Egg constructor");
    }
    @RequestMapping("egg")
    public String run(@RequestParam String name, @RequestParam String type){
        System.out.println("Running run in Egg ");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/egg.jsp";
    }
}
