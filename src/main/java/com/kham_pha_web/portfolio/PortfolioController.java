package com.kham_pha_web.portfolio;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortfolioController{

    @GetMapping
    public String Portfolio() {
        return "portfolio/index";
}}