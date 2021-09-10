package org.sts.test.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.sts.test.domain.BookVO;

@Controller
@Slf4j
public class SpringBootTestController {

    @GetMapping("hello")
    public String getHello(@RequestParam("title") String title){
        String result = "";

        System.out.println("title = " + title);
//        System.out.println("title : " + vo.getTitle());
//        System.out.println("author = " + vo.getAuthor());

        return "";
    }

    @GetMapping("hello2")
    public String getHello2(BookVO vo, Model model){
        String result = "";

        System.out.println("title : " + vo.getTitle());
        System.out.println("author = " + vo.getAuthor());

        model.addAttribute("title", vo.getTitle());
        model.addAttribute("author", vo.getAuthor());


        log.info("test");

        return "hello2";
    }
}

