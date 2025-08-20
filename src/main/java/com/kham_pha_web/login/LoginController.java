package com.kham_pha_web.login;

import com.kham_pha_web.api.userapi.UserDtoLoginRequest;
import com.kham_pha_web.api.userapi.UserDtoRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;


@Controller
@RequestMapping("/login")

public class LoginController {
    @GetMapping // defaul html
    public String LoginPage() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
        return "login/login";
    }

    @PostMapping
    @ResponseBody // add response body data (#html)
    public String LoginUser(
//            @RequestBody UserDtoLoginRequest request
    ) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
        return "check";
    }
}