package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Shoe {
    public Shoe() {
        System.out.println("Running shoe constructor");
    }
    @RequestMapping("shoe")
    public String run(@RequestParam String name, @RequestParam String type){
        System.out.println("Running run in Shoe ");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/shoe.jsp";
    }
}
