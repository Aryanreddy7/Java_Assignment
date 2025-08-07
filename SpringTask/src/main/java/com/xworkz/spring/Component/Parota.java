package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Parota {
    public Parota() {
        System.out.println("Running Parota constructor");
    }
    @RequestMapping("parota")
    public String run(@RequestParam String name, @RequestParam String type){
        System.out.println("Running run in Parota ");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/parota.jsp";
    }
}
