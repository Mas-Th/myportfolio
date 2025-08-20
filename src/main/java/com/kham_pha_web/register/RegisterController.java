package com.kham_pha_web.register;


import com.kham_pha_web.api.userapi.UserDtoRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;


@Controller
@RequestMapping("/register")
public class RegisterController {
    @GetMapping
    public String RegisterPage() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
        return "register/register";
    }

    @PostMapping
    @ResponseBody
    public String RegisterUser(
//            @RequestBody UserDtoRequest request
    ) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
        return "register success";
    }
}
