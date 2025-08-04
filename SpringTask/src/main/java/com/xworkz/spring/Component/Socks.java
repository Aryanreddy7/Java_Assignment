package com.xworkz.spring.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping("/")
public class Socks {
        public Socks() {
            System.out.println("Running Socks constructor");
        }
        @RequestMapping("socks")
        public String run(){
            System.out.println("Running run in Socks");
            return  "/socks.jsp";
        }
}
