package com.kham_pha_web.api.userapi;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDtoLoginRequest {
    //    @NotBlank(message = "Username is required")
//    @Size(min = 4, max = 50, message = "Username must be between 4 and 50 characters")
    private String username;

    //    @NotBlank(message = "Password is required")
//    @Size(min = 6, max = 100, message = "Password must be between 6 and 100 characters")
    private String password;
}
