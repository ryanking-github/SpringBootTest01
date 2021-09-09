package org.sts.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.sts.test.domain.BookVO;

@Controller
public class SpringBootTestController {

    @GetMapping("hello")
    public String getHello(@RequestParam("title") String title){
        String result = "";

        System.out.println("title = " + title);
//        System.out.println("title : " + vo.getTitle());
//        System.out.println("author = " + vo.getAuthor());

        return "";
    }
}

