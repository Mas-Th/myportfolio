package com.kham_pha_web.news;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/news")

public class NewsController {
    @GetMapping
    public String News() {
        return "new/index";
    }

}
