package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Onion {
    public Onion() {
        System.out.println("Running onion constructor");
    }
    @RequestMapping("onion")
    public String run(@RequestParam String name, @RequestParam String type){
        System.out.println("Running run in onion ");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/onion.jsp";
    }
}
