package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Onion {
    public Onion() {
        System.out.println("Running onion constructor");
    }
    @RequestMapping("onion")
    public String run(){
        System.out.println("Running run in onion ");
        return  "/onion.jsp";
    }
}
