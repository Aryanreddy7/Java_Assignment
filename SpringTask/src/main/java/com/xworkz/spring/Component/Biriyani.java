package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Biriyani {
    public Biriyani() {
        System.out.println("Running Biriyani constructor");
    }
    @RequestMapping("biriyani")
    public String run(@RequestParam String name,@RequestParam String type){
        System.out.println("Running run in Biriyani ");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/biriyani.jsp";
    }
}
