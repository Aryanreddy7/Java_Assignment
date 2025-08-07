package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Chutney {
    public Chutney() {
        System.out.println("Running Chutney constructor");
    }
    @RequestMapping("chutney")
    public String run(@RequestParam String name, @RequestParam String type){
        System.out.println("Running run in Chutney ");
        System.out.println("Name:"+name+" Type:"+type);
        return  "/chutney.jsp";
    }
}
