package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Butter {
    public Butter() {
        System.out.println("Running butter constructor");
    }
    @RequestMapping("butter")
    public String run(@RequestParam String name, @RequestParam String type){
        System.out.println("Running run in butter");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/butter.jsp";
    }
}
