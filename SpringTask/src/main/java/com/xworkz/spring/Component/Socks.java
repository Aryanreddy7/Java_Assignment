package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Socks {
        public Socks() {
            System.out.println("Running Socks constructor");
        }
        @RequestMapping("socks")
        public String run(@RequestParam String name, @RequestParam String type){
            System.out.println("Running run in Socks");
            System.out.println("Name:"+name+" Type:"+type);
            return  "/socks.jsp";
        }
}
