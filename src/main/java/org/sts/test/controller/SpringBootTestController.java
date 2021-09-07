package org.sts.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringBootTestController {

    @GetMapping("/hello")
    public String getHello(){
        String result = "";

        return result;
    }
}

