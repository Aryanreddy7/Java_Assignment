package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Biriyani {
    public Biriyani() {
        System.out.println("Running Biriyani constructor");
    }
    @RequestMapping("biriyani")
    public String run(){
        System.out.println("Running run in Biriyani ");
        return  "/biriyani.jsp";
    }
}
