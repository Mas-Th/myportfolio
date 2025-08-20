package com.kham_pha_web.portfolio;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.TimeUnit;


@Controller
@RequestMapping("/")
public class PortfolioController {
    @GetMapping
    public String Portfolio() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
        return "index";
    }
}

