package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Chutney {
    public Chutney() {
        System.out.println("Running Chutney constructor");
    }
    @RequestMapping("chutney")
    public String run(){
        System.out.println("Running run in Chutney ");
        return  "/chutney.jsp";
    }
}
