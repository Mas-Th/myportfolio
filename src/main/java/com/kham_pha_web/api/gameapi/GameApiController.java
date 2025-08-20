package com.kham_pha_web.api.gameapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/games")
public class GameApiController {

    @GetMapping(produces = "application/json")
    public List<GameDtoResponse> getGames() throws InterruptedException {
        // Tạo một danh sách các đối tượng Game
        List<GameDtoResponse> games = new ArrayList<>();

        TimeUnit.MILLISECONDS.sleep(100);
        // Thêm các đối tượng game vào danh sách
        games.add(new GameDtoResponse("1", "The Witcher 3", "RPG", 2015, 29.99, "CD Projekt Red"));
        games.add(new GameDtoResponse("2", "Cyberpunk 2077", "RPG", 2020, 59.99, "CD Projekt Red"));
        games.add(new GameDtoResponse("3", "Red Dead Redemption 2", "Action-Adventure", 2018, 49.99, "Rockstar Games"));
        games.add(new GameDtoResponse("4", "Grand Theft Auto V", "Action-Adventure", 2013, 29.99, "Rockstar Games"));
        games.add(new GameDtoResponse("5", "The Legend of Zelda: Breath of the Wild", "Action-Adventure", 2017, 59.99, "Nintendo"));
        games.add(new GameDtoResponse("6", "Elden Ring", "Action-RPG", 2022, 59.99, "Bandai Namco Entertainment"));
        games.add(new GameDtoResponse("7", "Minecraft", "Sandbox", 2011, 26.95, "Mojang Studios"));
        games.add(new GameDtoResponse("8", "Stardew Valley", "Simulation", 2016, 14.99, "ConcernedApe"));
        games.add(new GameDtoResponse("9", "Hades", "Roguelike", 2020, 24.99, "Supergiant Games"));
        games.add(new GameDtoResponse("10", "God of War", "Action-Adventure", 2018, 19.99, "Santa Monica Studio"));
        return games;
    }
}
