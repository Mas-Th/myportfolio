package com.kham_pha_web.api.userapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/users")
public class UserApiController {
//    private final UserService userService;

    @GetMapping(produces = "application/json")
    public List<UserDtoResponse> getUsers() throws InterruptedException {
        List<UserDtoResponse> usersList = new ArrayList<>();

        TimeUnit.MILLISECONDS.sleep(100);

        // Thêm 10 người dùng vào danh sách
        usersList.add(new UserDtoResponse(1L, "player_one", "player_one@example.com", "2023-01-10", 150, 25));
        usersList.add(new UserDtoResponse(2L, "gamer_pro", "gamer_pro@example.com", "2023-02-20", 300, 50));
        usersList.add(new UserDtoResponse(3L, "ninja_stream", "ninja_stream@example.com", "2023-03-05", 210, 35));
        usersList.add(new UserDtoResponse(4L, "lucky_gamer", "lucky_gamer@example.com", "2023-04-12", 90, 18));
        usersList.add(new UserDtoResponse(5L, "master_chief", "master_chief@example.com", "2023-05-30", 500, 75));
        usersList.add(new UserDtoResponse(6L, "dark_knight", "dark_knight@example.com", "2023-06-18", 180, 28));
        usersList.add(new UserDtoResponse(7L, "queen_of_games", "queen_of_games@example.com", "2023-07-25", 275, 45));
        usersList.add(new UserDtoResponse(8L, "sonic_speed", "sonic_speed@example.com", "2023-08-01", 120, 20));
        usersList.add(new UserDtoResponse(9L, "ghost_hunter", "ghost_hunter@example.com", "2023-09-09", 450, 60));
        usersList.add(new UserDtoResponse(10L, "power_ranger", "power_ranger@example.com", "2023-10-15", 350, 55));

        return usersList;
    }



//    @Autowired
//    public UserApiController(UserService userService, UserService portfolioService) {
//        this.userService = userService;
//    }
//
//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> saveUserData(@RequestBody UserDtoRequest userDtoRequest) {
//        try {
//            Map<String, Object> data = new HashMap<>();
//            data.put("name", userDtoRequest.getName());
//            data.put("age", userDtoRequest.getAge());
//
//            // Gọi phương thức từ Service để lưu dữ liệu
//            userService.saveData("users", userDtoRequest.getId(), data);
//
//            return ResponseEntity.ok("User data saved successfully!");
//        } catch (ExecutionException | InterruptedException e) {
//            return ResponseEntity.status(500).body("Error saving data: " + e.getMessage());
//        }
//    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)

    public String createUser(@RequestBody UserDtoRequest request) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);

        return "Success connect Post";
    }
}