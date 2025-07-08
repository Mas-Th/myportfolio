package com.kham_pha_web.game;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/games")
public class GameController {
    @GetMapping
    public String GameController() {
        return "game/index";
    }
}
