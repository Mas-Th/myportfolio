package com.kham_pha_web.api.gameapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games")
public class GameApiController {
    @GetMapping
    public String Games() {
        return "game";
    }
}
