package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Shoe {
    public Shoe() {
        System.out.println("Running shoe constructor");
    }
    @RequestMapping("shoe")
    public String run(){
        System.out.println("Running run in Shoe ");
        return  "/shoe.jsp";
    }
}
